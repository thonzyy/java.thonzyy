package day0703;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;  //이름이 같고 패키지가 다르다면 둘 중 하나만 import받는다.

/**
 * import 연습
 * @author user
 */
public class TestImport {

	public static void main(String[] args) {
		//Date d; //TestImport클래스가 존재하는 패키지에 Date클래스가 없으므로 error
		java.sql.Date d=null;	//sql의 Date사용
		Date d2=null;	//util의 Date사용
		
		// import를 정의하지 않으면 full path로 처리할 수 있다.
		// full path : 클래스가 사용될 때마다 패키지를 명시하는 것. 패키지명.클래스명
		java.awt.List list=new java.awt.List();
		
		SimpleDateFormat sdf=null;
		DecimalFormat df=null;
		
		
	}//main

}//class
