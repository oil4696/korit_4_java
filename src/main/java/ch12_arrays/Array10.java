package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int num = 0;
        // 이상의 2차 배열에 1~100까지 값을 집어넣으시오.

        // Arrays.deepToString(num); 를 통해 출력하시오
        // 실행 예
        // 입력파트
        for (int i = 0 ; i < nums.length; i++){         //num.lengh ==20
            for (int j = 0 ;j < nums[i].length ;j++)   // nums[i].lenght==5
                nums[i][j] = ++num;
        }
        System.out.println(Arrays.deepToString(nums));


    }
}

