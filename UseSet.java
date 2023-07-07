package day0706;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;



/**
 * @author user
 *
 */
public class UseSet {
	
	public void UseHashSet() {
		
		//1.생성)
		Set<String> set = new HashSet<String> () ;
		
		//2.값추가 ) - 값은 순차적으로 입력되지 않는다.
		
		set.add("홍희진");
		set.add("홍찬영");
		set.add("홍지성");
		set.add("차준식");
		set.add("정민교");
		set.add("장용석");
		
		set.add("차춘식");
		set.add("차춘식");
		
		
		//배열로 복사 toArray
		//1.set의 크기로 배열을 생성
		String [] nameArr= new String [set.size()];
		
		//2.복사
		set.toArray(nameArr);
		
		//값 얻기 : Iterator 사용.
		//1.Iterator 제어권 넘겨주기
		Iterator<String> ita=set.iterator();
		
		while ( ita.hasNext()) {
			System.out.println(ita.next());		}
		
		set.remove("홍찬영");
		set.remove("홍희진");
	    set.clear();
		
		
		System.out.println(set+ " / " + set.size());
		
		//배열에 복사된 값을 기존의 forloop를 사용하여 출력
		for (int i = 0; i< nameArr.length ; i++ ) {
			System.out.println(nameArr[i]);
			
		}
		
	}//UseHashset
	
	//업무 : set을 사용하여 로또 번호를 구하고, 배열로 반환
	//업무 사용 : 로또번호 출력
	
	public Integer [] lottoProcess () {
		Set<Integer> lotto = new HashSet<Integer>() ;
		Integer[] lottoArr= new Integer[6]; // 로또 번호를 저장할 배열
		Set<Integer> set = new HashSet<Integer>(); // 중복값을 제거할 자료구조
		Random r = new Random();//
		
		while ( set.size() < 6 ) {//발생되어 set에 추가된 값이 6개라면 반복문을 빠져나감
			set.add(r.nextInt(45)+1);
		}//end for
		
		set.toArray(lottoArr);
		return lottoArr;
	}
	//업무 사용 : 로또 번호 출력
	public void printLottoNum() {
		for ( int value : lottoProcess()) {
			System.out.printf("%-4D", value);
		}//end for
	}//print LottoNum
	

	

	public void UseHashtable() {
		
	}
	

	public static void main(String[] args) {
		UseSet us = new UseSet();
		us.UseHashSet();

		

	}

}
