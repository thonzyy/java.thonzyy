package day0614;

/**
 * switch~case 사용.
 */
public class UseSwitchCase2 {

    public static final int  ZODIAC_MONKEY= 0;
    public static final int ZODIAC_CHICKEN = 1;
    public static final int ZODIAC_DOG = 2;
    public static final int ZODIAC_PIG = 3;
    public static final int ZODIAC_RAT = 4;
    public static final int ZODIAC_COW = 5;
    public static final int ZODIAC_TIGER = 6;
    public static final int ZODIAC_RABBIT = 7;
    public static final int ZODIAC_DRAGON = 8;
    public static final int ZODIAC_SNAKE = 9;
    public static final int ZODIAC_HORSE = 10;
    public static final int ZODIAC_SHEEP = 11;

    public static void main(String[] args) {
    	
        int bornYear = 1995;
    
        
    

        switch (bornYear% 12) {
            case ZODIAC_MONKEY: System.out.println("원숭이띠");break;
            case ZODIAC_CHICKEN: System.out.println("닭띠");break;
            case ZODIAC_DOG: System.out.println("개띠");break;
            case ZODIAC_PIG: System.out.println("돼지");break;
            case ZODIAC_RAT: System.out.println("쥐띠");break;
            case ZODIAC_COW : System.out.println("소띠");break;
            case ZODIAC_TIGER: System.out.println("호랑이띠");break;
            case ZODIAC_RABBIT: System.out.println("토끼띠");break;
            case ZODIAC_DRAGON: System.out.println("용띠");break;
            case ZODIAC_SNAKE: System.out.println("뱀띠");break;
            case ZODIAC_HORSE: System.out.println("말띠");break;
            default: System.out.println("양띠");
        }
    }
}
   
      
//            
//            
//                grade++;
//       
//            case GRADE_C:
//                grade++;
//        
//            case GRADE_B:
//                grade++;
//        
//            case GRADE_A:
//            case GRADE_A_PLUS:
//                grade++;
//                break;
//            default:
//                grade += 6;
//                break;
//                
//        }
//        System.out.println(score+"학점은"+grade);
//        
//        //띠구하기를 switch~case로 구현
//        public static final int GRADE_A_PLUS = 10;
//        public static final int GRADE_A = 9;
//        public static final int GRADE_B = 8;
//        public static final int GRADE_C = 7;
//        public static final int GRADE_D = 6;
//        int birth = 1995; 
//        int zodiacFlag=birth%12;
//        switch (zodiacFlag) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//        
//        
//    }
//}



//	char grade = '\u0000';
//		
//		switch (score/10) {
//		case UseSwitchCase2.GRADE_A_PLUS : 
//		case UseSwitchCase2.GRADE_A : grade='A'; break;
//		case UseSwitchCase2.GRADE_B : grade='B'; break;
//		case UseSwitchCase2.GRADE_C : grade='C'; break;
//		case UseSwitchCase2.GRADE_D : grade='D'; break;
//		default: grade='F'; 
//		}