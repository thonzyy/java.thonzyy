package day0626;

public class Parent {
	
	int p_i;
	int p_j;
	
	public Parent (int i) {
		
	} //생성자를 만들면 자식클래스에서 error가 발생.
	public void printPI() {
		System.out.println("부모의 "+p_i+" / " + p_j);
	}


}
