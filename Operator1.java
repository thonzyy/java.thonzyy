/**
���� ������
~,!,+,-,++,--
*/


class Operator1{

	public static void main(String[] args) {
        int i=6;
		int j=-9;

		System.out.println("~"+i+"="+~i);
		System.out.println("~"+j+"="+~j);

        // ! : NOT true <=> false
		// !�� true �� false �տ��� ����� �� �ִ�.
		// System.out.println(! 3 < 4);  // ������ �켱������ error�߻�

		System.out.println(! (3 < 4));
		boolean flag=6>9; //
		System.out.println(!flag);

        // - : 2�� ��������, ��ȣ�ٲ޿���
	    System.out.println("~"+i+"="+-i);
		System.out.println("~"+j+"="+-j);

		// + : ������ ����
		System.out.println("~"+i+"="+ +i);
		System.out.println("~"+j+"="+ +j);

		// ++,-- ���� ���� ������ only ���ü���� 
		i=10;
		j=5;
         System.out.println("������ �� i  : "+i+", j :"+j);
		//�������� : ������ ���ü
		--i; // 10 -> 9
		++j; // 5 -> 6

		//���� ���� : ���ü ������
		i--; // 9->8
		j++; // 6->7

		//���ü�� ������ �ִ� ���� �����ϰ� �����Ѵ�.
		System.out.println("���� ���� �� i  : "+i+", j :"+j);

		// ++ : ���ü�� ���� 1�� ������Ų��.
		// -- : ���ü�� ���� 1�� ���ҽ�Ų��.
		// ++,-- �� ������ ������ �ٸ� ���� ���Խ�Ų��.

		// ���� : �� �� ���� : ����, ���� �� ���� ����
		
		i=6;
		int result=0;
		result= ++i;
		System.out.println("���� ���� �� i : " +i+", result : "+result);

        // ���� : ���� �� ���� ������ ������ �� ����, ���� ����
	    i=6;
		result=0;
		result= i++;
		System.out.println("���� ���� �� i : " +i+", result : "+result); //i=7, result=6

		i=10;
		j=5;
		// method�� ������ ���� ������ ������ ������ ����
		System.out.println(" i : "+ ++i +", j : "+ j++);
		System.out.println(i+ " / "+j); 
		// int k = 10++; // ����� ���� ������ �� ���� ������ --,++�� ����� ���� ����.








	}
}
