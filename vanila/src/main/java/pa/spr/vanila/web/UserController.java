package pa.spr.vanila.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pa.spr.vanila.model.User;
import pa.spr.vanila.repo.UserRepo;

@Controller
@RequestMapping("/usr")
public class UserController {
	@Autowired
	private UserRepo userrepo;

	@GetMapping(value = "/ls")
	public String usersList(Model model) {
		List<User> ls = new ArrayList<>();
		userrepo.findAll().forEach(ls::add);
		model.addAttribute("users", ls);
		return "mo/userlist";
	}

	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("usr", new User("", "", ""));
		return "mo/adduser";
	}

	@PostMapping("/add")
	public String greetingSubmit(@Valid @ModelAttribute User usr, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("usr", usr);
			List<String> ls = new ArrayList<>();
			br.getFieldErrors().forEach(x -> {
				if (x.getDefaultMessage().length() > 2)
					ls.add(x.getField() + " " + x.getDefaultMessage());
			});

			model.addAttribute("msg", ls);
			return "mo/adduser";
		}
		userrepo.save(usr);
		return "redirect:/usr/ls";
	}

	@GetMapping(value = "/edit")
	public String edituser(@RequestParam Integer id, Model model) {
		Optional<User> u = userrepo.findById(id);
		User usr = (u.isPresent() ? u.get() : null);
		model.addAttribute("usr", usr);
		return "mo/adduser";
	}

	@GetMapping(value = "/del")
	public String getUserforDel(@RequestParam Integer id, Model model) {
		Optional<User> u = userrepo.findById(id);
		User usr = (u.isPresent() ? u.get() : null);
		model.addAttribute("usr", usr);
		return "mo/deluser";
	}

	@PostMapping(value = "/del")
	public String deluser(@ModelAttribute User usr, Model model) {
		Optional<User> u = userrepo.findById(usr.getUser_id());
		 usr = (u.isPresent() ? u.get() : null);
		if (usr != null) {
			userrepo.delete(usr);
		} else {
			System.out.println("  Data not found for " +usr.getUser_id());
		}
		return "redirect:/usr/ls";

	}
	
	@ModelAttribute(name="roles")
	public List<String> getRoles(){
		List<String> roles = Arrays.asList("ADMIN", "USER", "DBA");
		return roles ;
	}

}
