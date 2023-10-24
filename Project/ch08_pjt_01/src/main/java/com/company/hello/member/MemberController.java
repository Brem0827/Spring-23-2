package com.company.hello.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/signUpConfirm")
	public String signUpConfirm(MemberVo memberVo) {
		System.out.println("[MemberController] signUpConfirm()");
		
		System.out.println("m_id: " + memberVo.getM_id());
		System.out.println("m_pw: " + memberVo.getM_pw());
		System.out.println("m_mail: " + memberVo.getM_mail());
		System.out.println("m_phone: " + memberVo.getM_phone());
		
		return null;
		
	}
	
	/*
	@RequestMapping("/signUpConfirm")
	public String singUpConfirm(
			@RequestParam String m_id,
			@RequestParam String m_pw,
			@RequestParam String m_mail,
			@RequestParam String m_phone
			) {
		System.out.println("[MemberController] signUpConfirm()");
		System.out.println("[MemberController] m_id: " + m_id);
		System.out.println("[MemberController] m_pw: " + m_pw);
		System.out.println("[MemberController] m_mail: " + m_mail);
		System.out.println("[MemberController] m_phone: " + m_phone);
		
		return null;
	}
	*/
}
