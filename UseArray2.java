package day0622;

/**
 * 이차원 배열 : 행과 열로 구성된 배열, 1.선언 데이터형 [] [] 배열명=null; 2.생성 배열명=new 데이터형 [행의수]
 * [열의수]; 3.값할당 배열명 [행의번호][열의번호]=값; 4.값사용 배열명[행의번호][열의번호]
 * 
 * @author user
 *
 */
public class UseArray2 {

	public void arrayUse1() {
		// 1.선언
		int[][] arr = null;
		// 2.생성
		arr = new int[3][4];
		System.out.println(arr + "의 행수 : " + arr.length + " ,열의 수 :" + arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]행 열의 수 %d \n", i, arr[i].length);

		}
		// 3.값 할당
//		arr[0]=10; 2차원 배열은 행에 값 할당할 수 없다.
		arr[0][0] = 10;
		arr[0][3] = 20;
		arr[2][3] = 50;
		// 값 사용
		System.out.println("이차원 배열의 한 행은 일차원 배열로 이루어져있다." + arr[0]);
		System.out.println(arr[0][0] + " / " + arr[0][1]);

		// 일괄처리
		for (int i = 0; i < arr.length; i++) { // 행을 반복하기 위한 for
			for (int j = 0; j < arr[i].length; j++) { // 열을 반복하기 위한 for
				System.out.printf("arr[%d][%d]=%d \t", i, j, arr[i][j]);

			} // end for
			System.out.println("\n" + i + "행끝");
		} // end for

	}

	public void arrayUse2() {
		// 2차원 배열은 행부군 괄호로 행을 만든다.
		int[][] arr = /* new int[][] */ { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 } };
		System.out.println(" 행 : " + arr.length + ", 열 :" + arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j]);

			} // end for
			System.out.println();
			;

		} // end for

	}// arrayUse2

	public void arrayUse3() {
		int[][] arr = new int[10][8];
		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) {// 열
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				}
				System.out.printf("%-4d", arr[i][j]);

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		UseArray2 ua2 = new UseArray2(); // 객체생성
		ua2.arrayUse1();
		System.out.println("------------------");
		ua2.arrayUse2();
		System.out.println("------------------");
		ua2.arrayUse3();
	}

}
