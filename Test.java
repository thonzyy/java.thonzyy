package day0703;

public class Test {

	public static void main(String[] args) {

		String str="오늘은 ";
		
		str+="7월의 첫 월요일 입니다.";
		str+="아 덥다~~~~";
		str+="이번 주 수요일은 휴강";
		
		System.out.println( str+"포항항항");
		
		StringBuilder sb=new StringBuilder("오늘은 ");
		sb.append("7월의 첫 월요일 입니다.");
		sb.append("아 덥다~~~~");
		sb.append("이번 주 수요일은 휴강");
		System.out.println(sb.append("포항항항"));
		
		
	}

}
