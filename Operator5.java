/**
�� ������
&& (AND) : ���װ� ���� ��� true �϶��� true ��ȯ
|| ( OR)  : ���װ� ���� �� �ϳ���  true�� �� true ��ȯ
��Ʈ �� ������ :  */ 


class  Operator5 {


	public static void main(String[] args) {
	
	// ������ ���� unsigned 8���� ��������? ( 0~7 ���� ������?)
	int i=8;
	System.out.println( i+ "�� 8������ ���� ? " + ( i > -1 && i <8) );

	boolean flag1=true, flag2=false , flag3=true, flag4=false;
	System.out.println(  "--------------&& (AND)----------------- " );
	System.out.println(flag1+ " && "+flag3+" = " + (flag1 && flag3));//T && T = T
	System.out.println(flag1+ " && "+flag3+" = " + (flag1 && flag2));//T && F = F
	System.out.println(flag1+ " && "+flag3+" = " + (flag2 && flag1));//F && T = F
	System.out.println(flag1+ " && "+flag3+" = " + (flag2 && flag4));//F && F = F
	// ����ǥ

	System.out.println("-----------|| (OR)-----------------");
	int day=26;

	//6���� ������(5,12,19,26)�̸� true �׷��� ������ false ���
	boolean flag= day ==5 || day==12 || day==19 || day==26;
	System.out.println(day+"�� �������ΰ�?" + flag );
	System.out.println(flag1+ " || "+flag3+" = " + (flag1 || flag3));//T && T = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag1 || flag2));//T && F = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag2 || flag1));//F && T = T
	System.out.println(flag1+ " || "+flag3+" = " + (flag2 || flag4));//F && F = F
	//&& (AND) ������ false ���� ���� X
	//|| (OR) ������ True ���� ���� X


	int num1=6, num2=12, num3=2023;
	flag1=false;
	flag2=false;

	boolean resultFlag= (flag1=num1 < num2) && (flag2= num2<num3);

	System.out.println("flag1 : " + flag1+ ", flag2 : "+flag2+", resultFlag : "+ resultFlag);



	System.out.println("-----------��Ʈ ������-----------------");
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
