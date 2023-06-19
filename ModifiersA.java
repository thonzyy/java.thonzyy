package day0616;


/**
 * 접근 지정 접근확인연습
 * @author user
 *
 */
public class ModifiersA {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main( String[]args) {
		ModifiersA ma=new ModifiersA();
		System.out.println("public a "+ma.a);
		System.out.println("protected b "+ma.b);
		System.out.println("int c "+ma.c);
		System.out.println("private d "+ma.d);
	}
	

}
