package day0614;
/**
 * 일치하는 정수를 비교할 때 사용하는 switch~case
 * @author user
 *
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		int i = 1;
		//break; //swtich~case,for,while문 안에서만 사용가능.
		// 실행을 멈추고 빠져나갈 때 사용
		switch (i) {     // 일치하는 case를 찾고, 순차적인 흐름을 가진다.
		case 0: System.out.println("영");
		case 1: System.out.println("일");
		case 2: System.out.println("이");break;  //필요에 따라 입력
		case 3: System.out.println("삼");
		default:System.out.println("해당 case 없음");	
		}//end switch
		int key='A';
		//case의 상수는 입력되는 데이터형의 범위까지만 사용할 수 있다.
		switch (key) {//byte,short,int,char를 받을 수 있다. (추후 string 가능)
		case 65:System.out.println("값0");	break;
		case 1:System.out.println("값1");	break;
		case 2:System.out.println("값2");	break;
		default:System.out.println("해당 case 없음");	
		}//end switch
		
		String s="Oracle"; // Java Compilerr가 OpenJDK1.7이상부터 가능
		switch (s) {
		case "Java":System.out.println("WORA를 지원하는 완벽한 OOP언어");	break;
		case "Oracle":System.out.println("대용량 DBMS");	break;
		}//end switch

	}//main

}//class
