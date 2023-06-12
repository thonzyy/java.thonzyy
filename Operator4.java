/**
관계연산자
>, <,>=, <=, ==, !=
*/



class Operator4 {
	public static void main(String[] args){

        //== 같을 때 true, 다르면 false
		int i=6, j=12, k=6;

		System.out.println(i+ "=="+k+" = " + (i == k));
		boolean flag = i == j;
		System.out.println(i+ "=="+j+" = " + flag);
		// != 다르면 true, 같으면 false

		System.out.println(i+ "!="+k+" = " + (i != k));
	     flag = i != j; //관계 변화 후 대입
		System.out.println(i+ "=="+j+" = " + flag);
		//default value = 기본값 , 같은 영역에서 같은 이름의 변수는 하나만 선언할 수 있다.
   


	}
}
