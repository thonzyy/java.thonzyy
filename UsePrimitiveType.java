/**
 기본형 데이터형 : 선언한 변수 자체에 값을 저장하는 데이터형
*/

class UsePrimitiveType {
	
	public static void main(String[] args) {
		//////////////정수형 데이터형////////////////
             byte a=107; // byte : -128 ~ + 127 (Signed value)
              short b=20; // short 약 30000
			  int c=30; // int 약 21억 정도의 값
			  long d=40;  // long 21억을 초과하는 값
          

			 System.out.println("정수형 byte="+a+" , short : "+b+" , int : "+c+" , long : "+d);
                   //아파트 가격을 저장하는 변수를 선언하고 54억을 입력하고 출력

				   long aptCost= 5400000000l; // 형명시 literal 4byte -> 8byte)
				   System.out.println("아파트 공시지가="+aptCost+"원");


		//////////////문자형 데이터형////////////////
          //char e='A';
		 // char e=65;  unicode값 십진수로 직접 할당 할 수 있다.
		char e='\uFFFF'; //unicode 직접 사용할 수 있다. '유니코드'
		   //
		   
         	//////////////실수형 데이터형////////////////
		  char f='0';
		  char g='가';
         System.out.println("문자형 char : "+e+", "+f+", "+g);
          float h=6.07f; // 실수 8Byte float형 4byte float은 literal보다 작기 때문에 형명시 필수 
		  double i=2023.0608;//형명시 생략
		  double j=2023.0608D;//형명시
		  System.out.println("실수형 float형 : "+h+", double형 : "+i+","+j);
	

		//////////////불린형 데이터형////////////////

        boolean k=true;
		boolean l=false;
      System.out.println("불린형 : "+k+", "+l);
		
		byte num1=10; //demotion 
		byte num2=20;
		int result=0;
		result= num1+num2; // byte하위 데이터형은 연산 시 byte (short) + byte = int -> 변수선언 잘 안 함 결과는 int
		// byte= int -> X char + char = int

		System.out.println(num1+ " + " +num2+ " = " + result);
		 
		 double n=4.07; //casting -> 강제형변환 8byte -> 4byte
		 int x=(int) n;
            System.out.println(n);
		

	}
}
