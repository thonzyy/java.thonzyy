package day0620;

/**
 * 생성자연습
 * -객체가 생성될 떄 기본적으로 가지고 있어야할 값이 코드를 정의하는 method일종
 * - 개발자가 생성자를 하나도 정의하지 않으면 컴파일러가 기본 생성자를 생성해준다.
 * - 생성자는 new(객체생성용 키워드)에 의해서만 호출된다.
 * @author user
 *
 */
public class TestConstructor {
	
	public TestConstructor() { //셍성자는 메소드의 일종
		System.out.println("기본생성자");
		
	}
	public TestConstructor(int i) {
		System.out.println("매개변수 있는생성자");
	    test(); //method는 같은 영역에서는 직접 호출 가능
	   // TestConstructor(); new를 이용해서 생성자를 호출. 객체를 만듦 
	    //생성자는 직접 호출되지 않는다.
	}
	public void test() {
		System.out.println("test method");
	   
	}
	// 
   
	


	/**
	 * 생성자의 OverLoad
	 * @author user
	 *
	 */
	public static void main(String[] args) {
		//객체화     참조형 데이터를 사용하기 위해.
		//문법) 클래스명 객체명 = new 생성자();
		TestConstructor tc = new TestConstructor();//기본생성자를 사용한 객체화
		TestConstructor tc2 =new TestConstructor(2023);//매개변수 있는 생성자를 사용한 객체화
		

	}//main

}//class
