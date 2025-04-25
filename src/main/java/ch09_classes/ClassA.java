package ch09_classes;

import java.util.Scanner;

public class ClassA {
    double score;
    int num;
    String name;

    public void callName(){
        System.out.println(name + "을 부흡니다.");

        Scanner scanner =new Scanner(System.in);
        String name;
        int num1;
        double score;
        System.out.println("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.println("번호를 입력하세요 : ");
        num = scanner.nextInt();
        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();
    }
    public void didisplatProfile() {
        System.out.println(num + "학번의 학생의 이름은 " + name +"이고, "+ score + "점 입니다.");
    }
}
