package ch03_operation;
/*
    camel case -> Java 변수 표기법
    snake case -> Java에서는 쓸 일이 잘 없음
    pascal case -> 첫 문자가 대문자고 나머지 소문자로 가다가
        두 번째 단어의 첫 번째 문자는 또 대문자로 작성
        ex) 한 단어 짜리 : Opation01
        ex) 복수 단어 : OperrationTest

 */
public class Operation01 {
    public static void main(String[] args) {
        // 변수 선언 초기화
        int i = 10;
        // operation = 연산자

        // 여기서 자료형, 변수면ㅡ 데이터에 대해서는 학습했습니다.
        // '=' 얘는 배울겁니다.
        /*
            대입 연산자 = : = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입한다는 의미'로, 변수와 데이터가 동일하다는 수학적인 의미가 아닙니다.

         */
        int i2 = 20;
        i2 = i2 + 30; // 왼쪽과 오른쪽이 같다고 표시할 때는 ==

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자
         */
        int a= 5;
        int b = 2;
        double result = (double) a/ b;
        System.out.println(result);
        System.out.println(a%b);


    }
}
