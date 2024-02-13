<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>day09</h1>
	<hr>
	
	<h3>JSON : JavaScript Object Notation</h3>
	<hr>
	
	<h3>자바 스크립트에서 객체를 표현하는데 사용하는 문법</h3>
	<fieldset>
		<legend>XML</legend>
		<pre>
			&lt;person>
				&lt;name> 이지은 &lt;/name>
				&lt;age> 31&lt;/age>
			&lt;/person>
		</pre>
	</fieldset>
	<br>
	<fieldset>
		<legend>JSON</legend>
		<pre>
				"person" : {
					"name" : "이지은",
					"age" : 31,
				}
		</pre>
	</fieldset>
	
	
	<script type="text/javascript">
		// 변수 선언 키워드 (자료형이 아님 그래서 문자열, 숫자 모두 넣을 수 있다)
		// 선언 키워드 없이도 선언이 가능 전역 변수로 선언이 가능하다
		t0 = 'Hello'
		var t1 = 'A'
		let t2 = 15
		const t3 = 3.2
		
		console.log(t1)
		console.log(t2)
		console.log(t3)
		
		// var는 함수 밖에서서 선언해도 함수내부에서 재선언 및 재할당이 가능
		// 변수 이름을 중복해서 사용하지 않는다면 이론적으로 큰 문제가 안됨
		// 매개변수 또한 중복 될 수 있기에 에러는 아니지만 버그가 쉽게 발생 될 수 있기에
		// 가급적 var은 사용 자제
		if (t2 > 10) {
			var t1 = 'Apple'
		}
		console.log(t1)
		
		// let : 재할당 가능
		// const : 재할당 불가 (상수화된 변수, 메모리 효일이 높다 )
		
		// typeof()을 사용하면 자료형에 대해서 알 수 있다
		console.log(typeof(t1)) // string
		console.log(typeof(t2)) // number
		console.log(typeof(t3)) // number
		console.log(typeof([])) // object (array)
		console.log(typeof({})) // object
		console.log(typeof(function(){})) // function, JS에서는 함수도 자료형이며 변수에 대입할 수 있다
										// 함수형 인터페이스에 람다식 사용 가능 함수는 1급 객체 매개변수로 선언이 가능하다
		// t4가 객체 형태로 취급 된다
		const t4 = {					// Map<String, Object>
				"name" : "이지은",
				"age" : 31
		}
		
		console.log(t4)
		console.log(t4.name)
		console.log(t4.age)
		
		// 자바스크립트 문법에서는 간략하게 나타낼 수도 있다
		// 단, JOSN 문법으로 나타내기위해서는 Key를 "로 묶어야 한다
		const t5 = {
				name : '홍진호',
				age : 41,
				show : function() { console.log(this.name + '님은' + this.age + '살입니다')}
		}
		
		console.log(t5)
		console.log(t5.name)
		console.log(t5.age)
		t5.show()
		
		// 자바스크립트의 객체를 JSON문법의 문자열로 변환하는 함수 및 되돌리기는 함수가 내장되어 있다
		const t6 = JSON.stringify(t4)	// 객체를 JSON문자열로 변환하는 함수    객체 -> 문자열
		const t7 = JSON.parse(t6)		// JSON 문자열을 객체로 변환하는 함수  문자열 -> 객체
		
		// t6는 string 타입
		// t7는 object 타입
		console.log(t6, typeof(t6))
		console.log(t7, typeof(t7))
		
	</script>
	
	<fieldset>
		<ul>
			<li><a href="ex01">ex01 - 부산 축제 정보 서비스</a></li>
			<li><a href="ex02">ex02 - 부산 축제 정보 서비스(AJAX)</a></li>
		</ul>
	</fieldset>
	
</body>
</html>