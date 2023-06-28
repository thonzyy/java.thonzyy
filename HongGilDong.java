package day0627;

/**
 * 사람 클래스를 상속받아 사람의 공통기능(눈,코,입, 먹는 일)을 사용하며 자신만의 특징을 정의하는 클래스 (싸움을 잘한다.)
 * 
 * @author user
 *
 */
public class HongGilDong extends Person { // 홍길동은 사람이다. is a 관계

	private int level;

	/**
	 * 기본생성자 눈2, 코1, 입 1개가 설정되어 홍길동 클래스가 생성된다. 싸움 레벨이 6으로 설정된다. <br>
	 * 싸움 레벨은 1~10까지 이며 2는 일반인이다.
	 */
	public HongGilDong() {
		super();
		level = 6;
	}// HongGilDong

	public void setLevel(int level) {
		this.level = level;
	}// setLevel

	public int getLevel() {
		return level;
	}// getLevel

	/**
	 * 싸움하는 일<br>
	 * 이기거나 지거나 비김
	 * 
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int yourLevel) {
		String result = "";

		if (yourLevel < level) { // 이기는 경우
			result = "이겼음.";
			level++;
			if (level > 10) {
				level = 10;
			} // end if
		} else if (yourLevel > level) { // 지는경우
			result = "졌음";
			level--;
			if (level < 1) {
				level = 1;
			} // end if
		} else { // 비기는 경우
			result = "비겼음";
		} // end else

		return result;
	}
	/**
	 * 주막에서 음식을 푼 내고 사먹는 일
	 *
	 */
	@Override
	public String eat( String menu , int price) {
		//name 변수는 접근 지정자가 private이므로 직접 접근이 되지 않는다.
		//자식 ㅡㅋㄹ래스에서 부모클래스의 name을 사용하고 싶다면
		//getter method를 사용하여 부모의 변수를 사용한다.
		return getName()+"이 주막에서 "+menu+"인 음식을 "+ price +"푼 내고 사먹는다";
	}

}
