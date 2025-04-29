package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
    // 배열의 선언 방식
        // 1.
        // 자료형[] = 배열명 = {값1,2,3,...n}
        int[] arr1 = {1,2,3,4,5};
        // 값1, ....값n : element / elem1 = 0;        /요소라고도 함

        // 2. 빈 배여을 선언한 다음 추후 값을 대입하는 방법
        String[] arr2 = new String[4]; // 방 4개 짜리 빈 배열을 생성  // 선언따로 초기화 따로
        arr2[0] = "김일";
        arr2[1] = "김이";
        arr2[2] = "김삼";
        arr2[3] = "김사";

        System.out.println(arr1);
        System.out.println(arr2);   // 생각한대로 출력되ㅏ지 않는다. // 이건 arr1,arr2가 어디에 있늕지를 출려해줌

        // 배열의 element를 출력하는 방법
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        //  어 근데 보니까[[ 안에 있는 값만 바뀌고 반복되네?
        //-> 반복문 되겠네?

        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr1[i] + " ");
        }

        // arr2의 element를 출력하는 반복문을 작성하시오

        for (int i = 0 ; i < 4 ; i++){
            System.out.print(arr2[i] + " ");
        }

        // 그 러면 역순으로 출력하려면 어떻게할 수 있을까요?

        for(int i = arr1.length-1 ; i > -1 ; i--) {
            System.out.println();
            System.out.print(arr1[i] + " ");
        }
        // arr1.lengh -1로 시작값 설정 이유 : arr1.lengh =5인데
        // 43210 이 출력되어야하기 때문에
        //arr1ㅇ에 값에 2씩 더하고 싶으면 어떨게 할 수 있을까?
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] += 2;
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.println("--------");
        System.out.println("arr1의 길이 : "+ arr1.length);
        System.out.println("arr1의 길이 : "+ arr2.length);
        // 배열명.lengh    -> 결과값은 int이 반환됨
        // - > 객체명.속성명과 동일

        for (int i = 0 ; i <arr2.length ; i++){
            System.out.print(arr2[i] + " 님/");
        }

        // mdㅍ라일에 정리한대로라면 String은 참조 변수에 해당하고,
        //  참조 변수들을 모아서 다시 배열을 만들었다는 점.

    }
}
