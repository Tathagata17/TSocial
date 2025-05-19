package app.controller.AdminController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/adminlogin")
	public String login()
	{
		return "admin login";
	}
	@GetMapping("/adminsignup")
	public String signup()
	{
		return "admin signup";
	}
}
