package day0703;

import java.util.StringTokenizer;

public class UseStringTokenizer {

	public UseStringTokenizer() {
		String data = "java, Oracle, JDBC, HTML, CSS, JavaScript";

//		StringTokenizer stk = new StringTokenizer(data); // 공백으로 토큰 생성
		//StringTokenizer stk = new StringTokenizer(data, "Ja"); // 입력된 문자열로 토큰 생성 
		//토큰으로 구분된 문자열은 사라진다. 기준 문자열은 or 기능이 있다
		StringTokenizer stk = new StringTokenizer(data, "J a",false); //입력된 문자열로 토큰 생성
		// 기준 문자열을 보호 true - 기준 문자열 토큰으로 보호, false - 기준 문자열을 버림.
		System.out.println("토큰의 수 : " + stk.countTokens());
		stk.nextToken();

		String value = "";

		while (stk.hasMoreTokens()) { // 포인터가 있는 위치에 토큰이 있다면
			value = stk.nextToken(); // 토큰을 얻고 다음 토큰으로 포인터를 이동
			System.out.println(value);
		}

		System.out.println("토큰의 수 : " + stk.countTokens());

	}

	public static void main(String[] args) {

		UseStringTokenizer ust = new UseStringTokenizer();

	}// main

}// class
