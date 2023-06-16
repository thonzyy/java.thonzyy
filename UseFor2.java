package day0615;

/**
 * 다중 for문의 사용. (바깥 for가 한 번 돌 때 안쪽 for는 몇 번 실행 되는가?)
 * 
 * @author user
 *
 */
public class UseFor2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {// 다중 for 같은 이름의 데이터형 변수명은 하나만
				System.out.println("i = " + i + " / j= " + j);
			} // end for
			System.out.println("-------------------");
		} // end for

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단 시작");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X "+j+"=" +i*j);
			} // end for
			System.out.println(i + "단끝");
		} // end for
		
//		0 0 
//		1 0 1 1 
//		2 0 2 1 2 2 
//		3 0 3 1 3 2 3 3 

		for ( int i = 0; i<4 ; i++) {
			
			for ( int j = 0; j<=i; j++) {
				System.out.print(i+" "+j+" ");
			}//end for
			System.out.println();
		}//end for
//		0 0 0 1 0 2 0 3
//		1 1 1 2 1 3
//		2 2 2 3
//		3 3
		for ( int i =0; i<4; i++) {
			for ( int j = i ; j < 4; j++) {
				System.out.print(i+" "+j+" ");
			
			}//end for
			System.out.println();
		}// end for
		
		int k = 0;
		for ( int i = 0 ; i<5; i++ ) {//행을 돌리기 위한 for
			
			for ( int j = 0; j<5; j++) { //열을 돌리기 위한 for
				k=i==0 || i== 4||j==0||j==4 ?1:0; // 처음 행이거나 마지막행이거나 
				//처음 열이거나 마지막 열이라면 1을 그렇지 않다면 0을
				//k 변수에 할당하고 출력한다.
				
			 System.out.print(k+" ");
			}// end for
			System.out.println();
		}// end for

	}

}
