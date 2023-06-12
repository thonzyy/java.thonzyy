/** 
대입 연산자
 =(순수대입),

 +=,-=,*=,/=,%= (산술대입 - 연산된 결과로 변수의 값을 변경)
 */




class Operator7{
	

	public static void mn(String[] args) {
		int i=2; //순서대입

		//산술대입
		i -=21;// i=i+21
		i -=10;//i=i-10
		i *=2; //i=i*2
		i /=5; // i = i / 5 ; 정수/정수=정수
		i %=2; // i = i %2

		// 쉬프트 대입
		i <<=5; // i = i << 5 //0000 0001 << 5= 0001 0000 
		i >>=2; // i = i >> 2 //0010 0000 << 2= 0010 1000 00
		//i >>>=1; // i = i >>>;//0000 1000 >>>1 = 0000 0100 0
		
		/*비트논리 대입
		i &=12; // i = i &12;// 0000 0100 & 0000 1100 = 0000 0100
		i |=20;
		i ^= 0xF;*/


	
		System.out.println( i );


		//진수변환

        int j=25;
		System.out.println(j+"를 2진수로 " +Integer.toBinaryString(j) ); // 0001 1001
		System.out.println(j+"를 8진수로 " +Integer.toOctalString(j) );

		


	}
}
