package day0630;

public class UseStringBuilder {
	
	public void useStringBuilder () {
		//1생성
		StringBuilder sb =new StringBuilder();
		//2값 붙이기
		sb.append(2023);//정수
		sb.append("년");//문자열
		sb.append("6월 30일");
		sb.append(6.30);//실수
		
		
		sb.insert(5, "인천시의 자랑 김선경");
		//4.삭제 9,11
		sb.delete(9, 12);
		//인천 시 앞에 "마계" 추가
		sb.insert(5, " 마계 ");
		
		
		System.out.println(sb + " / "+ sb.length());
	}//useStringBuilder
	
	public void useStringBuffer () {

			//1생성
			StringBuffer sb =new StringBuffer();
			//2값 붙이기
			sb.append(2023);//정수
			sb.append("년");//문자열
			sb.append("6월 30일");
			sb.append(6.30);//실수
			
			
			sb.insert(5, "인천시의 자랑 김선경");
			//4.삭제 9,11
			sb.delete(9, 12);
			//인천 시 앞에 "마계" 추가
			sb.insert(5, " 마계 ");
			
			
			System.out.println(sb + " / "+ sb.length());
		
	}//useStringBuffer 속도가 느리다.

	public static void main(String[] args) {
		
		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuilder();
		System.out.println("-------------------------------");
		usb.useStringBuffer();
		

	}

}
