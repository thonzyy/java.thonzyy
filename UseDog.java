package day0620;

/**
 *  Dog 클래스를 생성하여 사용하는 일.
 * @author user
 *
 */
public class UseDog {

	public static void main(String[] args) {
		//객체생성
		Dog hodu = new Dog();
		hodu.setEye(2); // 변수대입
		hodu.setMouth(1);
		hodu.setNose(1);
		hodu.setTail(1);
		hodu.setName("호두");
		 System.out.printf("눈의 개수%d,입의 개수%d,코의 개수%d,꼬리의 개수%d, 이름 %s\n",
				 hodu.getEye(), hodu.getMouth(),hodu.getNose(),hodu.getTail(), hodu.getName());
		 System.out.println(hodu.play());
		 System.out.println(hodu.play("공",3));
		 
		 

	}

}
