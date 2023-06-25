package day0623;

public class VariableArray {
	public VariableArray() {

		// 1.선언) 데이터형 [][] 배열명 = null;
		int[][] arr = null;
		// 2.생성) 열을 설정하지 않는다. 배열명 = new 데이터형 [ 행의수] [] ;
		arr = new int[5][]; // 열을 모른다.
		// 3. 행마다 열을 생성) 배열명 [행의 번호]=new 데이터형 [열의수];
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 생성 기본형 . 값을 넣을 때에는 열의 크기 설정 X
		arr[3] = new int[2];
		arr[4] = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]해의 열의 수 %d 개\n", i, arr[i].length);
		} // end for
			// 4.값 할당) 배열명[행의번호][열의번호]=값
		arr[0][0] = 10;
		arr[4][3] = 20;
		// 5. 값 얻기) 배열명[행의번호][열의번호]
		System.out.println(arr[0][0] + " / " + arr[0][1]); // new 가 들어가면 힙에 들어가고 초기화가 된다.

		// 모든 방의 값을 개선된 for loop 출력
		for (int[] arr1 : arr) {
			for (int value : arr1) {
				System.out.print(value + " ");
			}

			System.out.println();
		}

	}// VariableArray

	public static void main(String[] args) {

		new VariableArray();

	}// main

}// class
