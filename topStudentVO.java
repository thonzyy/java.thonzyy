package day0626;

/**
 * 최고학생의 정보를 저장하기 위한 객체 최고 학생의 번호와 이름을 저장
 * 
 * @author user
 *
 */
public class topStudentVO {
	private int num;
	private String name;

	// 기본생성자
	public topStudentVO() {

	}

	// 생성자 Overload
	public topStudentVO(int num, String name) {

		this.name = name;
		this.num = num;

	}

	// getter method
	// setter method
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}// class
