package ch05_conversion;

import java.util.Scanner;

public class Condistion6 {
    public static void main(String[] args) {
        // Condition05를 생각했을 떄 100 초과 / 0 미만의 출
        Scanner scanner = new Scanner(System.in);

        int score;
        String grade = "";

        System.out.print("성적을 입력하세요 : ");
        score = scanner.nextInt();
        // 문제 형식을 해결하지 못하는 방식
//        if(score > 89) {
//            grade = "A";
//        } else if (score > 79) {
//            grade = "B";
//        } else if (score > 69) {
//            grade = "C";
//        } else if (score > 59) {
//            grade = "D";
//        } else  if (score <= 59) {
//            grade = "F";
//        } else  if (score > 100) {
//            grade = "X";
//        } else  if (score < 0) {
//            grade = "X";
//        }
//
        if (score > 100) {
            grade = "X";
        } else if (score < 0) {
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else  {
            grade = "F";
        }

        System.out.println("당신의 점수는 : " + score + "당신의 학점은 : " + grade + "입니다.");


    }
}
