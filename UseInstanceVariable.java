package day0616;

/**
 * instance(member) variable의 사용
 * 특정 객체에 속해 있는(Member) 있는 변수
 *   같은 이름의 변수를 여러 객체에서 가지고 있다. 따로 사용.
 *   객체화 후 사용.
 * @author user
 *
 */
public class UseInstanceVariable {
	
	private int age;//instance 변수
	//private int time;
	
	
	public static void main(String[] args) { // main method static 영역
		//age=10; //static 영역에서는 instance변수를 직접 사용X.
		//2. 객체 생성)인스턴스 변수를 사용하기 위해서
		//클래스명 객체명 = new 클래스명();
		UseInstanceVariable uiv=new UseInstanceVariable();
		UseInstanceVariable uiv2=new UseInstanceVariable();
		
		//uiv객체가 가진 변수를 수정하면 uiv만 변경된다. 다른 객체에 영향을 주지 않는다.
		uiv.age=25;
		System.out.println("uiv.객체가 가진 age : "+uiv.age);
		System.out.println("uiv2.객체가 가진 age : "+uiv2.age);
		
	
	
	}//main

}//class
