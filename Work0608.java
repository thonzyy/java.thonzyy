class  Work0608{



	public static void main(String[] args) {
      //출력 1.
		char initial1='L';
		char initial2='D';
		char initial3='W';
        int bornYear=1995;
		int thisYear=2023;
		System.out.println("내 이름은 이동원이고 이니셜은" +initial1+initial2+initial3+ "입니다.");
		System.out.println("태어난 해는" +bornYear+"년으로");
		System.out.println("나이는" +(thisYear-bornYear)+"살입니다");

		//출력 2.

      
          double leftEyeSight = 1.02;
          double rightEyeSight = 1.04;
          double eyesight = ((leftEyeSight + rightEyeSight)/2);
          System.out.println("왼눈 시력 " +leftEyeSight+" 오른눈시력 "+rightEyeSight+" 양안시력 "+eyesight);

       //출력 3.
           double oneWayFee = 1250;
		   double roundTripFee = oneWayFee*2;
           double monthlyFee =oneWayFee*roundTripFee ;
           System.out.println( "편도차비 "+oneWayFee+" 왕복차비"+roundTripFee+"원입니다.");
		   System.out.println( "한달 20일 출근을 하면 월 교통비는 총 "+monthlyFee+"원입니다.");

	    //출력 4.

           char j='A';
		   int A = 65;
           char B = 65+32;
           System.out.println( "대문자'"+j+"'의 코드 값은"+A+"입니다.A+32를 하면 소문자'"+B+"'를 만들 수 있습니다.");




	}
}
