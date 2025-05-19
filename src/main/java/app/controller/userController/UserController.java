package app.controller.userController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/userlogin")
	public String login()
	{
		return "user login";
	}
	@PostMapping("/usersignup")
	public String signup()
	{
		return "user signup";
	}
	@PostMapping("/forgotpassword")
	public String forgotPassword()
	{
		return "forgotpassword";
	}
}
