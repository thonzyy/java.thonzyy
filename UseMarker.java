package day0620;

/**
 * Marker 클래스를 객체로 생성하여 사용하는 일을 하는 클래스
 * @author user
 *
 */
public class UseMarker {

	public static void main(String[] args) {
		
		//마카펜 객체가 제공하는 기능을 사용하기 위해 객체화.
		//  클래스명 객체명 = new 클래스명
		//1. 객체 생성
		Marker black = new Marker ();
		//black 마카펜 객체에 "검은"색을 넣어주세요
		//black.color = "검은";
		//2. 객체가 제공하는 기능 사용
		//생성된 마카펜 객체에 값을 설정하는 일 setter method
		
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은"); 생성자로 할당함.
		
		//생성된 마카펜 객체가 가지고 있는 값을 얻는 일. getter method
		System.out.println("뚜껑의 수 : "+black.getCap()+", 몸체의 수 : "+black.getBody()+", 색 : "
				+black.getColor());
		
		String msg = black.write(" 잘하셨습니다.^-^"); // 호출 변수는 출력 연산 재할당
		System.out.println(msg);
				
		//빨간색 마카펜을 만들어서 내일은 수요일 입니다. 어쩔티비 저쩔티비 뇌절티비 출력
		Marker red = new Marker(1,2,"빨간"); //객체생성
	    //red.setColor("빨간"); //객체에 변수대입 , black -> red 심갈이

		System.out.println("뚜껑의 수"+red.getCap()+", 몸체의수" +red.getBody()+", 색 "+red.getColor());
		String msg1 = red.write(" 내일은 수요일입니다. 어쩔티비 저쩔티비 뇌절티비"); 
		System.out.println(msg1);
		//System.out.println(red.wirte("어쩔~저쩔~뇌절~"));
		

	}//main

}//class
