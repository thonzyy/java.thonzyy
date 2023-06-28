package day0627;

import java.util.ArrayList;
import java.util.List;

public class TestAnnotation {

	/**
	 * 6월 27일에는 기분이 좋았으나 지금 아님 <strong>Deprecated</storng> 얘 말고 쟤 쓰세요.
	 * 
	 */

	@Deprecated
	public void print() {
		System.out.println("아! 오늘은 기부니가 좋다!");
	}
	@Override
	public String toString() {
		return "주소는 거절한다.";
	}
	@SuppressWarnings({"rawtypes","unused"})
	   public void test () {
//		@SuppressWarnings("unused")
		int i = 0;
//		@SuppressWarnings("unused")
		int j = 0;
		 List list = new ArrayList();
	}

	public static void main(String[] args) {
		TestAnnotation ta = new TestAnnotation();
		ta.print();
		String str = new String("내일은 휴강");
		System.out.println(str.toString());
		System.out.println(ta.toString());
	}

}
