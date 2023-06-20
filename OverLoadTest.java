package day0620;

public class OverLoadTest {
 
	//호출하면 *을 하나 출력하는 method를 작성
	/**
	*별을 하나 출력하는 일
	*/
	public void printStar() {
	System.out.println("★");
	
	}
	// 호출되면 *을 입력되는 개수만큼 출력하는 method를 작성
	/**
	*입력하는 수 만큼의 별을 출력하는 일
	*@param cnt출력할 별의 개수.
	*/
	public void printStar(int cnt) {
		for(int i = 0; i < cnt ; i++) {
			
			System.out.println("☆");
		} //end for
		
		
		
		
	}//printstar
	public static void main(String[]args) {
		OverLoadTest ot= new OverLoadTest();
		ot.printStar(10);
	
	}


	
}