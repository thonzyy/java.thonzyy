class Work0609{

    public static final int MONTHLY_ALLOWANCE=100000;
    public static final int DAYS=20;

	public static void main(String[] args) {


		int MONTHLY_ALLOWANCE=400000;
		int DAYS=20;
		int oneWayFee=1250;
		int lunchPrice=6000;

		System.out.println("�Ѵ� �뵷�� " +MONTHLY_ALLOWANCE+
		"�� �Ϸ� �뵷��"+DAYS+"�� ��������"+(MONTHLY_ALLOWANCE/20)+
		"���Դϴ�. �Ϸ� ��� ����� �� �����"+oneWayFee+"�� �պ� �����"
		+oneWayFee*2+"�� ���ɽĴ�"+lunchPrice+"��������"+(lunchPrice+(oneWayFee*2))+
		"���Դϴ�.");
        System.out.println("�� ���� ������ ���� �ݾ�"+
			( MONTHLY_ALLOWANCE -((lunchPrice*20)+oneWayFee*20) )+"���Դϴ�");

		 System.out.println( " byte�� �ּڰ�"+ Byte.MIN_VALUE);
		 System.out.println( " Short�� �ִ�"+ Short.MAX_VALUE);




	
	
	}
}
