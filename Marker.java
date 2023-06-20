package day0620;

/**
 * 마카펜의 기능을 구현한 클래스<br>
 * 마카펜- 명사적 : 뚜겅, 몸체, 색
 *             동사적 : 쓴다 
 * @author user
 *
 */

public class Marker {
	
 //인스턴스변수
	    private int cap;
		private int body;
		private String color;
		/**
		* 마카펜 클래스의 기본생성자<br>
		* 뚜껑 1개, 몸체 1개, 검은색인 마카펜 객체를 생성하는 일.
		*/
		public Marker() {
			cap=1;
			body=1;
			color="검은";
		}
		/**
		* 뚜껑 1개, 몸체 1개, 검은색인 마카펜 객체를 생성하는 생성자.
		* 뚜껑의 수와 몸체의 수는 같게 설정합니다. 같지 않으면 몸체의 수대로 뚜껑의 수가
		* 설정된다.
		* 색은 검은, 빨간, 파란만 설정할 수 있다. 이 색이 아니면 검은색으로 설정
		* @param cap 뚜껑의 수
		* @param body 몸체의 수
		* @param color 색
		* 
		*/
		
		public Marker(int cap, int body, String color) {
			if (cap != body) {
				cap=body;
			}//end if
			if (!(color.equals("검은") || color.equals("빨간") ||color.equals("파란"))) {
				color="검은";	
			}//if
			this.cap=cap;
			this.body=body;
			this.color=color;
		}
		
		public void setCap(int cap) {
			this.cap=cap;
			
		}
		public void setBody(int body) {
			this.body=body;
			
		}
		
		
		public void setColor(String color) {
			this.color=color;
			
			
		}
		
		public int getCap() {
			return cap;
		}
		public int getBody() {
			return body;
		}
		
		public String getColor() {
			return color;
		}
		
		/**
		 * 마카펜의 동사적 특징을 구현한 method
		 * 입력받은 메시지를 칠판에 쓰는 일
		 * @param msg 칠판에 쓸 메시지
		 * @return 행동
		 * @author user
		 *
		 */
		public String write(String msg) {
			
			return color+"색인 마카펜으로 칠판에" + msg+"를 쓴다.";
			
		}//main
		
		
	

}//class
