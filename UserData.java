package day0720;

import java.io.Serializable;

/**
 * 직렬화가 가능한 클래스
 * @author user
 *
 */
public class UserData implements Serializable {
	// 트랜지언트가 선언되면 직렬화를 방지할 수 있다.
	private static final long serialVersionUID = -369161940000111123L;
	private /*transient*/ String name;
	private double height;
	private /*transient*/ double weight;

	public UserData(String name, double height, double weight) { // 임자 있는 생성자
		super();

		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "UserData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
