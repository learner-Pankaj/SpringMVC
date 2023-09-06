package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Contact is running");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("uname") String name, @RequestParam("umail") String email,
			@RequestParam("upwd") String password, Model model) {
		
		System.out.println("User Name : "+name);
		System.out.println("User Email : "+email);
		System.out.println("User Password : "+password);
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		return "success";
	}
}
