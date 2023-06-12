/**
쉬프트 연산자
<<, >>, >>>
*/



class  Operator3 {


	public static void main(String[] args) {
	


		//<< : left shift : 비트를 왼쪽으로 밀고 빈칸을 항상 0으로 채운다.
		int i=20;

		System.out.println( i+" <<2="+(i<<2));

		i=5;
		System.out.println( i+" <<4="+(i<<4));
		// 0101 0000 = 80 

		i=1;

		System.out.println( i+" <<31="+(i<<31)); // 1이었을 때만 31칸 밀었을 경우 값이 동일 


		i=35;

		System.out.println( i+" >>>2="+(i>>>2)); // 1이었을 때만 31칸 밀었을 경우 값이 동일 
 
		i= -1;

		System.out.println( i+" >>100="+(i>>100));

		i=40;

		System.out.println( i+" >>>1="+(i>>>1)); // 1이었을 때만 31칸 밀었을 경우 값이 동일 
		// 0001 0100 0

		i=-1;
		System.out.println( i+" >>>1="+(i>>>1));

		//문자열은 연산되지 않는다. error
		// System.out.println( "10"*10);
		//문자열은 +를 사용하여 문자열 앞에 붙일 수 있다.














	}
}
