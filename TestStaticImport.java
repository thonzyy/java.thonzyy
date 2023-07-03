package day0703;


import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;;
// import static java.lang.Long.MAX_VALUE; 같은 이름의 상수나 변수는 하나만


/**
 * static import : 다른 클래스의 static 변수, 상수 , static method를 클래스명 없이
 * 바로 사용할 때.
 * @author user
 *
 */
public class TestStaticImport {

	public static void main(String[] args) {
		System.out.println(MAX_VALUE);
		parseInt("10");
	System.out.println(parseInt("10"));
	System.out.println(parseInt("20"));
	System.out.println(parseInt("30"));
	System.out.println(parseInt("40")); //숫자로된 문자열을 정수형으로 받을 때

	}//main

}//class
