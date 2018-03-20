package pa.spr.vanila.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping(value = "/super")
	@ResponseBody
	public String getSuper(Model model) {
		System.out.println(" super man 4 Admin only");
		return "I am super man,  visible by Admin only";
	}
}
