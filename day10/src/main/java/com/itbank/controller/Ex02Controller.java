package com.itbank.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex02Controller {

	
		private Random ran = new Random();
		private int n1;
		private int n2;
	
	// 일반적인 스프링 컨트롤 함수는  viewName을 반환해서, JSP로 포워딩 혹은 리다이렉트 하는것이 주 목적이다
		@GetMapping("/ex02")
		public ModelAndView ex02() {
			ModelAndView mav = new ModelAndView();
			n1 = ran.nextInt(10) + 1;
			n2 = ran.nextInt(10) + 1;
			
			mav.addObject("n1", n1);
			mav.addObject("n2", n2);
			return mav;
		}
		
		
		// AJAX요청에 대응하는 컨트롤러 함수는 기본자료형, 배열, 리스트 , DTO 등 여러 타입을 반환할 수 있다
		// 반환값이 viewName이 아니라, 응답 그 자체임을 명시해야 한다
		
		@GetMapping(value="/ex02Ajax", produces="application/json; chatset-utf-8")
		@ResponseBody		// jsp로 포워드 하는걸 방지
		public String ex02Ajax(int user) {
			int answer = n1 + n2;
			return (answer == user) ? "정답입니다" : "틀렸습니다";
		}
		
		
}
