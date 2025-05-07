package ch22_exceptuion;

/*
    사용자 정의 예외
 */
class LoginFailedExcepstion extends  Exception{
    public LoginFailedExcepstion(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

public class Excepstion2 {
    public static void login(String id, String password) throws LoginFailedExcepstion {
        String correctId = "admin";
        String correctPassword = "1q2w32e4r";

        if (!id.equals(correctId)||!password.equals(correctPassword)){
            throw new LoginFailedExcepstion("id또는 Pw가 틀렸습니다.");
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword ="123qwe";

        try {
            login(inputId, inputPassword);
        }catch (LoginFailedExcepstion e){
            System.out.println("로그인 실패 : " + e.getMessage());
        }finally {
            System.out.println("프로글매 정상 종료");
        }
    }
}


/*
    strniig age = "123;
    글머 애가 String 이라서 수학 연산이 불간으합니다.
    근데 Java의 특정 클래수의 특정 메서드는 저런 식으로
    String 숫자 형태를 int로 바꿔주느 메서드도 있습니다.
 */