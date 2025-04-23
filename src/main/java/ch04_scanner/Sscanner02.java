package ch04_scanner;

import java.util.Scanner;

public class Sscanner02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            ,next() : string 데이터를 받을 때 띄어쓰기를 인정하지 않음
            .nextLine() : string 데이터를 받을 때 띄어쓰기를 인정하고 enter 키 기준으로 데이터가 입력됨

            실행 예
            이름을 입력하세요 >>> 여러분이름
            나이를 입력하세요 >>> 나이
            주소를 입력하세요 >>> 주소(시 / 구 또는 도 / 시까지)

            안녕하세요, 제 이름은 이름입니다. 주소에 살고 있습니다.
            10년 후 나이는 나이+10입니다.
       */

        String name;
        String age;
        String address;
        int age10;

        System.out.print("당신의 이름은 무엇인가요? : ");
        name = scanner.next();
        System.out.print("당신의 나이는 어떻게 돼나요? : ");
        age = scanner.next();
        scanner.nextLine();
        System.out.print("당신의 주소는 어떻게 돼나요? : ");
        address = scanner.nextLine();

        // age10 = age + 10;

//        System.out.println("당신의 10년 후 나이는 어떻게 돼나요? : " + age10);



//        String name;
//        System.out.print("이름을 입력하시요 : ");
//        name = scan.next();
//        String age;
//        System.out.print("나이를 입력하세요 : ");
//        age = scan.next();
//        scan.nextLine();
//        String address;
//        System.out.print("주소를 입력하세요 : ");
//        address = scan.nextLine();


//        String name;
//        String address;
//        int age;
//        int age10;


//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("주소를 입력하세요 >>> ");
//        address = scanner.nextLine();
//        int age10 = age + 10;
//        age10 = age + 10;
//
//        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. " + address + "에 살고 있습니다." );
//        System.out.println("10년 후 나이는 " + age10 + "살입니다.");





    }

}
