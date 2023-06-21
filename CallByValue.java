package day0621;

/**
 * method의 매개변수가 기본형인 경우에는 값이 복사되어 들어간다. method안에서 값을 변경하더라도 원래 선언된 변수의 값은 변경되지
 * 않는다.
 * 
 * @author user
 *
 */
public class CallByValue {

	public void swap(int year, int month) {

		int temp = 0;
		temp = year;
		year = month;
		month = temp;
		System.out.println("swap 안에 year : " + year + " , month : " + month);
	}// swap

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int year = 2023;
		int month = 6;
		System.out.println("swap 전 year : " + year + " , month : " + month);
		cbv.swap(year, month);
		System.out.println("swap 후 year : " + year + " , month : " + month);

	}// main

}// class
