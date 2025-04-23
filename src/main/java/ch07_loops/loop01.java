package ch07_loops;

public class loop01 {
    public static void main(String[] args) {
        //        int i = 0;
//        while (i < 100) {
////            i++;
////            System.out.println(++i);
//            System.out.println(++i);
//        }
//
//        int j = 1;
//        while(j < 101) {
////            System.out.println(j);
////            j++;
//            System.out.println(j++);
//        }

        // while 문도 중첩이 일어날 수 있습니다
        /*
            while(조건식1) {
                반복실행문1a
                while(조건식2) {
                    반복실행문2
                }
                반복실행문1b
            }

            그러다보니까 while과 if를 섞어서도 쓸 수 있습니다.
         */

        int sum = 0;
        int k = 1;
        // 예를 들어 1부터 100까지 더하도록 하겠습니다.
//        while (k < 101) {
//            sum += k;
//            k++;
//        }
//        System.out.println(sum);

        // 응용 -> 1부터 100까지 중 짝수합만 구하는 while 반복문을 작성하시오.
        // 혹시 나머지 연산자 및 if문을 썼다면 또 다른 방법이 없는지도 고민해보세요.


        // # 1 if문을 활용한 짝수합 구하기
//        int q = 1;
//        int sum2 = 0;
//        while (q < 101) {
//            if (q % 2 == 0) {
//                sum2 += q;
//            }
//            q++;
//        }
//        System.out.println("짝수합: " + sum2);

        // # 2 +=2 를 활용한 짝수합 구하기
        int sum3 = 0;
        int q2 = 2;
        while (q2 < 101) {
            sum3 += q2;
            q2 += 2;
        }
        System.out.println("두 번째 짝수합 구하기 : " + sum3);
        // Loop2 -> main
    }
}
