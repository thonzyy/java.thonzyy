/*
외부 클래스에 존재하는 Constant 사용.
*/





   class UseContant {

	    public static void main(String[] args) {
	
	    //System.out.println(MAX_SCORE);
        //Constant를 가지고 있는 클래스를 명시하여 사용.
	    System.out.println(CreateConstant.MAX_SCORE);
	    System.out.println("byte의 최고값 : " +Byte.MAX_VALUE);
  	    System.out.println("byte의 최저값 : " +Byte.MIN_VALUE);

	}
}
