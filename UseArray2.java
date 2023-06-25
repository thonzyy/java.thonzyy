package day0623;

public class UseArray2 {
	public UseArray2() {
		
	}//UseArray2
	
	public void arrayUse2() {
	//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
	int[][] arr2= {{1,2,3,4,5},{6,7,8,9,10}};
	int[] arrTemp=arr2[0]; // 특정 행을 일차원 배열에 할당할 수 있다.
    for( int i = 0 ; i < arrTemp.length ; i ++) {
    	System.out.print(arrTemp[i]+" ");
    	
    	
    }//end for
    
    System.out.println("\n-------------------");
    //일차원 배열을 이차원 배열에 행에 넣을 수 있다.
    
    int[] arr = {100,200,300,400,500};
    arr2[1]=arr;
    
    for(int i = 0 ; i < arr2.length ; i++ ) { //행
    	for(int j = 0 ; j <arr2[i].length ; j++) {
    		System.out.println(arr2[i][j]+"\t");
    	}//end for
    	
    	System.out.println();
    }//end for
    
	}//arrayUse2
	

	public static void main(String[] args) {
		
		new UseArray2().arrayUse2();

	}//main

}//class
