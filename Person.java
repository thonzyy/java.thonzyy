package day0627;

/**
 * 사람을 대상으로 한 클래스<br>
 * 사람의 공통 특징을 구현하였다. <br>
 * 명사적 특징 : 눈, 코, 입. 이름 <br>
 * 동사적 특징 : 먹는일 <br>
 * 객체를 생성하여 사용<br>
 *  person 객체명=new Person();
 *
 */
public class Person {
	
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	public Person () { //생성자 만들기
		this(2,1,1);
//		eye=2;
//		nose=1;
//		mouth=1;
	}
	
	/**
	 * 입력된 값으로 눈, 코, 입의 개수를 설정하여 사람 객체를 생성하는 생성자
	 * @param eye 눈의 수
	 * @param nose 코의 수 
	 * @param mouth 입의 수
	 *
	 */
	public Person (int eye, int nose, int mouth) { //생성자 만들기
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}
	
	
 
/**
 * 생성된 사람 객체의 눈 개수를 설정하는 일
 * @param eye 설정할 눈의 수
 * @author user
 *
 */

	public void setEye(int eye) {
		this.eye=eye;

	}//setEye
	
	/**
	 * 생성된 사람 객체의  코 개수를 설정하는 일
	 * @param nose 설정할 눈의 수
	 * @author user
	 *
	 */
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	/**
	 * 생성된 사람 객체의  입 개수를 설정하는 일
	 * @param Mouth 설정할 입의 수
	 * @author user
	 *
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	/**
	 * 생성된 사람 객체의  이름을 설정하는 일
	 * @param name 설정할 이름
	 * @author user
	 *
	 */
	public void setName(String name) {
		this.name=name;
	}//setName
	/**
	 * 생성된 사람의 객체가 가지고 있는 눈의 개수를 얻는 일
	 * @return 눈의 수
	 * @author user
	 *
	 */
	public int getEye() {
		 return eye;
	 }
	/**
	 * 생성된 사람의 객체가 가지고 있는 코의 개수를 얻는 일
	 * @return 코의 수
	 * @author user
	 *
	 */
	public int getNose() {
		return nose;
	}
	/**
	 * 생성된 사람의 객체가 가지고 있는 입의 개수를 얻는 일
	 * @return 입의 수
	 * @author user
	 *
	 */
	public int getMouth() {
		return mouth;
	}

	/**
	 * 생성된 사람의 객체가 가지고 있는 이름을 얻는 일
	 * @return 이름
	 * @author user
	 *
	 */
	public String getName() {
		return name;
	}
	/**
	 * 생성된 사람의 객체가 집에서 밥을 먹는 일
	 * @return 밥 먹는 일
	 * @author user
	 *
	 */
	public String eat () { //동사적 특징
		return name+"이 집에서 밥을 앙냥냥냥 먹는다";
	}

	/**
	 * 생성된 사람의 객체가 밖에서 음식을 사먹는 일
	 * @param menu 음식 종류
	 * @param price 음식 가격
	 * @return 먹는 일
	 * @author user
	 *
	 */
	public String eat (String menu, int price) { //동사적 특징
		return name+"이 식당에서 "+menu+"인 음식을 "+price+"원 주고 사먹는다. ";
	}
	
	


	 
	 
}//
