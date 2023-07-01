package day0629;

public class Shinramen extends Ramen {
	
	
	

	
     @Override
	public void cook() {
    	 
    	 int water = 600;
	

		if (water > 500) {
			System.out.println("신라면은 싱거움");
		} else if (water < 500 && water > 400) {
			System.out.println("신라면은 맛있다");
		} else {
			System.out.println("신라면은 싱거움");
		}
	}



}
