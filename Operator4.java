/**
���迬����
>, <,>=, <=, ==, !=
*/



class Operator4 {
	public static void main(String[] args){

        //== ���� �� true, �ٸ��� false
		int i=6, j=12, k=6;

		System.out.println(i+ "=="+k+" = " + (i == k));
		boolean flag = i == j;
		System.out.println(i+ "=="+j+" = " + flag);
		// != �ٸ��� true, ������ false

		System.out.println(i+ "!="+k+" = " + (i != k));
	     flag = i != j; //���� ��ȭ �� ����
		System.out.println(i+ "=="+j+" = " + flag);
		//default value = �⺻�� , ���� �������� ���� �̸��� ������ �ϳ��� ������ �� �ִ�.
   


	}
}
