package ch07_loops;
/*
        *
       **
      ***
     ****
    *****
    이상의 별찍기를 위해서 고려해야 할 사항은 이전까지와 좀 달라집니다.
    1. 개행관련
    2. 별찍기
    3. 공백관련
 */
public class Loop08 {
    public static void main(String[] args) {
        //1. 풀이 j--
        // 개행관련 1찰 ㄹofrans
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별찍기 관련 2차 b for문
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            //개행명
            System.out.println();
        }
        //

//        for (int i = 6; i > 1; i--) {
//            for (int j = 1; j < i ; j++) {
//                System.out.print(" ");}
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");}
//
//            System.out.println();
//        }
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j<6 -i ; j++){
                System.out.print( " ");
            }
            for (int k = 0 ; k< i ; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
