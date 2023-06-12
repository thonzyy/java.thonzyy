

            /**Contant 변수 -> 상수
            프로그램내에서 기준값이 필요할 때
             */


             class  CreateConstant   {
             //선언 : Field에만 public static final 데이터형 상수명=값;

             public static final int MAX_SCORE=100;
	         public static final int MIN_SCORE=0;


             public static void main(String[] args) {
	         
		     //System.out.println(100-85); //상수로만 코딩하면 가독성 떨어짐
		     //가독성의 문제를 해결하고자 변수 도입 

			 int maxScore=100;
			 int myScore=85;
                 maxScore=99;//기준값이 변경되는 상황을 막기위해 => Constant 도입


			 System.out.println(maxScore-myScore);

             //Constant 사용
		     System.out.println("클래스명 생략 : " + MAX_SCORE+", 클래스명 명시 :"+
				 CreateConstant.MIN_SCORE);


             //Constant는 선언하는 부분 이외에서는 값할당 할 수 없다.
             //CreateConstant


             System.out.println("내 점수 [ "+myScore+"점 ], 최고 점수는 [ " +
				 CreateConstant.MAX_SCORE+" ] 최고 점수와 획득한 점수의 차 " +
				 (MAX_SCORE-myScore) + "점");
	                }



                            }
