package com.itbank.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Ex01Service {
	// 공공 데이터 포털 , 부산 축제 정보
	
	// 일반 인증키 부분 복붙
	private final String serviceKey = "lb5GLIe6yJVGs0jq31H2vfnQuR20TvRX3iqBordGPDW2KOpaLHNHrIKmRHKdE23ugekDShzaolp0P7C0Zp%2BIFw%3D%3D";
	
	public String getFestivalJson() throws MalformedURLException, IOException {
		// 요청 주소는 물음표 앞까지
		// 요청 주소 및 파라미터 준비
		String url = "https://apis.data.go.kr/6260000/FestivalService/getFestivalKr";
		
		// 요청을 넣을 주소 작성
		// pageNo=1&numOfRows=10&resultType=json
		HashMap<String, String> param = new HashMap<>();
		param.put("pageNo", "1");
		param.put("numOfRows", "10");
		param.put("resultType", "json");		// xml로 받고 싶다면 이 구문은 삭제
		param.put("serviceKey", serviceKey);
		url += "?";
		for (String key : param.keySet()) {
			url += key + "=" + param.get(key) + "&";
		}
		
		// 요청을 전송하여 응답을 받아서 저장
		Scanner sc = null;
		String response = "";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		if (conn.getResponseCode() == 200) {	// 요청 코드 정상 실행 했을 때
			sc = new Scanner(conn.getInputStream());
			while (sc.hasNextLine()) {
				response += sc.nextLine();
			}
			sc.close();
			conn.disconnect();
		}
		
		
		
		return response;
	}
	
}
