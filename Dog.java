package day0620;


/**
 * @author user
 *
 */
public class Dog {
	private int eye;
	private int nose;
	private int mouth;
	private int tail;
	private String name;
	/**
	 *  생성된 개의 눈의 개수를 설정하는 일
	 *  @param eye
	 * @author user
	 *
	 */
 public void setEye(int eye) {
	 this.eye=eye;
	 
 }
	/**
	 *  생성된 개의 코의 개수를 설정하는 일
	 *  @param nose
	 * @author user
	 *
	 */
public void setNose(int nose) {
	this.nose=nose;
}
/**
 *  생성된 개의 입의 개수를 설정하는 일
 *  @param mouth
 * @author user
 *
 */
public void setMouth(int mouth) {
	this.mouth=mouth;
}
/**
 *  생성된 개의 꼬리의 개수를 설정하는 일
 *  @param tail
 * @author user
 *
 */
public void setTail(int tail) {
	this.tail=tail;
}
/**
 *  생성된 개의 이름을 설정하는 일
 *  @param name 설정할 이름
 * @author user
 *
 */
public void setName(String name) {
	this.name=name;
}
/**
 * 생성된 개의의 객체가 가지고 있는 눈의 개수를 얻는 일
 * @return 눈의 수
 * @author user
 *
 */
public int getEye() {
	 return eye;
}
/**
 * 생성된 개의의 객체가 가지고 있는 코의 개수를 얻는 일
 * @return 코의 수
 * @author user
 *
 */
public int getNose() {
	 return nose;
}
/**
 * 생성된 개의의 객체가 가지고 있는 입의 개수를 얻는 일
 * @return 입의 수
 * @author user
 *
 */
public int getMouth() {
	 return mouth;
}
/**
 * 생성된 개의의 객체가 가지고 있는 꼬리의 개수를 얻는 일
 * @return 꼬리의 수
 * @author user
 *
 */
public int getTail() {
	 return tail;
}
/**
 * 생성된 개의의 객체가 가지고 이름을 얻는 일
 * @return 이름
 * @author user
 *
 */
public String getName() {
	 return name;
}
/**
 * 생성된 개의 객체가 집에서 장난감을 가지고 노는 일
 * @return 노는 일
 * @author user
 *
 */
public String play () { //동사적 특징
	return name+"이(가) 집에서 장난감을 가지고 논다";
}

/**
 * 생성된 개의 객체가 공원에서 다른 장난감을 가지고 노는 일
 * @param toy 장난감 종류
 * @param num 장난감 개수
 * @return 노는 일
 * @author user
 *
 */
public String play (String toy, int num) { //동사적 특징
	return name+"이(가) 공원에서 "+toy+"을(를) "+num+"개 가지고 논다. ";
}

}
