package ch05_conversion;

import java.util.Scanner;

/*
    조건문
    1. if문 : if 다음에 있는 () 내의 조건식이 yure일 때 {} 내의 실행문이 실행됨.
        false면 실행 x

        형식 :
        if (조건식) {       조건식 : true / false로 결론이 날 수 있는 식 또는 문장 실행문

  */
public class Condistion1 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용
        // 샐행되는 예시
        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }
        // 샐행안 되는 예시
        if(num1 > 15) {
            System.out.println("num1은 15 초과입니다.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();

        if(num2 > 0 ) {
            System.out.println("num2는 양수 입니다.");
        }
        // Cinditin02 aㅁ만들고 main


    }
}
