package day0630;

/**
 * Local class
 * @author user
 *
 */
public class LocalOutter {
	
	int out_i;
	
	public LocalOutter() {
		System.out.println("외부클래스의 생성자");
	}//LocalOutter
	
	public void method(final int paramI, int paramJ) {
		final int loc_i=0;
		int loc_j=0;
		/////////////////////////////지역클래스 시작////////////////////////////////////
		class Inner{
			int in_i;
			public Inner() {
				System.out.println("Local class의 생성자");
			}
			public void inMethod () {
				System.out.println("Local class 의 inner "+ in_i);
				out_i=12;
				System.out.println("외부 class 의 instance변수 "+ out_i);
				//외부클래스의 인스턴스 변수는 얼마든지 사용가능
				//내부 클래스에서는 final이 있는 지역변수만 사용할 수 있다.
//			paramI=10;
//    		paramJ=10; // JDK 1.8부터 final이 없지만 final이 있는 효과가 있다.
				System.out.println("매개변수 : paramI "+ paramI+", paramJ "+paramJ);
				System.out.println("지역변수 : loc_i : "+ loc_i+", loc_j : "+loc_j);
				
			}// inMethod
			
		}//class
		
		/////////////////////////////지역클래스 끝////////////////////////////////////
		Inner in = new Inner(); //인스턴화
	
		in.inMethod(); // 메소드 호출
	}//method

	public static void main(String[] args) {
		LocalOutter lo = new LocalOutter(); // 객체생성
		
		lo.method(2023,6);
		
		

	}

}
