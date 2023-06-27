package day0626;

public class ConChild extends ConParent{
	
	public ConChild () {
    super(200);
		System.out.println("자식의 기본 생성자");
	} 
	public ConChild (int i ) {

		this();
		System.out.println("자식의 매개 생성자"+i);
	}


}

