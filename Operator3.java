/**
����Ʈ ������
<<, >>, >>>
*/



class  Operator3 {


	public static void main(String[] args) {
	


		//<< : left shift : ��Ʈ�� �������� �а� ��ĭ�� �׻� 0���� ä���.
		int i=20;

		System.out.println( i+" <<2="+(i<<2));

		i=5;
		System.out.println( i+" <<4="+(i<<4));
		// 0101 0000 = 80 

		i=1;

		System.out.println( i+" <<31="+(i<<31)); // 1�̾��� ���� 31ĭ �о��� ��� ���� ���� 


		i=35;

		System.out.println( i+" >>>2="+(i>>>2)); // 1�̾��� ���� 31ĭ �о��� ��� ���� ���� 
 
		i= -1;

		System.out.println( i+" >>100="+(i>>100));

		i=40;

		System.out.println( i+" >>>1="+(i>>>1)); // 1�̾��� ���� 31ĭ �о��� ��� ���� ���� 
		// 0001 0100 0

		i=-1;
		System.out.println( i+" >>>1="+(i>>>1));

		//���ڿ��� ������� �ʴ´�. error
		// System.out.println( "10"*10);
		//���ڿ��� +�� ����Ͽ� ���ڿ� �տ� ���� �� �ִ�.














	}
}
