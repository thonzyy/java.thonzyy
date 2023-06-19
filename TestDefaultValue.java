package day0616;

/**
 * Instance variable나 static variable은 선언하면 기본값을 가진다.
 *
 * @author user
 *
 */
public class TestDefaultValue {
	//기본형 데이터형
	int a; // 정수형일 때 0이 기본값
	char b; //\u0000 - unicode 0
	double c; //0.0
	boolean d; //false
	//참조형 데이터형
	TestDefaultValue tdv;//class
	String s; // null
	int[] arr;//  null
	

	public static void main(String[] args) {
		//객체생성)인스턴스 변수가 생성된다. 초기값을 가진다.
		TestDefaultValue test=new TestDefaultValue();
		System.out.println("정수형 : "+test.a);//0
		System.out.println("문자형 : "+test.b);//\u0000 이 unicode에 대응되는 문자
		System.out.println("실수형 : "+test.c);//0.0
		System.out.println("불린형 : "+test.d);//false
		
		System.out.println("참조형-클래스 : "+test.tdv);//null
		System.out.println("참조형-String : "+test.s);//null
		System.out.println("참조형-array : "+test.arr);//null
		
		


	}//main

}//class
