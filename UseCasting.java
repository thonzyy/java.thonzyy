/*
���� �����ڰ� ���ϴ� ������������ �Ͻ����� ��ȯ�� �����ϴ� Casting�� ���<br>
�� �ս��� �߻��� �� �ִ�.
*/




class UseCasting {




	public static void main(String[] args) {

      float f=2023.06F;

	  int i=0;
	//  i=f byte ũ��� ������ �����ϴ� ���� ������ �ٸ��� ������ err
	i=(int)f; //�Ǽ��ΰ� ������� ���ս��� �߻��Ѵ�.
	System.out.println("int : "+i+", float : "+f);

	         i=65;
			 char c=(char)i;
			 System.out.println("char : " + c + ", int : " + i);


			 double d=0.123456789;
			 f=(float)d;
            System.out.println("float : " + f + ", double : " + d);
                                      //����ÿ� ĳ������ ����
			float f1=(float)1.23; //���ͷ��� �״�� �ΰ�, �Ҵ��� �� ���������� �����Ͽ� �Ҵ�
			float f2=1.23f;   //���ͷ� ��ü�� �ٿ��� �����ϰ� �Ҵ�
			 System.out.println(f1+ "," +f2);

			 //boolean���� �ٸ� ������������ casting ���� �ʴ´�.
			 boolean flag=true;
			// boolean flag1=1; �ٸ� ���� boolean���� casting ���� �ʴ´�.
			 //i=(int)flag;   boolean ���� �ٸ������� casting ���� �ʴ´�.
			// boolean flag1=flag; boolean�� boolean���θ� casting
				 System.out.println(flag);

 
            //�⺻���� ����������, �������� �⺻������ casting �� �� ����.
			//String str=(String)i;
               String str="�ȳ�";
		//	   i=str;
                System.out.println(str);

               byte num1=10;
			   byte num2=20;
			   byte result=0;

			  result=(byte) (num1+num2);
			   System.out.println(num1+ " + "+num2+ " = " + result);


	







	}

}
