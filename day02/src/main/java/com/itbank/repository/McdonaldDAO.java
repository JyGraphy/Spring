package com.itbank.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.menu.McdonaldDTO;

@Repository
public interface McdonaldDAO {
	
	
	@Select("select * from mcdonald")
	ArrayList<McdonaldDTO> selectList();
	
	
	@Select("select * from mcdonald where category = #{category}")
	ArrayList<McdonaldDTO> categoryList(String category);



	
	@Select("select * from mcdonald where idx = #{idx}")
	McdonaldDTO selectOne(int idx);

	
	@Delete("delete from mcdonald where idx = #{idx}")
	int delete(int idx);

	
	@Insert("insert into mcdonald (category, name, price, imgName, memo) "
			+ "values (?, ?, ?, ?, ?)")
	int insert(McdonaldDTO dto);
	
	
	
	
	
}
