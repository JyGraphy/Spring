package com.itbank.service;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.itbank.repository.TestDAO;
//import com.itbank.repository.Test2DAO;
import com.itbank.repository.Test3DAO;

@Service
public class TestService {
	
//	@Autowired private TestDAO testDAO;					// jdbcTemplate
//	@Autowired private Test2DAO test2DAO;				// sqlSessionTemplate (myBatis)
	
	@Autowired private Test3DAO test3DAO;				// mapper auto injection (myBatis-spring)

	public String getDBVersion() {
		String version = test3DAO.selectBanner();
		return version;
	}

	public Date getSysdate() {
		Date date  = test3DAO.selectSysdate();
		return date;
	}
	
	

}
