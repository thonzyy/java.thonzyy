package day0621;

public class UseString2 {
	public boolean emailCheck(String email) {
		boolean flag = false;
		if (email.indexOf("@") != -1 || email.indexOf(".") != -1) {
			flag = true;
		} // end if
		return flag;
	}// email check

	public static void main(String[] args) {
		// 입력받은 이메일의 유효성 검증을 수행하는 method 작성
		// 유효하면 true를 그렇지 않으면 false를 반환 => 가변값
		// validation " @ 과 ,

		String email1 = "test";
		String email2 = "test@test.com";
		String email3 = "test@testcom";
		String email4 = "testtest.com";
		String email5 = "test@sist.com";
		// 유효성 검증하는 ㅡmethod를 호출
		UseString2 us2=new UseString2();
		System.out.println(email1+ " / "+us2.emailCheck(email1));
		System.out.println(email2+ " / "+us2.emailCheck(email2));
		System.out.println(email3+ " / "+us2.emailCheck(email3));
		System.out.println(email4+ " / "+us2.emailCheck(email4));
		System.out.println(email5+ " / "+us2.emailCheck(email5));

	}

}
