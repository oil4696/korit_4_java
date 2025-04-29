package ch14_abstraction.interfaces;

public class ChannelDwonButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("체널을 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("체널을 계속 내립니다.");
    }
}
// ChannelUpButton