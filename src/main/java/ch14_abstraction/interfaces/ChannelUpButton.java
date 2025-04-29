package ch14_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("체널을 한칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "체널을 계속" + super.onUp();
    }
}
