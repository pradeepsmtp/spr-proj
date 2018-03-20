package pa.spr.vanila.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/lab")
public class HWController {

	@GetMapping(value = "/hw")
	public String sayHello() {
		System.out.println(" HWT");
		return "hello";
	}

	@GetMapping(value = "/ps")
	public String getPerson(Model model) {
		System.out.println(" ps");

		Person ram = new Person("RAm", "10");
		Person soh = new Person("Sohill", "11");
		List<Person> ls = Arrays.asList(ram, soh);
		model.addAttribute("pers", ls);
		return "pers";
	}

	@GetMapping(value = "/psj", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Person> getPersonj(Model model) {
		System.out.println(" psj");

		Person ram = new Person("RAm", "10");
		Person soh = new Person("Sohill", "11");
		List<Person> ls = Arrays.asList(ram, soh);
		// model.addAttribute("pers", ls);
		return ls;
	}

	@GetMapping(value = "/str")
	@ResponseBody
	public String getStr(Model model) {
		System.out.println(" str");
		return "STRg";
	}
	


	class Person {
		String id;
		String name;

		Person(String nm, String id) {
			this.id = id;
			name = nm;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
