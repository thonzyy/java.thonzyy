/**
�ԷµǴ� ���ڿ��� ���� (byte,short,int,long)�� �Ǽ�( float, double)��
��ȯ (parse �����м�)
*/



class UseArgument2 {

	public static void main(String[] args) {
	         //int i=args[0];//args�� string���̹Ƿ� int���� i������ �Ҵ� �� �� ����.
			 int i =Integer.parseInt( args[0] );
			 double d=Double.parseDouble(args[1]);

			 System.out.println(i+" + 2 = "+(i+2));
			 System.out.println(d+" + 2.5 = "+( d+2.5));

			 System.out.println( args[2].equals("�ȳ�")); //args�� �ȳ�� ������

			 System.out.println( args[3].equals("�̵���")?"��! ����!!" : args[3]+"�� �ȳ��ϼ���?");

			 


			 //args[3]�� �Էµ� ���� �ڽ��� �̸��̶�� "��! ����!!' �׷��� �ʴٸ�
			 // "�Էµ� �̸�" �� �ȳ��ϼ���?"�� ���


			    
		
	}
}
