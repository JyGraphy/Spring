package com.itbank.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class HomeController {
	
	@Autowired private TestService testService;
	
	// MVC 패턴에서 JSP를 향한 forward를 기본으로 사용하기 때문에
	// 요청 주소와 JSP의 이름은  분리해서 생각해야한다
	
	
	
	
	@GetMapping("/")										// 만약, "/" 경로로 GET 요청을 받으면
	public ModelAndView home() {							// home() 함수를 실행하고
		ModelAndView mav = new ModelAndView("home");		// viewName을 "home"으로 설정한다
//		mav.setViewName("home");
		
		
		String version = testService.getDBVersion();
//		SELECT SYSDATE from dual;
		Date sysdate = testService.getSysdate();
		mav.addObject("sysdate", sysdate);
		
		mav.addObject("version", version);
		
		
		
		return mav;
	}
	
}
