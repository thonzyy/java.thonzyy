package day0616;

/**
 * static (class) variable의 사용. (객체화 없이 클래스명.변수명으로 클래스의 모든 영역에서 사용 할 수 있는 변수이다.
 * 1. 선언) 자동초기화<br>
 * 접근지정자 static 데이터형 변수명;
 * 2. 값할당)<br>
 * 클래스명.변수명=값;
 * 3. 값사용)
 * 클래스명.변수명
 * @author user
 *
 */

public class UseStaticVariable {
	//class field : 변수선언, method 정의만 기술할 수 있다.
	//1.선언) - 하나만 생성 사용된다. 값을 변경하면 변경된 값을 계속 사용하게 된다.
	
	public static int age;
	static int year;
	public void test() { //static이 붙어있지 않은 instance 영역에서도 사용가능
		age=30;
		System.out.println( age +" / "+year);
		
	}
	
	
	

	public static void main(String[] args) {
		//영역이 달라도 사용가능
		UseStaticVariable usv=new UseStaticVariable();
		usv.test();
		//2. 값 할당
		//UseStaticVariable.age=10;
		//year=2023;
		//3. 값 사용
		System.out.println("나이 : "+ age +" 올해 : "+UseStaticVariable.year);
		
		//공용의 특징 (모든 객체가 하나의 변수를 사용)
		//클래스명 객체명 =new 클래스명();
		UseStaticVariable usv2=new UseStaticVariable();
		UseStaticVariable usv3=new UseStaticVariable();
		
		
		//usv2 객체와 usv3객체를 같은 static 변수를 사용한다.
		// 야! 니네 집전화번호 뭐야? 답) 
		//우리집 전화번호는(올바른 표현), 내집전화는 (올바른 표현은 x)
		// static 변수는 특정 객체에 속해있는 변수가 아니다. 객체명. 변수명ㄴ
		usv2.year=2024; //특정 객체 usv2의 year변수를 값변경 했는데
		System.out.println("usv2.객체의 year : "+usv2.year);
		System.out.println("usv3.객체의 year : "+usv2.year);//usv3까지 함께 변경된다.
		
		
		

	}//main

}//class
