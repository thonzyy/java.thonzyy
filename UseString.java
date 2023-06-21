package day0621;

/**
 * 문자열 : 문자열은 문자열 저장소에 유일하게 하나만 생성된다.
 * 문자열을 저장하기 위해 자바에서는 java.lang.String class를 제공한다.
 * java.lang.String 클래스는 자바에서 유일하게 기본형의 문법으로 사용할 수 있는
 * 클래스이다.
 * 사용법)
 * 기본형 형식) new를 사용하지 않습니다.
 * String str = "값";
 * 참조형 형식) new를 사용합니다.
 * String str1 = new string("값");
 * @author user
 *
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식) 문자열 저장소의 주소를 바로 저장
		String str = "ABCDE";
		//참조형 형식) 힙의 주소를 저장하고 힙에서 문자열 저장소의 주소를 저장.
		String str1=new String("ABCDE");
		
		System.out.println(str+" / "+str1);
		//==을 사용하여 참조형 데이터형을 비교하면 주소가 같은지 비교한다.
		if (str == "ABCDE") {
			System.out.println("기본형 주소 같음");
		} else {
			System.out.println("기본형 주소 다름");
			
		}
		if (str1== "ABCDE") {
			System.out.println("참조형 주소 같음");
		} else {
			System.out.println("참조형 주소 다름");
			
		}//end else
		//생성하는 문법에 따라 ==은 다른 결과를 보여준다.
		
		System.out.println("----------------------");
		if (str.equals("ABCDE")) {
			System.out.println("기본형 equals 같음");
		} else {
			System.out.println("기본형 equals 다름");
		}
		if (str1.equals("ABCDE")) {
			System.out.println("참조형 equals 같음");
		} else {
			System.out.println("참조형 equals 다름");
		}//end else
		//equals method 는 String의 생성방법과 상관없이 동일한 비교를 수행.
	    String mail=new String ("tuna5127@icloud.com");
	    
	    System.out.println(str+"의 글자수는"+ str.length());
	    
	    int Mailleng=mail.length();
	    
	    System.out.println(mail+"의 글자수는"+ Mailleng);
	    
	    System.out.println(str+"을 모두 소문자로"+str.toLowerCase());
	    
	    String upperCase=str.toUpperCase();
	    System.out.println(str+"을 모두 대문자로"+str.toUpperCase());
	    
	    
	    
	    System.out.println(str+"에서 'D'의 인덱스"+str.indexOf("D"));
	    System.out.println(str+"에서 \"BCD\"의 인덱스"+str.indexOf("BCD"));
	    System.out.println(str+"에서 F의 인덱스"+str.indexOf("F"));
	    
	    String name="강다영";
	    if (name.indexOf("강")==0) {
	    	System.out.println("김씨입니다.");
	    }else {
	    	System.out.println("김씨아님");
	    	
	    }//end if
	    
	    str="java";
	    //indexOf는 왼쪽에서 부터 오른쪽으로 진행하면서 일치하는
	    //문자열의 시작인덱스를 얻는다.
	    //처음 a
	    System.out.println(str+"a의 인덱스 "+str.indexOf("a"));
	    //마지막 a
	    System.out.println(str+"a의 인덱스 "+str.lastIndexOf("a"));
	    //두번쨰 a
	    System.out.println(str+"a의 인덱스 "+str.indexOf("a",str.indexOf("a")+1));
	    
	    str="AbcdeF";
	    System.out.println(str+"에서 3번째 인텍스의 문자"+ str.charAt(3));
	    
	    char c=str.charAt(1);//b의 unicode가 들어간다.
	    System.out.println(c);// unicode에 해당하는 문자를 출력한다.
	    
	    System.out.println(str+"에서 메일주소는"+str.substring(3,6));
	    System.out.println(str+"에서 도메인주소는"+str.substring(2,5));
	    
	    System.out.println(mail+"에서 메일주소는"+mail.substring(0,8));
	    System.out.println(mail+"에서 도메인주소는"+mail.substring(10,19));
	    System.out.println(mail+"에서 메일주소는"+mail.substring(0, mail.indexOf("@")));
	    System.out.println(mail+"에서 메일주소는"+mail.substring(mail.indexOf("@")+1,mail.length()));
	    // substring method는 시작인데스만 넣으면 알아서 끝까지 잘라주는
	    //method도 있다. (overload)
	    System.out.println(mail.substring(mail.indexOf("")));
	    
	    
	    //tuna5127@icloud.com
	    // 메일주소@도메인주소
	    // mail 변수에서 메일주소와 도메인주소를 잘라서 출력하세요.
	    
	    str="   A BC   ";

	    System.out.println(str+"["+str.trim()+"]");
	    
//	    str="서울시 강남구 역삼동";
//	    str="서울시 동작구 상도동";
	    str="경기도 평택시 평택동";
	    
	    if(str.startsWith("서울시")) {
	    	System.out.println("서울");
	    }else {
	    	System.out.println("지방");
	    }
	    str="서울시 동작구 상도동";
	    if(str.endsWith("동")) {
	    	System.out.println("도시");
	    }else {
	    	System.out.println("시골");
	    	
	    }
//	    str="오늘은 월요일입니다.";
//	    str="오늘은 화요일입니다.";
	    
	    str="내일은 화요일";
	    if(str.contains("요일")) {
	    	System.out.println("요일을 말하는 문장");
	    }else {
	    	System.out.println("문장");
	    	}//end else
	    str="오늘도 긴시간";
	    System.out.println(str.concat("수고 하셨습니다."));
	    System.out.println(str+"수고 하셨습니다.");
	    
	    str="오늘은 화창한 하루입니다.";
	    System.out.println(str+" / "+str.replaceAll("화창한","비오는"));
	    
	    str="어 나는 지금 피씨방이야 ! 넌 어딘데 씨 방새야?";
	    //method chain : method의 반환형이 객체라면 .으로 제공하는 method를 
	    //계속 연결하여 사용할 수 있다.
	    System.out.println(str.replaceAll("씨", "*").replace("방", "*"));
	    
	    str="951212-1234567";
	    //str은 주민번호가 들어있다. 이 주민번호가 남자인지 여자인지를 판단하여 출력해보세요
	    if (str.charAt(7)==1||str.charAt(7)==3) {
	    	System.out.println("남자입니다.");
	    }else if (str.charAt(7)==2||str.charAt(7)==4) {
	    	System.out.println("여자입니다.");
	    } else {
	    	System.out.println("사람이 아닙니다.");
	    }
	    	
	       
	    
	}//main

}//class
