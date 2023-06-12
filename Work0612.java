class Work0612 {



	public static void main(String[] args) {

		// Work 1번
	    int temp1=10;
		int temp2=20;
	    System.out.println( ++temp1 + temp2--);
        System.out.println( "temp1 = " + temp1 +" / temp2 = "+ temp2 );
		// temp1=20 에서 증가연산으로 1 증가하여 11이 되고
		//temp2-- 후의 연산이 되어 11+20이 된다 (31). //
		//이후 temp2부터는 19로 변화된 값 사용 temp1 = 11 / temp2 = 19


		//Work 2번
		
		int i = 65535;

	    System.out.println	(i &=Integer.MAX_VALUE);

	   //Work 3번

	   int j = Integer.parseInt(args[0]);
       System.out.println((j > 0 && j < 100) ? "입력성공" : "점수를 확인하세요");
	   // *0<ars[0]<100* -> j > 0 && j < 100

	   //Work 4번

	  int k = Integer.parseInt(args[0]);
      System.out.println((k % 4 == 0 && (k%400==0||k % 100 != 0)) ? "윤년" : "윤년이 아닙니다.");

	  





  

		
	}
}
