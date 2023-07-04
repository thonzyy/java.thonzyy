package day0704;

import java.util.Arrays;
import java.util.Random;

public class UseRandom2 {
	
	public int[] makingNumber() {
		Random random = new Random();
		int[] result = new int[6];

		for (int i = 0; i < result.length; i++) {
			result[i] = random.nextInt(45) + 1; // 난수발생
			
			for  (int j =0 ; j < i ; j++) { // 발생된 난수가 이전 방에 들어있는지 확인
			if (result[j] == result[j]) { // 같은 값이 있다면
				i--; // 바깥 for에서 사용하는 index를 감소시키고
				break;// 안쪽 for를 빠져나간다.
			}
			}
		}
		
		return result;
		
		
		}


	public static void main(String[] args) {
		UseRandom2 ur2 = new UseRandom2();
		int[] lottoNumbers = ur2.makingNumber();
		Arrays.sort(lottoNumbers);
//		
//		for (int number : lottoNumbers) {
//			System.out.print(number + " ");
//		}
		System.out.println(Arrays.toString(lottoNumbers));
	}
}
