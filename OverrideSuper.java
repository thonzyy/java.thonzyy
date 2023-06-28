package day0627;

public class OverrideSuper {
	int super_i;
	
	/**
	 * final이 접근지정자로 사용된 method는 Override 할 수 없다. 
	 */
	public /* final*/ void print() { //final은 override 할 수 없다.
		System.out.println("부모 Super_i :"+super_i);
	}

	
	protected void overTest () { //접근지정자의 연습
		
	}
}
