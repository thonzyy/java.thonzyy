package day0626;

public class ConParent {
	
	
	public ConParent () {
		System.out.println("부모가 기본생성자");
	}
	public ConParent (int i) {
           
		this();
		System.out.println("부모매개생성자"+ i);
	}
//	1.
//	부모기본, 부모매개200, 자식기본, 자식 매개 100
//
//	2.
//	부모매개 100, 부모 기본, 자식매개100, 자식기본 


}
