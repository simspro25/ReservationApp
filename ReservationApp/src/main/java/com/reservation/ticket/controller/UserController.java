package com.reservation.ticket.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.reservation.ticket.entities.User;
import com.reservation.ticket.service.UserService;
import com.reservation.ticket.util.EmailUtil;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private EmailUtil emailUtil;

	@RequestMapping("/showPage")
	public String displayUserPage() {
		return "register-user";
	}

	@RequestMapping("/saveUser")
	public String newUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		User savedUser = service.saveUser(user);
		String msg = "user saved with the id:" + savedUser.getId();

		modelMap.addAttribute("message", msg);
		emailUtil.sendEmail(user.getEmail(), "UserApp Mail", "your information has been stored successfully");
		return "user-login";
	}

	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = service.findByEmail(email);

		if (user.getPassword().equals(password)) {

			return "find-flight";

		} else {
			modelMap.addAttribute("message", "Invalid credentials");

		}
		return "user-login";
	}


	}
