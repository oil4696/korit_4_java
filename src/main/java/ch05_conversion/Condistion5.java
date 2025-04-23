package ch05_conversion;
/*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
    score가 90이상이라ㅓ면 gorade는 A
    score가 80점 이상이라면 greade B
    70 점이 면 c
    60 점이면 b
    59 점이라면 f
    실행 예
    점수를 입력하세요 >>> 68
    당신의 점수는 68이고, 학점은 d입니다.

 */
import java.util.Scanner;

public class Condistion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        String grade;

        System.out.print("성적을 입력하세요 : ");
        score = scanner.nextInt();
        if(score > 89) {
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
