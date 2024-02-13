package com.itbank.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.service.Ex01Service;

@Controller
public class Ex01Controller {

	
	@Autowired private Ex01Service service;
	private ObjectMapper objectMapper = new ObjectMapper();
	
	
	@GetMapping("/ex01/js")
	public ModelAndView ex01js() throws MalformedURLException, IOException {
		ModelAndView mav = ex01();
		mav.setViewName("ex01-js");
		return mav;
	}
	
	
	
	
	@GetMapping("/ex01")
	public ModelAndView ex01() throws MalformedURLException, IOException {
		ModelAndView mav = new ModelAndView();
		
		String json = service.getFestivalJson();		// JSON 데이터는 문자열이다
		mav.addObject("json", json);
		System.out.println(json);
		
		// JSON 형식의 문자열을 자바 객체로 변환하기 위한 코드가 필요
		
		JsonNode node = objectMapper.readTree(json);
		JsonNode item = node.get("getFestivalKr").get("item"); 	// 트리구조이기 때문에 위에서부터 가져오고 싶은 부분을 찾아서 구문 작성
		System.out.println("item : " + item.toPrettyString());
		
		// DTO로 맵핑하기 (필드이름이 복잡하여 제대로 맵핑되지 않았다)
//		List<FestivalDTO> list = Arrays.asList(objectMapper.readValue(item.toPrettyString(), FestivalDTO[].class));
//		System.out.println(list.get(0).getMain_TITLE());
		
		// HashMap로 맵핑하기
		@SuppressWarnings("unchecked")
		List<HashMap<String, Object>> list = Arrays.asList(objectMapper.readValue(item.toPrettyString(), HashMap[].class));
		System.out.println(list.get(0).get("MAIN_TITLE"));
		
		mav.addObject("list", list);
		
		return mav;
	}
	
}
