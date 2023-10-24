package com.company.hello.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/signUp")
	public String singUp() {
		return "sign_Up";
	}
	
	@RequestMapping("/signIn")
	public String singIn() {
		return "sign_In";
	}
}
