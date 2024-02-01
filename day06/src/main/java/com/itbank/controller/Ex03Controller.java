package com.itbank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itbank.model.Upload1DTO;
import com.itbank.service.UploadService;

@Controller
@RequestMapping("/ex03")
public class Ex03Controller {
	
	@Autowired private UploadService service;
	
	// GET, POST 메서드를 구분하고 싶다면 <view-controller> 태크를 쓸 수 없다
	
	
	// 처음 생성시 바로 ModelAndView를 작성하지 말고 void로 하여 등록만 되는지 확인 후 
	// 등록인 완료 된다면 그때 ModelAndView를 사용해서 작성한다
	
	@GetMapping
	public ModelAndView ex03() {
		ModelAndView mav = new ModelAndView();
		List<Upload1DTO> list = service.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@PostMapping
	public String ex03(Upload1DTO dto) {
		int row = service.upload(dto);
		System.out.println(row != 0 ? "등록성공" : "등록실패");
		return "redirect:/ex03"; // 다시 ex03.jsp로 이동
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx, RedirectAttributes rttr) {
		int row = service.delete(idx);
		rttr.addFlashAttribute("msg", row != 0 ? "삭제성공" : "삭제실패");
		// -> ex03.jsp (스크립트 구문 실행) jsp에서 사용하는 msg와 addFlashAttribute의 msg가 같아야 한다
//		System.out.println(row != 0 ? "삭제성공" : "삭제실패");
		return "redirect:/ex03";
	}
	
	
	
	
	
}
