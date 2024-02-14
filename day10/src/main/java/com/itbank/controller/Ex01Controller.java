package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {

	
	// 일반적인 스프링 컨트롤 함수는  viewName을 반환해서, JSP로 포워딩 혹은 리다이렉트 하는것이 주 목적이다
		@GetMapping("/ex01")
		public void ex01() {
		}
		
		
//		// AJAX요청에 대응하는 컨트롤러 함수는 기본자료형, 배열, 리스트 , DTO 등 여러 타입을 반환할 수 있다
//		// 반환값이 viewName이 아니라, 응답 그 자체임을 명시해야 한다
//		
//		@GetMapping("ex01Ajax")
//		@ResponseBody
//		public int ex01Ajax(int n1, int n2) {
//			return n1 + n2;
//		}
		
		
}
