package pa.spr.vanila.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nonsec")
public class NonSecController {

	@GetMapping(value = "/str")
	@ResponseBody
	public String getStr(Model model) {
		System.out.println(" str");
		return "This is a NON secure STRg";
	}
	
	@GetMapping(value = "/land")
 	public String getLanding(Model model) {
		System.out.println(" str");
		return "land";
	}
}
