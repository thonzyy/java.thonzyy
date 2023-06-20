package day0620;

/**
 * person 클래스를 생성하여 사용하는 일.
 * @author user
 *
 */
public class UsePerson {

	/**
	 * java application
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		//객체 생성
		Person dongwon=new Person();
//		dongwon.setEye(2);
//		dongwon.setNose(1);
//		dongwon.setMouth(1);
		dongwon.setName("이동원");
		System.out.printf("눈의 수 %d,코의수 %d, 입의수 %d, 이름 %s\n",
		
		          dongwon.getEye(),dongwon.getNose(),dongwon.getMouth() ,
		          dongwon.getName());
		//객체가 제공하는 기능을 사용.
		            System.out.println(dongwon.eat());
		            System.out.println(dongwon.eat("돈까스",13000));
		            
		            //사람 객체를 생성
		            Person jinban = new Person(3,1,1); //생성자 만들고 파라미터에 값 넣기 
		            
//		            jinban.setEye(3);
//		            jinban.setNose(1);
//		            jinban.setMouth(1);
		            jinban.setName("천진반");
		            
		            System.out.printf("눈의 수 %d,코의수 %d, 입의수 %d, 이름 %s\n",
		            		jinban.getEye(), jinban.getNose(),jinban.getMouth(),jinban.getName());
		            
		            System.out.println(jinban.eat());
		            System.out.println(jinban.eat("선두",0));
		            System.out.println("-----------------------------------------");
		            //객체 생성
		            
		            Person dongwonn = new Person();
		            
		            
		            
		            //값 할당
		            dongwonn.setEye(1);
		            dongwonn.setNose(1);
		            dongwonn.setMouth(1);
		            dongwonn.setName("이동원원");
		            
		            
		            
		            // 객체 사용
		            
		            System.out.printf("눈의 수 %d, 코의 수 %d, 입의 수%d, 이름 %s\n", 
		            		dongwonn.getEye(),dongwonn.getNose(),dongwonn.getMouth(),dongwonn.getName());
		            
		           System.out.println(dongwonn.eat());
		           System.out.println(dongwonn.eat("삼겹살",15000));
		           
		            
		
		

	}//main
	

}//class
