//1. 소스코드 작성

//지역변수를 사용하는 일을 하는 자바 소스코드 작성

class UseLocalVariable{
              
          public static void main(String[] args){
                           
                             int i; //1. 변수의 선언
                             i=2023;//2. 값 할당 
                             System.out.println( i ); //3.변수의 사용


                             i=6;//2. 값 할당 
                             System.out.println( i ); //3.변수의 사용

                             int j; //1. 변수의 선언
                             j=8;//2. 값 할당 
                             System.out.println( j ); //3.변수의 사용
                         

						 //같은 이름의 변수는 데이터형과 상관없이 선언할 수 없다.
						 //String i;
						 //지역변수는 자동초기화가 되지 않는다. ( 초기화하지 않은 변수는 사용하게 되면 error가 발생)
						 //int k;
						 
						 //System.out.println(k);
                         //지역변수의 초기화 (defalut value)
						 //데이터형 변수명=값;
						 int k=10;
						 System.out.println(k);


           }

}
