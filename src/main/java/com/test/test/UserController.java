package com.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping(value = "/login")
	public String login() {
		// 로그인
		return null;
	}

	@PostMapping(value = "/regist")
	public String regist() {
		System.out.println("회원가입");
		// 회원가입
		return null;
	}
	
	// 로그인이 처리되어있어야 하는 기능

	@GetMapping(value = "/mypage")
	public String mypage() {
		System.out.println("마이페이지");
		
		// 마이페이지
		return null;
	}

	@PostMapping(value = "/modify")
	public String modify() {
		// 정보수정
		return null;
	}

	@GetMapping(value = "/remove")
	public String remove() {
		// 회원탈퇴
		return null;
	}

	@GetMapping(value = "/allUser")
	public String allUser() {
		// 전체회원조회
		return null;
	}

}