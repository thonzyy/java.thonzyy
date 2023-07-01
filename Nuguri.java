package day0629;

public class Nuguri extends Ramen {
	


	@Override
	public void cook() {
		int dasima = 2;

		if (dasima >= 2) {
			System.out.println("다시마" + dasima + "개는 운수 좋은 날");
		} else if (dasima == 1) {
			System.out.println("다시마" + dasima + "개는 평범한 날");
		} else {
			System.out.println("다시마" + dasima + "개는 운수 없는 날");
		}

	}

	

}
