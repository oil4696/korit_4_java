package ch18_static.builders;

import java.util.Locale;

public class Person {
    private String name;
    private int age;
    private String address;

// 빌더 패턴 작성합니다.
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    public static class Builder {
        private String name;
        private int age;
        private String address;

        // 이하의 코드에 주목하셔야합니다. method들을 정의할 예정
        // method는 대부분 해위를 나타내기 때뭉네 동사로 작성하지만
        // builder 패턴에서는 대입될 필드의 이름과 동일한 메서드 ㄷ명을 씁니다.
        // 예를 들어 builde.name(안근수); / builder.age(38);과같은 방시이 됩니다.
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
