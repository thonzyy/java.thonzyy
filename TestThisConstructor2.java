package day0621;

/**
 * 생성자에서 다른 생성자를 호출할 때 사용하는 this. - 생성자의 첫 번째 줄에서만 사용할 수 있다.
 * 
 * @author user
 *
 */
public class TestThisConstructor2 {
	public TestThisConstructor2() {
		System.out.println("기본생성자");
	}// TestThisConstructor2

	public TestThisConstructor2(int i) {
		System.out.println("i를 받는 생성자");
	}// TestThisConstructor2
	//매개변수 2개인 생성자는 기본생성자가 먼저 일을 한 후 그 다음으로 일을 해야한다.

	public TestThisConstructor2(int i, int j) {
		this();//객체는 하나만 생성되며, 다른 생성자를 호출하여 일을 수행한다.
		//this는 생성자의 첫 번째 줄에서만 사용가능.
		System.out.println("i와 j를 받는 생성자");
	}// TestThisConstructor2

	public static void main(String[] args) {
		 new TestThisConstructor2(1, 2); // 객체가 변수나 메소드로 사용하지 않음
		
 
	}// main

}// class
