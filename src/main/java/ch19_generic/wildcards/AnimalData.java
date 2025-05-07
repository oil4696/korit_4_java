package ch19_generic.wildcards;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AnimalData <T>{
    private T animal;
    /*
        Animaldata 의 anmimal에 Animal클래스를 상속받은 tiger /himan 객체를 필드에 대입할 겁니다.
        그러면 car는 들어가면 안되ㅏㄹㅇ텐데 혀ㅑㄴ재의 사ㅣㅇ활ㄹ으로는 car가 댕비되더라도 java상에서

        특정 클래스 (즉 animal의 삿ㅇ속을 받은 서븝 클래스에 해당ㅎ된다면) 해당 클래스에 맞는 객체 정보를 출력할 수 있도록 잣겅할 예정
     */
    public void printData(){
        ((Animal)animal).move();       // AnimalData의 필드인 ㅁanimal를Animal 자료형으로 형ㄷ화ㅓㄴ하고
        // .move()메서드를 호출 그러면 car는 move가 로출되지 안ㄷ겠네요
//        animal.move():

        // 각 클래스들의 고유 메서들들의 호출하기 휘한 다문 캐슽칭 관련 복습
        if(animal.getClass() == Human.class){
            ((Human)animal).read();// anima의 클래스를 확인하여 그것이 Human 클래스에 해당한다면
            // animal을 다시 numan 클래스로 다운캐스팅하여 고유 메서드 read를 호출
        }else if (animal.getClass() == Tiger.class){
            ((Tiger)animal).hunt();
        }
    }
}
