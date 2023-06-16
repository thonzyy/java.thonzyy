package day0615;

public class java0614 {
    // 기준값으로 사용할 Constant 생성
    public static final int TOWN_BUS = 800;
    public static final int BUS = 1250;
    public static final int SUBWAY = 1300;

    public static void main(String[] args) {
        // int fare=0; 변수를 바깥에 만든다. 메모리를 사용
		if (args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철")) {
			int fare = 0; // 대중교통에만 변수를 만든다.
			int distance = Integer.parseInt(args[1]);// 입력된 이동거리를 저장하는 변수;
			int overFare = 0;
			// 대중교통 요금을 구하자
			if (args[0].equals("마을버스")) {
				fare = java0614.TOWN_BUS;
			} else if (args[0].equals("버스")) {
				fare = java0614.BUS;
			} else {
				fare = java0614.SUBWAY;
			} // end else
				// 초과요금을 구하기 위한 코드 작성
				// 10km까지는 기본요금이고, 이동거리가 10km을 초과하면, 매 5km마다 100원이 추가된다.
			if (distance > 10) { // 10키로를 초과했을 때에만 초과요금을 계산.
				overFare=(((distance-10)/5)+1)*100;
			 
			}//end if

				// 변수 fare를 사용하여 출력하는 문장 작성
				System.out.println("입력하신 교통수단 " + args[0] + " 이고, 이동거리는" + distance + "km이다");
				System.out.println("교통수단의 기본요금은 " + fare + " 이고, 왕복요금" + (fare+overFare)*2 + "원 한달"
						+ "20일 기준이용 총 이용요금"+(fare+overFare)*40+"입니");

        }//end if
    }
}
