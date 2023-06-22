package day0622;

public class Work0622 {
	
	private String residentRegistrationNumber; //인스턴스 변수 선언

	public Work0622(String ssn) { //생성자
		this.residentRegistrationNumber=ssn;
	}
    public void setResidentRegistrationNumber(String ssn) {
    	residentRegistrationNumber = ssn; //값설정
    }
	public String getresidentRegistrationNumber() {
        return residentRegistrationNumber; //값얻기
	}
	//1번 
	public boolean ssnCheck(String ssn) { //boolean 14자리 체크 method 
	return ssn.length() == 14; //반환 true or false
	
	
	
	}
	//2번
	public boolean ssnCheck2(String ssn) {
		return ssn.charAt(6)=='-';
	}




	
	public static void main(String[] args) {
		String ssn = "951220-1111111"; //변수선언 및 생성
		
		Work0622 w = new Work0622(ssn); //객체생성
//		boolean valid = w.ssnCheck(ssn);
//		System.out.println(valid);
		if (w.ssnCheck(ssn)==true ) {
			if (w.ssnCheck2(ssn)==true) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
			}
			
			
		}
		
		
		

	}

}
