package com.itbank.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.menu.McdonaldDTO;
import com.itbank.repository.McdonaldDAO;

@Service
public class McdonalService {

	@Autowired private McdonaldDAO dao;

	public ArrayList<McdonaldDTO> getmemuList() {
		ArrayList<McdonaldDTO> list = dao.selectList();
		return list;
	}
	
	
	

	public ArrayList<McdonaldDTO> categoryList(String category) {
		ArrayList<McdonaldDTO> list = dao.categoryList(category);
		return list;
	}




	public McdonaldDTO selectOne(int idx) {
		return dao.selectOne(idx);
		
	}




	public int delete(int idx) {
		int row = dao.delete(idx);
		return row;
	}




	public int add(McdonaldDTO dto) {
		int row = dao.insert(dto);
		return row;
	}












	
	
	
}
