package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemotController tvRemotController = new TvRemotController(
        new PowerButton(), new ChannelDwonButton(), new ChannelUpButton(), new VolumeUpButton(), new VolumeDownButton()
                // TvRemotController의 객체생성을 하는데 여기에 매개변수에 객체를 넣을 수 있다? 가 아니라 new TvRemotController객체를 tvRemotController라는 객체 명에 대입을 하기위한 생성자?
        );
        // 별개의 PowerButton 객체를 생성해서 메서드 호출이 가능한가?
        PowerButton powerButton = new PowerButton();

        tvRemotController.onPressedPowerButton();           // 결과값 : 전원을 겹니다
        powerButton.onPressed();     // 물론 가능합니다.          결과값 : 전원을 켭니다 -> 별개로 굴러가니까
        tvRemotController.onPressedPowerButton();            // 결과값 : 전원을 끕니다.
        tvRemotController.onPressedChannelDownButton();
        tvRemotController.onChannelDownButton();
        tvRemotController.onPressedChannelUpButton();
        tvRemotController.onupChannelUpButton();

        System.out.println();

        tvRemotController.onUpVolumeUpButton();
        tvRemotController.onPressedVolumeDownButton();
        tvRemotController.onPressedVolumeUpButton();
        tvRemotController.onUpVolumeUpButton();


    }
}
