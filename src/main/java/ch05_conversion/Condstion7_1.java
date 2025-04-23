package ch05_conversion;

import java.util.Scanner;

public class Condstion7_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int score;
        String grade = "";
        System.out.print("점수를 입력하세여 : ");
        score = scanner.nextInt();
        if (score > 100 || score < 0){
            System.out.println("옳지않은 입력입니다.");

        } else {
            if(score >90) {
                grade = "A";
            } else if (score >80) {
                grade = "B";
            } else if (score >70) {
                grade = "C";
            } else if (score >60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "점 이고 " + grade + "학점입니다.");
    }
}
