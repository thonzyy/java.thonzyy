package day0704;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseCalendar {
	
	public UseCalendar () {
		System.out.println("시스템의 현재 날짜 : " +System.currentTimeMillis());
		
		//1. instance를 얻는 static method 사용
		
		Calendar cal = Calendar.getInstance();
		//2. 자식클래스를 사용
		Calendar cal2 = new GregorianCalendar();
		
		System.out.println(cal);
		System.out.println(cal2); // object의 toString으로 나온다
		System.out.println(cal.get(Calendar.YEAR)); // constant 사용 가독성 향상 값 고정
		StringBuilder sb = new StringBuilder();
		
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
	sb.append(cal.get(Calendar.YEAR)).append(" 년 ")
	.append(cal.get(Calendar.MONTH)+1).append(" 월 ")
	.append(cal.get(Calendar.DAY_OF_MONTH)+1).append(" 일 ")
	.append("오늘은 이번년에 몇 번째 일")
	.append(cal.get(Calendar.DAY_OF_YEAR)+1).append(" 요일 :  ")
	.append(cal.get(Calendar.DAY_OF_WEEK)+1).append(" ")
;	
	
	String[] weekTitle= { "일","월","화","수","목","금","토"};
	int amPm=cal.get(Calendar.AM_PM);
     sb.append(weekTitle[dayOfWeek-1]).append(" \n오전 / 오후 ")
     .append(cal.get(Calendar.AM_PM))
     
     ;
     
	String amTitle = "";
	switch (amPm) {
	case Calendar.AM:
		amTitle= "오전";
		break;
	case Calendar.PM:
	      amTitle="오후";
		break;
	}
	sb.append(amTitle).append("")
	.append(cal.get(Calendar.HOUR)).append(" ")
	.append(cal.get(Calendar.HOUR_OF_DAY)).append(" : ")
 .append(cal.get(Calendar.SECOND))
	;
	

	
	System.out.println(sb);
	}//UseCalendar 
	
	public UseCalendar calendarSet() {
		//1. Calendar 생성
		Calendar cal = Calendar.getInstance();
		//2.method 호출
	
		//일변경
		cal.set(Calendar.DAY_OF_MONTH, 32); // 2024-12-25
		
		String [] dayTitle = "일,월,화,수,목,토".split(",");
		System.out.println(cal.get(Calendar.YEAR)+"-"+
		(cal.get(Calendar.MONTH)+1)+"-"+
				cal.get(Calendar.DAY_OF_MONTH)+"-"+
		dayTitle[cal.get(Calendar.DAY_OF_WEEK)-1])
				;
		return this;
	}//calendarSet
	
	public void calSet2() {
		System.out.println("확인");
	}
	
	
	
	

	public static void main(String[] args) {
		
		//코드를 변경하여 calSet2를 chain으로 호출해보세요
	 new UseCalendar().calendarSet().calSet2();
	 
	 

	}

}
