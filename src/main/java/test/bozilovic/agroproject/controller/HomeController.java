package test.bozilovic.agroproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.bozilovic.agroproject.model.User;
import test.bozilovic.agroproject.service.LoginService;
import test.bozilovic.agroproject.service.UserServiceImpl;

@Controller
public class HomeController {

	@Autowired
	UserServiceImpl service;

	@Autowired
	LoginService loginService;

	@GetMapping({ "", "/", "/login" })
	public String login() {
		return "login";
	}

	@PostMapping("/home")
	public String home(ModelMap model, @RequestParam String username, @RequestParam String password) {

		List<User> users = service.getAllUsers();
		User user = loginService.validateUsername(username, users);

		if (loginService.validatePassword(password, user)) {
			model.addAttribute("user", user);
			return "home";
		} else {
			model.addAttribute("message", "Invalid Password");
			return "login";
		}
	}

}
