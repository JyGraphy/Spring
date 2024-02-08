package com.itbank.exception;

// 예외 상황을 규정하는 클래스이다


public class AgeOutOfBoundsException extends Exception {
	
	
	// 정수가 일정 범위를 벗어나면 발생하는 예외
	
	
	private static final long serialVersionUID = 1L;

	
	@Override
	public String getMessage() {
		return "100살부터는 신선이니라";
	}
	
	
}
