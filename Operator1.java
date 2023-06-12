/**
단항 연산자
~,!,+,-,++,--
*/


class Operator1{

	public static void main(String[] args) {
        int i=6;
		int j=-9;

		System.out.println("~"+i+"="+~i);
		System.out.println("~"+j+"="+~j);

        // ! : NOT true <=> false
		// !은 true 나 false 앞에만 사용할 수 있다.
		// System.out.println(! 3 < 4);  // 연산의 우선순위로 error발생

		System.out.println(! (3 < 4));
		boolean flag=6>9; //
		System.out.println(!flag);

        // - : 2의 보수연산, 부호바꿈연산
	    System.out.println("~"+i+"="+-i);
		System.out.println("~"+j+"="+-j);

		// + : 형식적 제공
		System.out.println("~"+i+"="+ +i);
		System.out.println("~"+j+"="+ +j);

		// ++,-- 증가 감소 연산자 only 대상체에만 
		i=10;
		j=5;
         System.out.println("설정된 값 i  : "+i+", j :"+j);
		//전위연산 : 연산자 대상체
		--i; // 10 -> 9
		++j; // 5 -> 6

		//후위 연산 : 대상체 연산자
		i--; // 9->8
		j++; // 6->7

		//대상체가 가지고 있는 값을 변경하고 유지한다.
		System.out.println("연산 이후 값 i  : "+i+", j :"+j);

		// ++ : 대상체의 값을 1씩 증가시킨다.
		// -- : 대상체의 값을 1씩 감소시킨다.
		// ++,-- 는 전위와 후위가 다른 값을 대입시킨다.

		// 전위 : 내 것 먼저 : 증가, 감소 후 대입 수행
		
		i=6;
		int result=0;
		result= ++i;
		System.out.println("전위 연산 후 i : " +i+", result : "+result);

        // 후위 : 남의 것 먼저 대입을 수행한 후 증가, 감소 수행
	    i=6;
		result=0;
		result= i++;
		System.out.println("후위 연산 후 i : " +i+", result : "+result); //i=7, result=6

		i=10;
		j=5;
		// method에 값으로 사용될 때에도 동일한 동작을 수행
		System.out.println(" i : "+ ++i +", j : "+ j++);
		System.out.println(i+ " / "+j); 
		// int k = 10++; // 상수는 값을 변경할 수 없기 떄문에 --,++을 사용할 수가 없다.








	}
}
