package day0623;

/**
 * 학생의 점수를 처리하는 프로그램 작성.
 * 
 * @author USER
 */
public class Work0623 {

	/**
	 * 학생의 총점을 구하는 일
	 * 
	 * @param score 점수를 저장한 1차원 배열
	 * @return 1차원 배열의 누적합
	 */
	public int studentTotal(int[] score) {
		int totalScore = 0;
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		return totalScore;
	}

	/**
	 * 점수를 구하는 일
	 */
	public void scoreProcess() {
		String[] names = { "김선경", "김주민", "박상준", "서효민", "송지하", "오호수" };
		int[][] score = { { 84, 87, 79 }, { 91, 100, 97 }, { 75, 79, 79 }, { 63, 66, 62 }, { 99, 99, 99 },
				{ 82, 86, 83 } };

		System.out.println("============================================================");
		System.out.println("번호\t이름\t자바\t오라클\tJDBC\t총점\t평균");
		System.out.println("============================================================");
		int total = 0;
		int javaTotal = 0;
		int oracleTotal = 0;
		int jdbcTotal = 0;
		double javaAvg = 0;
		double oracleAvg = 0;
		double jdbcAvg = 0;
		double avg = 0;
		int top = 0;
		int topIndex = 0;

		for (int i = 0; i < score.length; i++) {

			System.out.printf("%d\t%s\t", i + 1, names[i]);

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				System.out.printf("");
			}
			javaTotal += score[i][0];
			oracleTotal += score[i][1];
			jdbcTotal += score[i][2];
			javaAvg = javaTotal / names.length;
			oracleAvg = oracleTotal / names.length;
			jdbcAvg = jdbcTotal / names.length;
			total = studentTotal(score[i]);
			avg = total / score[i].length;
			if (total > top) {
				top = total;
				topIndex = i;
			}
			System.out.printf("%d\t%.2f\n", total, avg);
		}

		System.out.println("============================================================");
		// 자바,오라클, JDBC, 전체 총점
		System.out.printf("총점\t%d\t%d\t%d", javaTotal, oracleTotal, jdbcTotal);
		System.out.println();
		// 자바,오라클, JDBC, 전체 평균
		System.out.printf("평균\t%.2f\t%.2f\t%.2f", javaAvg, oracleAvg, jdbcAvg);
		System.out.println();
		// 1등 학생의 이름과 번호를 출력
		System.out.printf("1등 학생: %d번 %s\n", topIndex + 1, names[topIndex]);
	}

	public static void main(String[] args) {
		new Work0623().scoreProcess();
	}

}
