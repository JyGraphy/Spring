package com.itbank.repository;

import java.sql.Date;

import org.apache.ibatis.annotations.Select;

// 기본생성자로 객체 생성 불가 - 인터페이스라서
public interface Test3DAO {
	
	// private SqlSessionTemplate sst;
	
	// 모든 메서드는 추상 메서드 
	// 함수의 바디에 내용 추가 불가능
	// 모든 멤버의 접근 제한다는 퍼블릭

	
	// sqlSessionTemplate을 직접 참조할때와 같이 xml mapper를 사용하는 방법
	// namespace: package + Interface Name (com.itbank.repository.Test3DAO)
	// id: 함수 이름 (selectBanner)
	String selectBanner();//{
	// return sst.selectOne("com.itbank.repository.Test3DAO.selectBanner");
	// }
	
	// 간단한 SQL은 어노테이션으로 처리하여 mapper도 생략할 수 있다
	@Select("select sysdate from dual")
	Date selectSysdate();

}
