/**
입력되는 문자열을 정수 (byte,short,int,long)나 실수( float, double)로
변환 (parse 구문분석)
*/



class UseArgument2 {

	public static void main(String[] args) {
	         //int i=args[0];//args는 string형이므로 int형인 i변수에 할당 될 수 없다.
			 int i =Integer.parseInt( args[0] );
			 double d=Double.parseDouble(args[1]);

			 System.out.println(i+" + 2 = "+(i+2));
			 System.out.println(d+" + 2.5 = "+( d+2.5));

			 System.out.println( args[2].equals("안녕")); //args가 안녕과 같은지

			 System.out.println( args[3].equals("이동원")?"앗! 나다!!" : args[3]+"님 안녕하세요?");

			 


			 //args[3]에 입력된 값이 자신의 이름이라면 "앗! 나다!!' 그렇지 않다면
			 // "입력된 이름" 님 안녕하세요?"를 출력


			    
		
	}
}
