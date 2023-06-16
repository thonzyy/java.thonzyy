package day0615;

/**
 * while : 시작과 끝을 모를 때 사용하는 반복문
 * 최소 0번 수행에 최대조건까지 수행.<br>
 * 문법)<br>
 * while (조건식) <br>
 *  반복수행문장들...<br>
 *  증.감식 <br>
 * @author user
 *
 */
public class UseWhile {

	
	public static void main(String[] args) {
		int i = 10;
		while (i<5) {
			System.out.println("i = "+i);
			i++;
			
		}//end while
		i = 1;
		while (i<10) {
			System.out.println("3 X "+i+" ="+3*i);
		i++;	
		}

	}//main

}//class
