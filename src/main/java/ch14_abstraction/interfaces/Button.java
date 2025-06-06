package ch14_abstraction.interfaces;
/*
    인터페이스는 다중 상속이 가능하다는 점을 보여드릴 클래승비니다.
    단일 상속을 위한 명령어-> extents
    다중 상송을 위한 명령어-> implements
 */
public abstract class Button implements Press, Up,Down{

    @Override
    public void onDown(){};

    @Override
    public abstract void onPressed();

    @Override
    public String onUp(){
        return " 올립니다.";
    };

    // 추후 다시 다운캐스팅을 한 이후에 실핼할 고유 메서드
    public void compute(){
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
