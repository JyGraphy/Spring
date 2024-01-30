package com.itbank.repository;

import java.util.List;

import com.itbank.model.BoardDTO;


public interface BoardDAO {
	
	List<BoardDTO> selectList();
	
	BoardDTO selectOne(int idx);
	// BoardDTO = resultType
	// int idx = parameterType
	// selectOne = id
	
	// <select id = "selectOne" parameterType="int" resultType="board">
	// select * from board where idx = #{idx}
	// <select>
	
	
	int insert(BoardDTO dto);

	int delete(int idx);
}
