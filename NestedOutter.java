package day0630;

/**
 * 중첩 클래스
 * 
 * @author user
 *
 */
public class NestedOutter {
	int out_i;
	static int out_j; // 스태틱 변수

	public void outInstanceMethod() {
		System.out.println("외부 클래스의 instance method");
	}

	public static void outStaticMethod() {
		System.out.println("외부 클래스의 Static method");
	}

/////////////static class 시작////////////////////////////
	// nested class 는 안쪽을 static으로 만든다.
	static class Inner {
		static int in_i; // *객체화 -> 생성자.*

		public static void inMethod() {
			// 외부클래스의 instance영역은 직접 접근할 수 없다.
	        // outInstanceMethod();
			outStaticMethod();
			// 외부 클래스의 static 변수나 method는 직접 접근이 가능
			System.out.println("내부 클래스의 Static method");
		}
	}// class
/////////////static class 끝////////////////////////////

	public static void main(String[] args) {
		// static영역은 객체화 하지 않음.
		Inner.in_i = 100;
		Inner.inMethod();

	}

}
