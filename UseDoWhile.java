package day0615;

/**
 * @author user
 * 시작과 끝을 모를 때 사용하는 반복문.<br>
 * do{
 *  반복수행문장들...;<br>
 *  증.감소식<br>
 *  }while(조건식);<br>
 */
public class UseDoWhile {

	public static void main(String[] args) {
		int i=100;
		do {
			System.out.println(i);
			i++;//증.감소식
		}while(i<5); //조건식
		//do while을 사용하여 1~100까지의 합을 출력
		
		int sum = 0;
		 i=1;
		do {
			sum+=i;
			i++;
			
	
		}while (i<101);
		System.out.println("1~100까지의합"+sum);
	}

}
