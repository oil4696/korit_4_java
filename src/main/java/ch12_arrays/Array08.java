package ch12_arrays;

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {


        // 1차 배열 하나 생성
        String[] strdent = {"김영", "김일", "김이", "김삼"};
        //2차 뱌열하나 생성
        double[][] scoers = {
                {100.0, 96.4},
                {64.2, 79.3},
                {48.1, 99.8},
                {80.2, 4.5}
        };
        // 배열 출력 배우겠습니다.
/*
    배열의 출력
    sout()arr 형태로 배열을 출력하게 되면 배열은 참조변수이기 떄문에 주소값만 출려됩니다
    그리고 반복문을 통해 element를 불러올 수 있습니다.(for .enhanced for 를 통해).
    하지만 배열 전체를 확인하는 방법은 없습니다.

    Array클래스를 사용해 정적 메서드 .toString(배열명)을 사용하면 배열 전체 출려가능

    이상에서 중요한 점은
    클래스명.매서드명()으로 호출한다는 점ㅇ비니다. ㅡㅈㄱ -> Arrays .toString(배열명);
    즈즉 저희가 m,ethod 패키지에서 학습했던 것 중에 .aotjemaud(),객체명.매서드명()은 수업했었고,
    이번이 처음으로 클래스 명 . 매서드명();

    그리고 topString()이라는 매서드 역시 추후 수업 예정이지만 매우 중요한 개념에 해당합니다.
 */
        // 1. 1차 배열의 출력
        System.out.println(Arrays.toString(strdent));  //  결과값 : [김영, 김일, 김이, 김삼]  //to는 목저지 즉String으로 바꿔준다
        System.out.println(Arrays.toString(scoers));    //출력 값 : [[D@4c873330, [D@119d7047, [D@776ec8df, [D@4eec7777]

        //2. 2차배열의 출려
        //형식 : ㅁArray,deepToStiring(배열명);
        System.out.println(Arrays.deepToString(scoers));
    }
}
