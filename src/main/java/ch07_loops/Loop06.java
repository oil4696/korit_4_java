package ch07_loops;

import java.util.Scanner;

/*
    for (int i = 0 ; i < 10 ; i ++) {
        (반복실행문1-a)
        for(int j = 0 ; j < 10 ; j ++) {
            반복실행문2
        }
        (반복실행문1-b)
        for(int k = 0 ; k < 10 ; k++) {
            반복실행문3
        }
        (반복실행문1-c)
    }
    *
    **
    ***
    ****
    *****


    *****
    ****
    ***
    **
    *

    몇 줄의 별을 찍겠습니까? >>> 3
    *
    **
    ***
 */
public class Loop06 {
    public static void main(String[] args) {
//        for(int i = 0 ; i < 5 ; i++) {
//            for(int j = 0 ; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇줄의 별찍기를 실행하시겠습니까? : ");
//        int row = scanner.nextInt();
//
//        for(int i = 0 ; i < row + 1; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 0 ; i < 5 ; i++) {
//            for (int j = 5; j - i > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

