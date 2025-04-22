package ch04_scanner;

import java.util.Scanner;

public class Sscanner02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        System.out.print("이름을 입력하시요 : ");
        name = scan.next();
        scan.nextLine();
        int age;
        System.out.print("나이를 입력하세요 : ");
        age = scan.nextInt();
        String address;
        scan.nextLine();
        System.out.print("주소를 입력하세요 : ");
        address = scan.nextLine();






    }

}
