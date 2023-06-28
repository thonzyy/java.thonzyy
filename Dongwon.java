package day0627;

public class Dongwon extends Person {
	private int lapTime;

	public Dongwon() {
		super();
		lapTime = 60;
	}// 생성자

	public int getSwimmingLapTime() {
		return lapTime;
	}// getter method

	public void setSwimmingLapTime(int lapTime) {
		this.lapTime =lapTime;
	}// setter method
	
	public String swim(int yourLapTime) {
		String result="";
		if (lapTime < yourLapTime) {
			result="고수";
		} else  {
			result ="하수";
			
		}
		
		return result;
	}

}
