package ch08_methods;

import java.util.Scanner;/*
    bmi 꼐산기 methodfmf 정의하고 실행시킬겁니다.
    메서드명 calculateBmi()
    return : void
    aoroqustn dban : 없음
 */

public class Method04 {
    public static void calculateBmi() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tall;
        int wethit;
        String grade;

        System.out.print("키를 입력하세요 : ");
        tall = scanner.nextInt()/100;
        System.out.print("몸무게를 입력하세요 : ");
        wethit = scanner.nextInt();
        sum = wethit / tall;
        if(sum >= 30){
            System.out.println("비만입니다. : ");
        } else if (sum >= 25) {
            System.out.println("과체중 입니다. : ");
        } else if (sum >= 20) {
            System.out.println("정상 체중입니다. : ");
        } else {
            System.out.println("저체중 입니다. : ");
        }
        System.out.println("당신의 BMI는" + sum + "이며" );

    }
    public static void main(String[] args) {

        calculateBmi();
        /*
            실행 예
            키(cm)을 입력하세요 :
            몸무게()kg를 입력하세요 :
            당신의 BMI 지수는 23.08
         */

    }
}
