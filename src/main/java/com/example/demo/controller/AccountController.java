package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.AccountService;
import com.example.demo.vo.AccountVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("account/")
public class AccountController {
	
	@Autowired
	private AccountService as;

	@GetMapping("SignUp")
	public void SignUp() {}
	
	@PostMapping("SignUp")
	public String SignUp(AccountVO input) {
		
		as.addAccount(input);
		
		return "redirect:/account/Login";
	}
	
	@GetMapping("Login")
	public void Login() {}
	
	@PostMapping("Login")
	public String Login(AccountVO input,HttpSession session) {
		
		session.setAttribute("user", as.selectOne(input));
		
		return "redirect:/";
	}
	@GetMapping("Logout")
	public String Logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	@GetMapping("MyPage")
	public void MyPage() {}
}
