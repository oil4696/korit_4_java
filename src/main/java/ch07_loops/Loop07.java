package ch07_loops;

import java.util.Scanner;

/*
    몇줄의 별ㄷ을 씩고
 */
public class Loop07 {
    public static void main(String[] args) {
        System.out.println("몇줄의 별을 찍겠습니까? : ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for(int i = 0 ; i < row ; i++) {
            for (int j = row ; j - i > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 오늘 복습시간에 md 파일 정리 할 때 # 1 풀이법으로도 작성해보세요 - >loop08
    }
}
