package com.itbank.repository;

import java.sql.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Test2DAO {
	
	@Autowired private SqlSessionTemplate sst;
	// 연결시켜주기 위한
	
	public String selectBanner() {
//						sst.selectOne("namespace.id");
		String version = sst.selectOne("test2.selectVersion");
		return version;
	}

	public Date selectSysdate() {
		Date sysdate = sst.selectOne("test2selectSysdate");
		return sysdate;
	}
}
