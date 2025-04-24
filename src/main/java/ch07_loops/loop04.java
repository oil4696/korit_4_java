package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우에 명확한 횟수가 고정되어 있을 때 사용하는 반복문

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class loop04 {
    public static void main(String[] args) {
//        int sum =0;
//        for (int i= 0 ; i < 101 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        // 1부터 100까지 중 홀수 합을 구하는 for문ㅇ을 작성하시오. (즉 ㅐㄺanssodp ㅑㄹrk 중첩가능
//
//        int sum2 = 0;
//        for (int i = 0 ; i < 101 ; i++) {
//            if(i % 2 == 1);
//            sum2 += i;
//        }
//        System.out.println(sum2);
//
//        int sum3 =0;
//        for (int i = 1 ; i < 101 ; i+=2) {
//            sum3 += i;
//        }
//        System.out.println(sum3);

        /*
            숫자를 입력 받아서 1qnxj n까지 덯라는 반복문을 작성할 겁니다.
            ㅅ
            시행ㄹ 예
            1부터 몇까지 더하시겠습니까>? : 10
            1부터 10까지의 합은 55ㅇ비니다.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇까지 더하시겠습니까? : ");
        int n = scanner.nextInt();
        int sumN =0;
//        for(int i = 0 ; i <= n ; i++) {
//            sumN += i;
//        }
        for(int i = 0 ; i < n + 1 ; i++) {
            sumN += i;
        }
        System.out.println(sumN);
    }
}
