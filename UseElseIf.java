package day0614;

/**
 * else~if(다중 if) <br>
 * 연관된 여러 조건을 비교해야할 때 사용.
 * 
 * 
 */
public class UseElseIf {

	public static void main(String[] args) {

		// 점수에 대한 판정 : 0보다 작은지 100보다 큰지 범위 안에 있는지 판단
		int score = 50;
		System.out.println(score + "점은");
		if (score < 0) {
			System.out.println("0보다 작을 수 없습니다.");
		} else if (score > 100) {
			System.out.println("100보다 클 수 없습니다.");
		} else {
			System.out.println("입력성공");

			// arguments로 자바, C,Python이 입력 되었을 때에만 동작하는 코드 작성.
			// 입력값이 자바라면 1995를 C라면 1972, 그렇지 않다면 1991 변수를 넣고
			// 변수값을 출력 => 다중 if를 사용한다

			if (args[0].equals("java") || args[0].equals("C") || args[0].equals("PyThon")) {
				int year = 0;

				if (args[0].equals("java")) {
					year = 1995;
				} else if (args[0].equals("C")) {
					year = 1972;

				} else {
					year = 1992;
				}//end else
				System.out.println(args[0] + "언어는 " + year + "년도 출시");

			}// end If
			
			//태어난 해를 입력받아 띠를 출력하는 코드 작성
			//0- 원숭이, 1-닭,2-개,3-돼지,4-쥐,5-소,6-호랑이,7-토끼,8-용,9-뱀,10-말,11-양
			int bornYear=1995; //어떤 코드를 실행하는데 기준이 되는 코드
			// int zodiacFlag=birth%12;
					if ( bornYear %12==0) {
						System.out.println("원숭이");
					} else if (bornYear%12==1) {
						System.out.println("닭");
					} else if (bornYear%12==2) {
						System.out.println("개");
					} else if (bornYear%12==3) {
						System.out.println("돼지");
					} else if (bornYear%12==4) {
						System.out.println("쥐");
					} else if (bornYear%12==5) {
						System.out.println("소");
					} else if (bornYear%12==6) {
						System.out.println("호랑이");
					} else if (bornYear%12==7) {
						System.out.println("토끼");
					} else if (bornYear%12==8) {
						System.out.println("용");
					} else if (bornYear%12==9) {
						System.out.println("뱀");
					} else if (bornYear%12==10) {
						System.out.println("말");
					} else  {
						System.out.println("양");
					}
			
					
			
			
		} 
		
		
	} // main

} // class
