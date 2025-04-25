package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method를 저의하는 영역

    //1. [x | x] [ 입력값 /출력값]
    public static void call1() {
    System.out.println("[ x | x ]");
    System.out.println("call1() 타입의 method가 호출되었습니다.");
    System.out.println("수정되었습니다");
}
    //2. [ o | x ]
    public static void call2(String strExample){
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 :" + strExample);
    }
    //3. [ x | o ]
    public static String call3() { // 자료형이 들어간다. void 는 retrn이 ㅇ벗어도 됌
        System.out.println("[ x | o ]");
        String result = "";
        for(int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j <i +1 ; j++){
                result += "*";// 지역변수 - 메서드 내에 정의 된 변수
            }
//           return += "\n";    // \n - 개행하라는 의미  \t -> 공백 두번 / 네번
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int date, String day){
        System.out.println("[ o | o ]");
        return year + "년" + month + "d월" + date + "일" + day + "입니다. 힘내요";
    }

    // 자기 소개를 하는 매서드를 하나 정의 할 예정ㅇ비니다.
    public static String introduce(String name, int age){
        return "제 이름은 " + name + "입니다. 나이는" + age + "살입니다. \n내년에는 " + (age+1) + "살이 됩니다.";
    }

        //method

    public static void main(String[] args) {
        //method를 실행( 호출)하는 영역
        call1();
        call2("메서드 이해하기"); // 호출 단계에서 () 내를 채우는 것을 argument
//        reslut = "대입불가";
        call3();       // 이거 실행이 안돼요
        System.out.println(call3());    // call3() 출력하라는 명령문이 메서드 내에 저되어있지 않음
        // 이상을 이유로 sout잉 main단계에서 요구됨.

        System.out.println(call4(2042, 4, 24, "목요일"));
        System.out.println(introduce("정선유",26));

        /*
            Scanner 클래스를 import하시고
            String name / int age를 선언하신 후에
            name / age에 각각 김일, 20을 대입하신 후에
            introduce의 argument로 써서
            제 이름은 김일입니다. 나이는 20살입니다.
            내년에는 21살이 됩니다.
            를 출력하시오.
         */

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.print("나이를 입력하세요 : ");
        age = scanner.nextInt();
        String introduction = introduce(name, age);
        System.out.println(introduction);


        /*
            함수형 프로그래밍 (Function programming) :
            메서드1의 retuen 값이 메서드 2의  argumetn가 되는 형식으로

            첫번째 메서드로 부터 마지막 메서드 까지으 흐름을 통해 프로그램이 이어지는 방식을 의미함.

         이상의 예시에서는 . nextLine()의 결과값과 .nextInt()의 결과값이
         .introduce()의 argument1, argument2로 사용되었습니다.
        */
    }
}
