package day0704;

import java.text.DecimalFormat;
import static java.lang.Long.MAX_VALUE;


public class UseDecimalFormat {
	
	public  UseDecimalFormat() {
		
		int i = 2_147_483_647;
		System.out.println(i);
		
		i = 2023;
		//Letter 0 : 해당 자리에 데이터가 없으면 0을 채워서 반환
		

		DecimalFormat df = new DecimalFormat("0,000,000");
		System.out.println(df.format(i));
		
		
		
        //Letter # : 데이터가 있는 것 까지만 출력	
		DecimalFormat df2 = new DecimalFormat("#,###,###");
		System.out.println(df2.format(i)); 
		
		//실수의 자릿 수 설정
		double d = 2023.1234;
		DecimalFormat df3 = new DecimalFormat("#,###,###.##");
		System.out.println(df3.format(d)); 
		
//		i = Integer.MAX_VALUE;
		// MAX_VALUE는 9223372036854775807
		//DecimalFormat 사용하여 3자리마다 , 을 출력하세요.
		long k = MAX_VALUE;
		
		DecimalFormat df4 = new DecimalFormat("0,000");
		System.out.println(df4.format(k));
		
		}


	

	public static void main(String[] args) {
		new UseDecimalFormat();

	}

}
