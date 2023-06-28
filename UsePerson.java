package day0627;

/**
 * person 클래스를 생성하여 사용하는 일.
 * 
 * @author user
 *
 */
public class UsePerson {

	/**
	 * java application
	 * 
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// 객체 생성
		HongGilDong hgd = new HongGilDong();
		// 코드의 재사용성 : 부모의 method를 자식에서 자신의 것처럼 사용
		hgd.setName("홍길동"); // 이름을 부여
		System.out.printf("눈 : %d, 코 : %d , 입 : %d , 이름 : %s\n", hgd.getEye(), hgd.getNose(), hgd.getMouth(),
				hgd.getName());
		
		

		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨끈한 국밥", 40)); // 40푼
		// 부모가 제공하는 기능이 자식에서 안 맞음

		// 자신만의 특징
		System.out.println(hgd.fight(5)); // 6- > 7
		System.out.println(hgd.fight(6)); // 7 -> 8
		System.out.println(hgd.fight(8)); // 8
		// instance 변수는 객체ㅐ가 생성되고 사용되는 기간동안 계속 유지가 된다
		System.out.println(hgd.fight(9)); // 8 -> 7
		System.out.println(hgd.fight(7)); // 7

		
		Clark superman = new Clark();
		// 코드의 재사용성 : 부모의 method를 자식에서 자신의 것처럼 사
		// hgd.setName("홍길동");
		superman.setName("클락 켄트");
		System.out.printf("눈 : %d, 코 : %d , 입 : %d , 이름 : %s\n", superman.getEye(), superman.getNose(),
				superman.getMouth(), superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",10)); // 스테이크는 10불
		
		//자신만의 특징
		
		
		
		String stone = "크립토나이트";
		System.out.println(stone+"는"+superman.power(stone));
		
		stone="다이아몬드";
		System.out.println(stone+"는"+superman.power(stone));
		
		stone="짱똘";
		System.out.println(stone+"은"+superman.power(stone));
		
		Dongwon dw = new Dongwon();
		dw.setName("이동원");
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n", dw.getEye(),dw.getNose(),dw.getMouth(),dw.getName());
		
		System.out.println(dw.getName()+"은 수영 "+dw.swim(70)+"입니다");
		
	}// main

}// class
