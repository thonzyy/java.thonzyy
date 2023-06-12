class Work0609{

    public static final int MONTHLY_ALLOWANCE=100000;
    public static final int DAYS=20;

	public static void main(String[] args) {


		int MONTHLY_ALLOWANCE=400000;
		int DAYS=20;
		int oneWayFee=1250;
		int lunchPrice=6000;

		System.out.println("한달 용돈은 " +MONTHLY_ALLOWANCE+
		"원 하루 용돈은"+DAYS+"일 기준으로"+(MONTHLY_ALLOWANCE/20)+
		"원입니다. 하루 사용 비용은 편도 교통비"+oneWayFee+"원 왕복 교통비"
		+oneWayFee*2+"원 점심식대"+lunchPrice+"원으로총"+(lunchPrice+(oneWayFee*2))+
		"원입니다.");
        System.out.println("한 달이 지나면 남은 금액"+
			( MONTHLY_ALLOWANCE -((lunchPrice*20)+oneWayFee*20) )+"원입니다");

		 System.out.println( " byte의 최솟값"+ Byte.MIN_VALUE);
		 System.out.println( " Short의 최댓값"+ Short.MAX_VALUE);




	
	
	}
}
