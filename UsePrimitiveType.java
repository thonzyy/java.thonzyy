/**
 �⺻�� �������� : ������ ���� ��ü�� ���� �����ϴ� ��������
*/

class UsePrimitiveType {
	
	public static void main(String[] args) {
		//////////////������ ��������////////////////
             byte a=107; // byte : -128 ~ + 127 (Signed value)
              short b=20; // short �� 30000
			  int c=30; // int �� 21�� ������ ��
			  long d=40;  // long 21���� �ʰ��ϴ� ��
          

			 System.out.println("������ byte="+a+" , short : "+b+" , int : "+c+" , long : "+d);
                   //����Ʈ ������ �����ϴ� ������ �����ϰ� 54���� �Է��ϰ� ���

				   long aptCost= 5400000000l; // ����� literal 4byte -> 8byte)
				   System.out.println("����Ʈ ��������="+aptCost+"��");


		//////////////������ ��������////////////////
          //char e='A';
		 // char e=65;  unicode�� �������� ���� �Ҵ� �� �� �ִ�.
		char e='\uFFFF'; //unicode ���� ����� �� �ִ�. '�����ڵ�'
		   //
		   
         	//////////////�Ǽ��� ��������////////////////
		  char f='0';
		  char g='��';
         System.out.println("������ char : "+e+", "+f+", "+g);
          float h=6.07f; // �Ǽ� 8Byte float�� 4byte float�� literal���� �۱� ������ ����� �ʼ� 
		  double i=2023.0608;//����� ����
		  double j=2023.0608D;//�����
		  System.out.println("�Ǽ��� float�� : "+h+", double�� : "+i+","+j);
	

		//////////////�Ҹ��� ��������////////////////

        boolean k=true;
		boolean l=false;
      System.out.println("�Ҹ��� : "+k+", "+l);
		
		byte num1=10; //demotion 
		byte num2=20;
		int result=0;
		result= num1+num2; // byte���� ���������� ���� �� byte (short) + byte = int -> �������� �� �� �� ����� int
		// byte= int -> X char + char = int

		System.out.println(num1+ " + " +num2+ " = " + result);
		 
		 double n=4.07; //casting -> ��������ȯ 8byte -> 4byte
		 int x=(int) n;
            System.out.println(n);
		

	}
}
