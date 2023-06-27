package day0626;

/**
 * @author user
 *
 */
public class UseStudent {

	public static void main(String[] args) {
		// 학생 한 명의 정보를 저장
		Student stu = new Student("강다연", 25, 173.4, 0.0, "kang@test.com");// 객체생성
		// 값을 여러 개 묶어서 가지고 있음.
		System.out.printf("학생명 : %s 나이 : %d, 키 : %.1f, 몸무게: %.1f , 이메일 %s\n", stu.getName(), stu.getAge(),
				stu.getHeight(), stu.getWeight(), stu.getEmail());

		// 학생 여러명의 정보를 저장 => 일괄처리 => 배열
		// 1.배열선언
		Student[] strList = new Student[3];
		for (int i = 0; i < strList.length; i++) {
			System.out.println(strList[i]);
			// 2 모든 방의 값이 null로 초기화

		}
		// 3. 배열의 각방의 값을 설정
		strList[0] = new Student("김선경", 26, 185.54, 75.77, "sk@test.com");
		strList[1] = new Student("김주민", 27, 179.11, 76.52, "jumin@test.com");
		strList[2] = new Student("김선경", 26, 180.54, 75.77, "park@test.com");
		System.out.println("이름\t나이");
		for (int i = 0; i < strList.length; i++) {
			System.out.println(strList[i].getName()+"\t"+strList[i].getAge());
		}
		System.out.println("이름\t나이\t키");
		Student temp = null;
		
		for (int i = 0; i < strList.length; i++) {
			temp=strList[i];
			System.out.println(temp.getName()+"\t"+temp.getAge()+"\t"+
			temp.getHeight());
		}
	}//main

}//class
