package day0623;

public class UseString {
	
	public UseString () {
		String csvData="java,oracle,JDBC~HTML,CSS,JAVAScript";
		//배열로 생성
		String[] arr=csvData.split(",");
		System.out.println(arr.length);
		
		for( int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i]);
			
		}
		
	} // 기본생성자
 
	public static void main(String[] args) {
		 new UseString();
		

	}//main

}//class
