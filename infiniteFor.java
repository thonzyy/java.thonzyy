package day0615;

public class infiniteFor {

	public static void main(String[] args) {
		// 수를 세는 무한 loop
		for (int i = 0;; i++) { // 조건이 없기 때문에 for가 끝나지 않는다.
			System.out.println(i);
			if (i == 5) {
				break;
			}
		} // end for
		System.out.println("안녕");

		// 증가하는 수를 세지 않는 무한 loop
	//	for (;;) {
		//	System.out.println("무한 loop");
	//	} // end for (Unreachable code)\
		
		for (int i=1; i <101 ; i++) {
		    System.out.println(i+" ");
			if ( i%2==0) {
				continue;
			}// end if

			System.out.println("안녕");
			}//end for
	}//main

}//class
