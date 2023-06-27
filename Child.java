package day0626;

public class Child extends Parent {
	public Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	int p_i;
	int c_i;
    public void printPI() {
    	//인스턴스 영역에서는 this 가 생략 되어있다.
    	//부모와 자식이 같은 이름의 변수를 가지고 있으면
    	this.p_i=10; // 자식의 변수를 사용
    	super.p_i=100; // 자식의 시작주소를 건너 뛰고 부모의 시작 주소를 찾는다.
    	System.out.println("자식의 method " + p_i+ " / c_i "+c_i);
    	//부모에만 있는 변수나 method는 this로 사용할 수 있다.
    	this.p_j=300;
    	System.out.println("부모의 변수 super.p_j "+super.p_j
    			+ " , this.p_j :" + this.p_j);
    	super.printPI(); //부모의 method 와 연결
    	System.out.println(this);
//    	System.out.println(super);// super는 출력되지 않는다.
    	
    }

	public static void main(String[] args) {
		Child c = new Child(100);
		System.out.println(c);
		c.printPI();
		Integer in = new Integer(100);
		
		
	}

}
