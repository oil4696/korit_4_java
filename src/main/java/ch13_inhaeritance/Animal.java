package ch13_inhaeritance;

public class Animal {
    // 필드 생성
    private String animalName;
    private int animalAge;
    //기본생성자 및 매개변수 생성장(하나짜리 두개/ 두개짜리 하나 생성하세요)

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public Animal() {
    }
    // setter / getter 도 생성하세요 총 4개

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //고유 매서드 생성
    public void move(){
        System.out.println("움직입니다.");

    }
}
