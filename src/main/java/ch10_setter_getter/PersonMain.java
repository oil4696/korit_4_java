package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setAge(243);
        person1.setAge(21);
        /*
            위를 보았을 때 perso은 객체이다.
            person1.setName("김일");
            그 밑을 보면 객체에 person.java파일에서 지정한 setName이 들어갔다.
            그렇다면 person.java파일에서 this.어쩌고 가 있다고 가정을 했을 때 this는 객체가 올 자리를 만들어 둔것이라고 생각할 수 있다.
            그리고 person.java파일에서 this.setAge, this.setName 과같이 지정을 해주면 main파일에서 값을 대입하여 줄 수 있다.
         */

        // 객체 하나 더 생성 하겠습니다.
        Person person2 = new Person("이이",32);
        //여기서 이이 라는 사람의 이름을 강이 로 바꾸고 싶다면 두 가지 방법이 있죠
        // # 1 객체명.속성명
//        person2.name = "강이";          //person.javadp private 적용하면 오류 발생
        //setName을 이용하는 밥법
        person2.setName("최이");

        //마찬가지로 콘솔창에 person2의 name을 출력하는 방법도 두가지 입니다.
        //# 1.
//        System.out.println(person2);    //person.javadp private 적용하면 오류 발생
        // #20. getname() -> call3()
        System.out.println(person2.getName());

        // getter은 놰 sout을 사용해야하나
        // call 1() / call2() 유형의 경우ㅠretrun이 없는 대신에 콘솔창에 출력하기 위해서는
        //매서드 내에 sout를 구현할 필요가 있었습니다.
        // 이상의 경우 main 단계에서 매서드 홏출을 하지만 하면 콘솔창에 경ㅎ과가 출력된다는 장점이 있기는 하지만
        // '데이터의 가공'이 어렵습니다.

        //김일 님 반갑습니다. / 최일 님 반갑습니다.
        System.out.println(person1.getName() + "님 반갑습니다.");
        System.out.println(person2.getName() + "님 반갑습니다.");

        /*
            추가적인 내용은 main에서 추가하여 setter의 유용성과 getter의 유용성을 같이 볼 수있다.
         */

    }

}
