package day0626;

/**
 * SuperClass의 자식 클래스
 * 
 * @author user
 *
 */
public class SubClass extends SuperClass { // 부모클래스를 알 수 있다.
    int i;
    public SubClass() {
    	System.out.println("자식의 method : "+i);
    }
    
    public void printl() {
    	System.out.println("자식의 method : "+i);
    	
    }//println
	public static void main(String[] args) {
		//자식클래스를 객체화 하면 부모부터 생성된다.
		SubClass sc=new SubClass();
		sc.scI=100;// 부모의 변수 => 코드의 재사용성, 자식 클래스의 객체명으로, 자식클래스가 가진 것처럼 사용.
		sc.i=200;// 자신의 변수
		sc.printSci();//부모의 method => 코드의 재사용성
		sc.printl();//자신의 method
	}//main

}//class
