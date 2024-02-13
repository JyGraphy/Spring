package com.itbank.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// JSON 데이터에서 DTO에 명시되지 않은 속성(알수없는 속성)은 무시하겠다
// JSON의 속성이름을 자바 네이밍 컨벤션 (camelCase)으로 변환하는 과정이 맞아야한다
@JsonIgnoreProperties(ignoreUnknown = true)
public class FestivalDTO {
	
//	@JsonProperty("UC_SEQ")private int uc_SEQ;
// 이 방식으로도 작성이 가능하지만 불러오는 파일이 많아 질수록 불편해진다
	
	private int uc_SEQ;
	private String main_TITLE;
	private String gugun_NM;
	private String homepage_URL;
	private String main_IMG_NORMAL;
	private String itemcntnts;
	public int getUc_SEQ() {
		return uc_SEQ;
	}
	public void setUc_SEQ(int uc_SEQ) {
		this.uc_SEQ = uc_SEQ;
	}
	public String getMain_TITLE() {
		return main_TITLE;
	}
	public void setMain_TITLE(String main_TITLE) {
		this.main_TITLE = main_TITLE;
	}
	public String getGugun_NM() {
		return gugun_NM;
	}
	public void setGugun_NM(String gugun_NM) {
		this.gugun_NM = gugun_NM;
	}
	public String getHomepage_URL() {
		return homepage_URL;
	}
	public void setHomepage_URL(String homepage_URL) {
		this.homepage_URL = homepage_URL;
	}
	public String getMain_IMG_NORMAL() {
		return main_IMG_NORMAL;
	}
	public void setMain_IMG_NORMAL(String main_IMG_NORMAL) {
		this.main_IMG_NORMAL = main_IMG_NORMAL;
	}
	public String getItemcntnts() {
		return itemcntnts;
	}
	public void setItemcntnts(String itemcntnts) {
		this.itemcntnts = itemcntnts;
	}
	
	
	
	
	
	
	
}
