package day0629;

public abstract class Ramen {
	
	private int noodle; // 면 
	private int soupPowder; // 스프
	private int flake;// 후레이크
	private String name ; // 이름
	//명사적 특징
	
 



	
	public Ramen () {
		this(1,1,1);
	}
	
	
public Ramen ( int noodle , int soupPowder, int flake) {
	this.noodle=noodle;
	this.soupPowder=soupPowder;
	this.flake=flake;
	
}


	public int getNoodle() {
		return noodle;
	}



	public void setNoodle(int noodle) {
		this.noodle = noodle;
	}



	public int getSoupPowder() {
		return soupPowder;
	}



	public void setSoupPowder(int soupPowder) {
		this.soupPowder = soupPowder;
	}



	public int getFlake() {
		return flake;
	}



	public void setFlake(int flake) {
		this.flake = flake;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void cook () ;
	

}
