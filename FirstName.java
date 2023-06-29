package day0627;

public class FirstName extends lastNamePrint{ // 상속
	
	public void printName(String[] nameArr) { //method 생성, Override
		super. printName(nameArr);
		System.out.println();
		for (String name : nameArr) { 
			System.out.print(name.substring(1,3)+" ");
			
		}
		
		
	//부모 method호출 : 성
	//이름을 출력하는 일
		
		

	}
	
	public static void main(String[] args) {

	String[] nameArr = {"강다연","김다영","김선경","김인영","김주민","박상준","박서영"};
	
	FirstName fn = new FirstName(); // 객체생성
	lastNamePrint ln = new FirstName(); // is a 관계의 객체화
	fn.printName(nameArr);
	System.out.println();
	ln.printName(nameArr); // 자식의 method를 사용 불가하지만 is a관계를 사용하면
	// 동일한 메소드 명을 가진 자식의 method를 사용할 수 있다.

	
	
		

		
	}

}
