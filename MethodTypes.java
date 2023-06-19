package day0616;

/**
 * method의 4가지 형태
 * 
 * @author user 반환값 없고 매개변수 없는 형 -> 인스턴스 메소드*** 1. 객체화
 */
public class MethodTypes {
	public void typeA() {
		System.out.println("고정적인 일");
	}// type A

	/*
	 * 반환값 없고, 매개변수 있는 형 - 가변적인 일
	 */
	public void typeB(int i) {
		System.out.println("가변적인 일" + i);
	}// type B

	/**
	 * 반환형 있고, 매개변수 없는 형 - 고정값
	 * 
	 * @return
	 */
	public int typeC() {
		int i = 6;
		return i * 2;
		// return 6;
	}
	/**
	 * 반환형 있고, 매개변수 있는 형 - 가변 값
	 * @param d 입력값
	 * @return 반환값
	 */
	public int typeD(double d) {
		return (int) d;
	}

	public static void main(String[] args) {
		// 객체화 : 클래스명 객체명=new 클래스명();***
		MethodTypes mt = new MethodTypes();
		for (int i = 0; i < 10; i++) {
			mt.typeA();
			mt.typeB(i);
		}

	 	int i = mt.typeC(); //변수에 할당 가능
	 	System.out.println("고정값"+i);
	 	System.out.println("고정값"+(mt.typeC()+5)); //연산에 참여가능
	 	
	 	i=mt.typeD(6.16);
	 	System.out.println("가변값 : "+i);
	 	System.out.println("가변값 : "+mt.typeD(2023.6));

	}//main

}//class
