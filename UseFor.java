package day0614;

/**
 * 시작과 끝을 알 때 사용하는 반복문 : for<br>
 * 문법) <br>
 * for( 시작값(초기값) ;끝값(조건식); 증.감소식){
 * 반복수행 문장들....;<br>
 * @author user
 *
 */
public class UseFor {
	

	public static void main(String[] args) {
		//0~9까지 1씩 증가하는 값을 출력하는 반복문
		for (int i =1; i<101;i++) {
			if(i%2==0) { //단일 if 조건에 맞을 때만 코드를 실행
			System.out.print(i+" ");
			}//end if
		}//end for
		
	System.out.println();

		

		
		//1~100까지 1씩 증가하는 값을 출력하는 반복문
		//짝수만 나오게
		//for문의 증감소식은 대상체의 값을 변경하여 유지할 수 있는 모든 문법을 사용할 수 있다.
          for(int i=1; i < 101 ; i+=2) {
        	  System.out.print(i+" ");
        	  
          }//end for
          System.out.println();
          
          //1~9까지 1씩 증가하는 수를 아래로 출력 반복문
          
          for(int i = 1  ; i<10; i++) {
        	  System.out.println("2X"+ i +"="+ i*2 );
          } // end for
          
          //for문을 사용하여 A~Z까지 출력
         /*          for(int j = 65  ; j<91; j++) {
    	  System.out.print((char)j+" ");  int를 char로 변환 캐스팅*/ 
          for(char j = 65  ; j<91; j++) {
        	  System.out.print(j+" ");
          } //end for
          System.out.println();
          //1~100까지 합을 출력 : 
          int sum = 0;
          for(int i=1; i < 101 ; i++) {
        	sum +=i;// sum = sum+i ;
        	
        	 
          }//end for
          System.out.println("1~100까지의 합은"+sum);
          System.out.println();
          //100~0까지 1씩 감소하는 값을 옆으로 출력
          for(int i =100; i>-1; i--) {
        	  System.out.print(i+" ") ;
          } // end for
          System.out.println();
          // 대문자A~Z까지 와 a~z까지를 한번에 출력하는 for
          for(char j =65;j<91 ; j++) {
        	  System.out.println(j+"("+(char)(j+32)+")") ;
          
          }//end for
	}//main

}//class
