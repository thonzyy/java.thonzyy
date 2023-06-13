package day0613;

/**
 * 단일 if문 사용)<br>
 * 조건에 맞을 때에만 코드를 실행. <br>
 * 문법)<br>
 * if( 조건식 ) {<br>
 *  조건에 맞을 때 수행할 문장 들....<br>
 *   }
 * @author user
 *
 */
public class Useif {

	public static void main(String[] args) {
		// 매개변수로 입력된 수의 절대값
		int num =Integer.parseInt(args[0]);//반드시 실행
		
		System.out.print(num+"의 절댓값");//반드시 실행
		
		if( num<0) { //보다 작을 때 절댓값 붙여줌
			
		num=-num;// 상황에 따라 실행
		}//end if
		
		System.out.println(num+"입니다");//반드시 실행
		
		//char 형의 변수를 만들고 임의의 문자를 넣는다.
		// 입력된 문자가 대문자, 소문자인 경우에만 해당 문자를 출력하는 코드를 작성.
		// A(65), Z(90), a(97),z(122)
		
		char a = 'C';
		if( (a > 64 && a < 91) || (a>89 && a<123)){
		
			
			
			System.out.println(a);
			
			
			
		}//end if
		
		//int 형의 변수를 만들고 임의의 숫자를 할당한다.
		//입력된 숫자가 0~100사이인 경우에만 
		// 과락 40점 미만면 
		// 다른과목 참조 60점 미만면 
		// 합격을 출력한다. 60점 이상
		int score = 39;
		
		if ( score > -1 && score < 40) { 
				System.out.println("과락");
			}//end if
		if(score>39 && score<60) {
			System.out.println("다른과목 참조");
		}//end if
		if(score>59 && score<101) {
			System.out.println("합격");
		}//end if
			
				
		
		
	}

}
