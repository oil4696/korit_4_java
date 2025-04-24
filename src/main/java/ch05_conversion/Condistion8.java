package ch05_conversion;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(Leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나뉘어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨어지긴 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년입니다(100으로 나누어 덜어지지 않습니다.)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로 나누어 떨어지지 않습니다.)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당합니다.
 */
public class Condistion8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        String lyear;
        System.out.print("연도를 입력하세요 : ");
        year = scanner.nextInt();
        // 입력 받은 year가 윤년에 해당하는지 판단하는 조건문을 작성하시오.


        if(year % 400 == 0 ) {
            lyear = "맞다";
        } else if (year % 100 == 0) {
            lyear = "아니다";
        } else if (year % 4 == 0) {
            lyear = "맞다";
        } else {
            lyear = "아니다";
        }
        System.out.println(year + "는 " +  lyear);

        // 논리 연산자 사용
        System.out.print("연도를 입력하세요 >>> ");
        // 변수 선언 및 초기화 바로 하겠습니다.
        int year2 = scanner.nextInt();
        String leapYear = "";

        if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
            leapYear = "윤년입니다.";
        } else {          // 여기 조건은 좀 달라집니다. 4로 나누어 떨어지지 않거나 // 100으로 나누어지거나
            leapYear = "윤년이 아닙니다";
        }

        System.out.println(year2 + "년은 " + leapYear);




    }
}
