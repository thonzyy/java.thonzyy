

            /**Contant ���� -> ���
            ���α׷������� ���ذ��� �ʿ��� ��
             */


             class  CreateConstant   {
             //���� : Field���� public static final �������� �����=��;

             public static final int MAX_SCORE=100;
	         public static final int MIN_SCORE=0;


             public static void main(String[] args) {
	         
		     //System.out.println(100-85); //����θ� �ڵ��ϸ� ������ ������
		     //�������� ������ �ذ��ϰ��� ���� ���� 

			 int maxScore=100;
			 int myScore=85;
                 maxScore=99;//���ذ��� ����Ǵ� ��Ȳ�� �������� => Constant ����


			 System.out.println(maxScore-myScore);

             //Constant ���
		     System.out.println("Ŭ������ ���� : " + MAX_SCORE+", Ŭ������ ��� :"+
				 CreateConstant.MIN_SCORE);


             //Constant�� �����ϴ� �κ� �̿ܿ����� ���Ҵ� �� �� ����.
             //CreateConstant


             System.out.println("�� ���� [ "+myScore+"�� ], �ְ� ������ [ " +
				 CreateConstant.MAX_SCORE+" ] �ְ� ������ ȹ���� ������ �� " +
				 (MAX_SCORE-myScore) + "��");
	                }



                            }
