package practice;
import java.util.Scanner;
public class Selfhelp
{

    String name;
    int age;

    Selfhelp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.printf("저를 소개합니다.\n제 이름은 %s \n나이는 %d입니다.\n-------------\n", name, age);
//		printf 사용법:모르는 값을 % 해놓고 뒤에 ,로 변수를 작성해야한다.
//		%s:문자열 , %d: 정수, %.2f:(소숫점자리수 두자리가 나오면 좋겠다 .2 한자리나오면 좋겠다 .1) %c: 문자
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in); // 스캐너클래스의 객체를 생성합니다.

        System.out.println("이름과 나이를 입력해주세요>>");
        String name = sc.next(); // 스캐너객채를 사용합니다.
        int age = sc.nextInt();

        sc.close(); // 사용하고 닫아줍니다.


        Selfhelp s = new Selfhelp(name, age);
        s.introduce();
    }
}
