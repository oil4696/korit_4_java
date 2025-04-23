package ch05_conversion;
/*
     if - else문 : fi 다음에 있는 조건식이 true일 떄는 if  문 내의 {} 싫행문이 실행
        / falseㅇ니 경우에는 else에 딸린 {} 실행문이 실해

        형식:
        if(조건식) {
        실행문1
        } else {        // else 의 경우 if가 flase 일때만 실행되기 때문에
            실행문2        // if에서 처험 조건식이 존재하지 않습니다.
 */
public class Condistion2 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        } else {
            System.out.println("num1dms 0이거나 음수입니다.");
        }
    }
}
