package day0622;

/**
 * 일차원 배열의 사용
 * 
 * @author user
 *
 */
public class UseArray1 {

	public void arryUse1() {
		// 1.선언 데이터형 [] 배열명 = null;
		int[] arr = null;
		// 2.생성 배열명=new 데이터형 [방의 수];
		arr = new int[5]; // arr 주소
		System.out.println(arr + "배열의 방의 개수 : " + arr.length);
		// 3.값할당 배열명 [ 방의번호]=값;
		arr[0] = 10;
		arr[4] = 2023;
		// 4.값사용 배열명[방의번호]
		System.out.println(arr[0] + " / " + arr[1]);

		// 일괄처리
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\t", i, arr[i]);
		} // end for
		System.out.println();

	}// arrayUse1

	public void arryUse2() {

		int[] score = /* new int []가 생략 */ { 83, 99, 77, 64, 93, 70 };
		System.out.printf("시험응시자[%d]명\n", score.length);
		// 일괄처리
		System.out.println("번호\t점수");
		System.out.println("==============");
		int sum = 0; // sum 선언
		for (int i = 0; i < score.length; i++) {
			sum += score[i];

		} // end for
		double d = (double) sum / score.length;// 캐스팅
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + d);
		System.out.printf("총점 [%d]\n", sum);
		System.out.printf("평균[%.2f]\n", d);

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t%d\n", i + 1, score[i]);
		} // end for
		
		//score 배열의 마지막 방부터 처음 방까지 출력\

		System.out.println();
//		for (int i = score.length-1 ; i> -1; i++) {
//			System.out.print ( score[i] +" ");
//		}
//		
        
        int top = score[0];
        for (int i = 1; i < score.length ; i++) {
        	if (score[i] > top) {
        		top = score[i];
        	}

        }
        
        
        System.out.println("최고점수 = "+top); 
        
        int [] score1 = {83,99,77,64,93,70,83,78,83,20};
        //83점과 같은 점수를 받은 학생의 수가 몇 명인지 출력
        // 최고점과 최저점 차이 출력
        
        int grade = score1[0];
        int count=0;
        int max = score1[0];
        int min = score1[0];
        for (int i = 0; i < score1.length ; i++) {
        	if (score1[i] == grade) {
        		count++;
        	}
        	if (score1[i] > max) {
        		max = score1[i];
        	}
        	if (score1[i] < min) {
        		min = score1[i];
        	}
       

        }
        System.out.println ( grade+"점은"+ count+ "명입니다.");
        System.out.println ( "점수차이는"+(max-min) );
        
//        for (int i = 0; i < score1.length ; i++) {
//        	if (score1[i] > max) {
//        		max = score1[i];
//        	}
//        	if (score1[i] < min) {
//        		min = score1[i];
//        	}
//        	
//
//        }
//      
        
        //int[] score = {83,99,77,64,93,70};
        //score배열의 값을 내림차순 형태로 바꾼 후 출력
        int desccendingScore=0 ; // 배열 방의 값을 임시로 저장
        
        for (int i = 0 ; i < score.length -1  ; i++) { // 현재 방의 값을 반복
        	for (int j =i+1 ; j < score.length -1-i ;j++) {// 현재 방부터 뒤에 존재하는 방의 값을 반복
        		if( score[i] < score[j] ) { // 앞방이  뒷방보다 작다면
        			desccendingScore = score[i]; //  앞방의 값을 임시변수에 넣고
        			score[i] = score[j];           // 뒷방의 값을 앞방에 넣고
        			score[j] = desccendingScore; //이미변수의 값을 앞방에 넣는다.
        					
        		}
        		
        	}
        }
        
        for (int i = 0 ; i<score.length; i++) {
        	System.out.print(score[i]+" ");
        }
	}// arrayUse2
	
	
	

	public static void main(String[] args) {

		UseArray1 ua1 = new UseArray1();
		ua1.arryUse1();
		ua1.arryUse2();

	}

}
