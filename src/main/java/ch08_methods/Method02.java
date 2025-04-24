package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한 방에 자기 소개 하는 매서드 정의할 검니다.

//    public static void introduce() {
//        //내부에서 Scanner import
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("이름을 입력하세요 ; ");
//        String name = scanner.nextLine();
//        System.out.println("주소를 입력하세요 ; ");
//         String address = scanner.nextLine();
//        System.out.println("제 이름은 " + name + "입니다.");
//        System.out.println( address + "에 살고있습니다.");
//    }
    /*
        춝석부를 만들겁니다.
        메서드 명 : registerStudent()
        return : void

        실행 예
        학번을 입력하세요 :
        이름을 입력하세요 :
        학번 : 어쩌고
        이름 : 저쩌고

        라고 출력이 돠ㅣ는 메서드르 정의 합니다.

        main 단계에서 학생 수를 입력 받을 겁니;다.
        실행 예
        몇 명의 핛생르 등록하시겠ㅅ브니다까? :
        학번을 입력하세요 : 20250001
        이름을 입력하세요 : 김일
        학번 :
        이름
        학번을 입력하세요 : 20250001
        이름을 입력하세요 : 김이
        학번 :
        이름
        학번을 입력하세요 : 20250001
        이름을 입력하세요 : 김삼
        학번 :
        이름
     */

    //public static void registerStudent() {
//    //내부에서 Scanner import
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("학번을 입력하세요 : ");
//    String studentId = scanner.nextLine();
//    System.out.println("이름을 입력하세요 : ");
//    String studentName = scanner.nextLine();
//
    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학번을 입력하세요 : ");
        int studentCode = scanner.nextInt();
        System.out.println("이름을 입력하세요 : ");
        String name = scanner.next();
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
    }

    public static void registerStudent2(int count) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("학번을 입력하세요 : ");
            int studentCode = scanner.nextInt();
            System.out.println("이름을 입력하세요 : ");
            String name = scanner.next();
            System.out.println("학번 : " + studentCode);
            System.out.println("이름 : " + name);
        }
    }
    public static void registerStudent(int count){
        for (int i = 0 ; i < count ; i++){
            registerStudent();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            registerStudent();
        System.out.println("몇명의 학생을 등록하겠습니까? : ");
        int studentNum = scanner.nextInt();
        for (int i = 0; i > studentNum; i++) {
        }
        // call2() 유형으로 registerStudent2()를 정의할 예정인데,
        registerStudent2(studentNum);        // studentNum이라는 argument가
        // method 정의 시에 for / while문의 한계값으로 사용되어야 한다는 점을 생각하시면 됩니다.
    }


}

