/*
값을 개발자가 원하는 데이터형으로 일시적인 변환을 수행하는 Casting의 사용<br>
값 손실이 발생할 수 있다.
*/




class UseCasting {




	public static void main(String[] args) {

      float f=2023.06F;

	  int i=0;
	//  i=f byte 크기는 같으나 저장하는 값의 종류가 다르기 때문에 err
	i=(int)f; //실수부가 사라지는 값손실이 발생한다.
	System.out.println("int : "+i+", float : "+f);

	         i=65;
			 char c=(char)i;
			 System.out.println("char : " + c + ", int : " + i);


			 double d=0.123456789;
			 f=(float)d;
            System.out.println("float : " + f + ", double : " + d);
                                      //형명시와 캐스팅의 차이
			float f1=(float)1.23; //리터럴은 그대로 두고, 할당할 때 데이터형을 변경하여 할당
			float f2=1.23f;   //리터럴 자체를 줄여서 저장하고 할당
			 System.out.println(f1+ "," +f2);

			 //boolean형은 다른 데이터형으로 casting 되지 않는다.
			 boolean flag=true;
			// boolean flag1=1; 다른 형은 boolean으로 casting 되지 않는다.
			 //i=(int)flag;   boolean 형은 다른형으로 casting 되지 않는다.
			// boolean flag1=flag; boolean은 boolean으로만 casting
				 System.out.println(flag);

 
            //기본형은 참조형으로, 참조형이 기본형으로 casting 될 수 없다.
			//String str=(String)i;
               String str="안녕";
		//	   i=str;
                System.out.println(str);

               byte num1=10;
			   byte num2=20;
			   byte result=0;

			  result=(byte) (num1+num2);
			   System.out.println(num1+ " + "+num2+ " = " + result);


	







	}

}
