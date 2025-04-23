package ch05_conversion;
/*
    if -else  if- else문
    형식 :
    if(조건식1) {
    실행문1
    } else if (조건식2) {
    실행문2
    } else if (조건식3 {
    실행문3
    } else {
    실행문4
    }


 */

public class Condistion4 {
    public static void main(String[] args) {
        System.out.println("회원 포인트를 입력하세요 :" );
        int point = 0;

        // 등급을 저장하는 변수를 하나 선언하겠습니다.
        String userGrade = "";      // 데이터에 아직 아무런 값이 없습니다.
        if(point > 80) {
            userGrade = "vip";      // userGrade에 VIP라는 String 데이터를 재대입
        } else if (point > 60) {
            userGrade = "gold";
        } else if (point > 40) {
            userGrade = "silver";
        } else if (point > 20) {
            userGrade = "bronze";
        } else {
            userGrade = "normal";
        }
        System.out.println("회원 등급 : " + userGrade);

    }
}
