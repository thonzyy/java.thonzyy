package day0703;


import java.util.Date;

public class UseDate {

	public UseDate() {
		
		Date date =new Date();
		System.out.println(date);
//		2. method로 일을 사용
//		System.out.println(date.getYear() );  비추천 method는 가급적
//		사용하지 않는다.
		//추상 클래스가 아니고 생성자가 있으면 객체화가 된다.
		
		

	}//UseDate
	
	//메시지와 주소의 차이에서 어떤 메소드를 만들어야할까?
	

	@Override
	public String toString() { 
	
		return "더 이상의 주소는 생략한다.";
	}

	public static void main(String[] args) {

		UseDate ud = new UseDate();

		
		System.out.println(ud.toString());

	}// main

}//class
