package ch13_inhaeritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnimalName("나비");
        animal.setAnimalAge(1);
        animal.move();

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(3);
        tiger1.move();
        tiger1.hunt();
//        animal.hunt();       오류 발생 -> 부모클래스는 자식클래스의 필드 및 매서드에 접근 불가능
        tiger1.setStriped(true);
//        animal.setStripted(ㄹ민ㄷ);fhfbqkftod

        Human human1 = new Human();
        human1.setAnimalName("정선유");
        human1.setAnimalAge(26);
        System.out.println(human1.getAnimalName());

        human1.move();
        human1.read("자바의 기초");
    }
}
