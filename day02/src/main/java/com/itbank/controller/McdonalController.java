package com.itbank.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.menu.McdonaldDTO;
import com.itbank.service.McdonalService;

@Controller
public class McdonalController {

	@Autowired private McdonalService ms;
	
	@GetMapping("/mcdonald")
	public ModelAndView mcdonaldList() {
		ModelAndView mav = new ModelAndView("mcdonald-list");
		ArrayList<McdonaldDTO> list = ms.getmemuList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/mcdonald/{category}")
	public ModelAndView categoryList(@PathVariable("category") String category) {
		ModelAndView mav = new ModelAndView("mcdonald-list");
		ArrayList<McdonaldDTO> list = ms.categoryList(category);
		mav.addObject("list", list);
		return mav;
	}
	
	 // @pathVariable - 주소에서 값을 가져올때 그 값에 맞는 자료형을 가져오기 위해 사용
	@GetMapping("/mcdonald/view/{idx}")
	public ModelAndView selectOne(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		McdonaldDTO dto = ms.selectOne(idx);
		    
		    // 조회 결과를 ModelAndView에 추가
			mav.addObject("dto", dto);
		    mav.addObject("idx", idx);
		return mav;
		
	}
	
	@GetMapping("/mcdonald/delete/{idx}")
	public ModelAndView delte(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("delte");
		int row = ms.delete(idx);
		String message = row != 0 ? "삭제" : "삭제 안됨";
		String url = "/mcdonald";
		
		mav.addObject("message", message);
		mav.addObject("url", url);
		return mav;
		
	}
	
	@PostMapping("/mcdonald/add")
	public ModelAndView menuAdd(McdonaldDTO dto) {
		ModelAndView mav = new ModelAndView("redirect:/mcdonald");
		int row = ms.add(dto);
		String message = row !=0 ? "추가" : "실패";
		String url = "/mcdonald";
		
		mav.addObject("message", message);
		mav.addObject("url", url);
		return mav;
	}
}
