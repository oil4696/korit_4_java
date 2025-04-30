package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스인 person1을 만든다고 가정하겠습니다.
        // 이름 -> 김일 / 나이 -> 32 / 주소 -> 서울특별시 종로구라고 했을 떄 여태까지는
        // Person person1 = new Person("김일" 21"서울특별시 종로구");
        //라고 작성해야 했습니다. -> 근데 만약에 AllArgsConstruct가 없다면
        //Person person1 = new Person();
        //person1.setName(김일);
        //person1.setAge(21);
        //person1.setAddress(서울특별시 종로구);로 작성해야했겠죠

        Person person1 = new Person.Builder().name("김일").age(21).address("서울특별시 종로구").build();   // 순서대로 바꾸거나 생략하더라도 코드를 추가할 필요x
        Person person2 = new Person.Builder().name("김일").age(21).address("서울특별시 종로구").build();
        Person person3 = new Person.Builder().build();
    }
}
