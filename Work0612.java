class Work0612 {



	public static void main(String[] args) {

		// Work 1��
	    int temp1=10;
		int temp2=20;
	    System.out.println( ++temp1 + temp2--);
        System.out.println( "temp1 = " + temp1 +" / temp2 = "+ temp2 );
		// temp1=20 ���� ������������ 1 �����Ͽ� 11�� �ǰ�
		//temp2-- ���� ������ �Ǿ� 11+20�� �ȴ� (31). //
		//���� temp2���ʹ� 19�� ��ȭ�� �� ��� temp1 = 11 / temp2 = 19


		//Work 2��
		
		int i = 65535;

	    System.out.println	(i &=Integer.MAX_VALUE);

	   //Work 3��

	   int j = Integer.parseInt(args[0]);
       System.out.println((j > 0 && j < 100) ? "�Է¼���" : "������ Ȯ���ϼ���");
	   // *0<ars[0]<100* -> j > 0 && j < 100

	   //Work 4��

	  int k = Integer.parseInt(args[0]);
      System.out.println((k % 4 == 0 && (k%400==0||k % 100 != 0)) ? "����" : "������ �ƴմϴ�.");

	  





  

		
	}
}
