package day0630;

import day0629.HongGilDong;

public class Anonymous {
	
	public void useHongGilDong ( HongGilDong hgd ) {
		System.out.println(hgd.fight(6));
		System.out.println(hgd.fight(8));
		System.out.println(hgd.fight(5));
	}
	
	public void useTest(Test t) {
		t.test();
	}

	public static void main(String[] args) {
		
		Anonymous an = new Anonymous();
		//method를 호출하기 위해서 HongGilDong 클래스가 만들어져야한다.
		HongGilDong hgd=new HongGilDong();
		
		an.useHongGilDong(hgd);
		
		//매개변수가 참조형데이터형인 경우  (class나 interface) 에는
		//1. 매개변수에 해당하는 클래스를 작성한다.
		//2. 객체를 생성
		TestImpl ti = new TestImpl ();
		//3.method 호출 객체를 할당.
		an.useTest(ti);
		
		//anonymous inner class 생성 => 클래스파일을 별도로 생성할 필요가 없다.
		an.useTest(new Test() {
			@Override
			public void test() {
				System.out.println("Override method");
			} // test
		});
	
	}

}
