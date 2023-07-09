package day0707;

import java.util.HashMap;
import java.util.Map;

public class UseMap2 {
// 키를 가지고 검색할 때는 map을 이용한다. key와 값의 쌍을 이용.
	public String bloodType(String blood) {
		// 입력되는 혈액형별 특징을 Map에 넣고 , 키가 존재한다면 값을 얻기
		String result = "사람의 혈액형이 아닙니다.";

		Map<String, String> bloodMap = new HashMap<String, String>();

		bloodMap.put("A", "친절하다,세심하다,배려심이 깊다.");
		bloodMap.put("B", "성질이 더럽다");
		bloodMap.put("AB", "싸이코");
		bloodMap.put("O", "우유부단하다.");

		bloodMap.put("A", "소심하다");

		if (bloodMap.containsKey(blood.toUpperCase())) {
			result = bloodMap.get(blood.toUpperCase());
		} // end if

		return result;

	}// bloodType

	public static void main(String[] args) {
		UseMap2 um2 = new UseMap2();
	   String blood = "a";
	   System.out.println(um2.bloodType(blood));

	}// main

}// class
