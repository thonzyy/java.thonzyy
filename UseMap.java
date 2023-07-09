package day0707;

import java.util.Hashtable;

import java.util.Map;
import java.util.Set;

import java.util.Iterator;

public class UseMap {

	public void useHashtable() {

		// 1. 생성 : 11개의 행이 자동 생성

		Map<String, String> map = new Hashtable<String, String>();

		// 2. 값할당
		map.put("java", "완벽한 OOP언어");

		map.put("oracle", "대용량 데이터베이스");

		map.put("HTML", "hyper text markup language");

		map.put("CSS", "HTML의 디자인");

		// 키가 같으면 기존 키에 덮어 쓴다.
		map.put("HTML", "Tim berners'LEE 가 고안한 웹 언어");

		// 키가 존재하는지 알아보자

		System.out.println(map.containsKey("java"));
		System.out.println(map.containsKey("oracle"));

		// 값 얻기 : 존재하지 않는 키를 넣으면 null이 나온다.
		System.out.println(map.get("java"));
		System.out.println(map.get("Oracle"));

		// 모든 키 얻기
		Set<String> keySet = map.keySet();
		System.out.println(keySet);

		// 모든 값 얻기
		Iterator<String> ita = keySet.iterator();
		String key = "";
		while (ita.hasNext()) {
			key = ita.next();
			System.out.println(key + " " + map.get(key));
		} // end while

		// 값 삭제
		map.remove("CSS");

		// 모든 값 삭제
		map.clear();

		System.out.println(map + " / " + map.size());

	}// useHashtable

	public void useHashmap() {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		// 2. 값할당
				map.put("java", "완벽한 OOP언어");

				map.put("oracle", "대용량 데이터베이스");

				map.put("HTML", "hyper text markup language");

				map.put("CSS", "HTML의 디자인");

				// 키가 같으면 기존 키에 덮어 쓴다.
				map.put("HTML", "Tim berners'LEE 가 고안한 웹 언어");

				// 키가 존재하는지 알아보자

				System.out.println(map.containsKey("java"));
				System.out.println(map.containsKey("oracle"));

				// 값 얻기 : 존재하지 않는 키를 넣으면 null이 나온다.
				System.out.println(map.get("java"));
				System.out.println(map.get("Oracle"));

				// 모든 키 얻기
				Set<String> keySet = map.keySet();
				System.out.println(keySet);

				// 모든 값 얻기
				Iterator<String> ita = keySet.iterator();
				String key = "";
				while (ita.hasNext()) {
					key = ita.next();
					System.out.println(key + " " + map.get(key));
				} // end while

				// 값 삭제
				map.remove("CSS");

				// 모든 값 삭제
				map.clear();

				System.out.println(map + " / " + map.size());

	}// useHashmap

	public static void main(String[] args) {

		UseMap um = new UseMap();
		um.useHashtable();
		System.out.println("---------------------------");
		um.useHashmap();

	}// main

}// class
