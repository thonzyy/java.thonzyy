package day0621;

/**
 * 클래스가 실행되면 static 영역이 가장 처음 로드 된다.
 * 
 * @author user
 *
 */
public class TestClass {
	static int i;
	int j; // 인스턴스 변수(member변수) 만들어진 객체에 포함되는
	// 객체화 후 메모리에 생성 스태틱영역에서는 인스턴스변수 사용불가
	int k;// 같은 이름의 변수가 객체마다 생성

	public static void main(String[] args) {

		i = 10;
		System.out.println(i);
		// j=10;
		// 인스턴스 변수를 사용하려면 객체화를 한 후 사용해야한다.
		// class : 참조형 데이터형 : 같은 메모리의 다른 곳(heap)에 저장되고 그 시작 주소를 (stack)
		TestClass tc = new TestClass();
		TestClass tc2 = new TestClass();
		// 클래스명 객체명 = new 생성자;
		System.out.println(tc);
		System.out.println(tc2);

		System.out.println(args);

	}// main

}// class
