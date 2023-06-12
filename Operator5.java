/**
논리 연산자
&& (AND) : 전항과 후항 모두 true 일때만 true 반환
|| ( OR)  : 전항과 후항 중 하나가  true일 때 true 반환
비트 논리 연산자 :  */ 


class  Operator5 {


	public static void main(String[] args) {
	
	// 변수의 값이 unsigned 8진수 범위인지? ( 0~7 사이 값인지?)
	int i=8;
	System.out.println( i+ "는 8진수의 범위 ? " + ( i > -1 && i <8) );

	boolean flag1=true, flag2=false , flag3=true, flag4=false;
	System.out.println(  "--------------&& (AND)----------------- " );
	System.out.println(flag1+ " && "+flag3+" = " + (flag1 && flag3));//T && T = T
	System.out.println(flag1+ " && "+flag3+" = " + (flag1 && flag2));//T && F = F
	System.out.println(flag1+ " && "+flag3+" = " + (flag2 && flag1));//F && T = F
	System.out.println(flag1+ " && "+flag3+" = " + (flag2 && flag4));//F && F = F
	// 진리표

	System.out.println("-----------|| (OR)-----------------");
	int day=26;

	//6월에 월요일(5,12,19,26)이면 true 그렇지 않으면 false 출력
	boolean flag= day ==5 || day==12 || day==19 || day==26;
	System.out.println(day+"는 월요일인가?" + flag );
	System.out.println(flag1+ " || "+flag3+" = " + (flag1 || flag3));//T && T = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag1 || flag2));//T && F = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag2 || flag1));//F && T = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag2 || flag4));//F && F = F
	//&& (AND) 전항이 false 후항 연산 X
	//|| (OR) 전항이 True 후항 연산 X


	int num1=6, num2=12, num3=2023;
	flag1=false;
	flag2=false;

	boolean resultFlag= (flag1=num1 < num2) && (flag2= num2<num3);

	System.out.println("flag1 : " + flag1+ ", flag2 : "+flag2+", resultFlag : "+ resultFlag);



	System.out.println("-----------비트 논리연산-----------------");
	num1=39;
	num2=0xF;

	System.out.println( num1 + "&" +num2+ " = " +(num1&num2));
	//0010 0111, 0000 0111
	//0000 1111

	num1=25;
	num2=19;
	System.out.println( num1 + " | " +num2+ " = " +(num1 | num2));
	//0001 1001 | 0001 0011 -> 0001 1011 = 27

	num1=30;
	num2=12;
	System.out.println( num1 + " ^ " +num2+ " = " +(num1 ^ num2));
	// 0001 1110 ^ 0000 1100 = 0001 0010 = 18


	System.out.println( num1 + " ^ " +num2+ " = " +(num1 ^ num2));





	}
}
