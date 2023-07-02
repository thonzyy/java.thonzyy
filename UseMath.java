package day0630;

public class UseMath {
	
	public UseMath () {
		int i = -6;
		double d= -2023.06;
		
		System.out.println(i+"의 절댓값 : "+Math.abs(i));
		System.out.println(i+"의 절댓값 : "+Math.abs(d));
		
		d=3.6; // 소수점 첫번쨰 자리에서 반올림된다.
		System.out.println(d+"의 반올림 : " + Math.round(d));
		
		d=10.0001;
		
		System.out.println(d+"의 올림 : " + Math.ceil(d));
		
		d=10.9;
		
		System.out.println(d+"의 내림 : " + Math.floor(d));
		System.out.println(d+"를 절사 : "+(int)d); // 캐스팅을 이용하여 절사
		
		//random number
		//0. 16 x0 ~ 0. 16x9
		d=Math.random();
		System.out.println("발생한 수 : "+d);
		int num = (int) (d*10);
		System.out.println("범위의 수에서 정수 : "+num); // 10개의 난수 0.0~0.9
		
		//1~10까지 임의의 수 하나를 얻어 출력해보세요
		num= (int)(d*10)+1; 
		
		System.out.println("임의의 수 "+((int)d+1));
		
		//대문자 a의 코드 값은 97입니다. 소문자 z의 코드값 122
		//알파벳 대문자 중 임의의 문자하나를 출력해보세요
		
		
			System.out.println( (char)((Math.random()*26)+97));
			
			//숫자 0의 코드값은 48입니다. 숫자 9의 코드값은 57
			//숫자 0~9 중 임의의 숫자 하나를 출력해보세요

			System.out.println( (char)((Math.random()*10)+48)); // 난수의 원하는 수만큼을 곱한다
		
		
		
		
	}// 기본생성자

	public static void main(String[] args) {
		
         new UseMath () ;// 인스턴스화
		

	}

}
