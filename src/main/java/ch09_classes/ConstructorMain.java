package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        System.out.println(constructor1.num);
        //int 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(21);
        System.out.println(constructor2.num);
        Constructor constructor3 = new Constructor("김삼");
        constructor3.num =3;
        //이상의 경우는 defult로 0 으로 초기화되었을 거기 때문에
        //23을 '재대입'했다고 해석할 수 있습니다.

        //AllargsConstructor를 기준으로 두개의 객체를 생성하겠습니다.
        Constructor constructor4= new Constructor(24, "김사");
        Constructor constructor5 = new Constructor(24,"김오");

        constructor1.diplayInfo();
        constructor2.diplayInfo();
        constructor3.diplayInfo();
        constructor4.diplayInfo();
        constructor5.diplayInfo();
    }
}
