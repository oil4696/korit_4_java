package ch14_abstraction.interfaces;

public class TvRemotController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDwonButton channelDwonButton;
    private ChannelUpButton channelUpButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemotController(PowerButton powerButton,
                             ChannelDwonButton channelDwonButton,
                             ChannelUpButton channelUpButton,
                             VolumeUpButton volumeUpButton,
                             VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDwonButton = channelDwonButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

//    public TvRemotController(}


//    public TvRemotController(PowerButton powerButton, ChannelDwonButton channelDwonButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeDownButton volumeDownButton1) {
//    }

    //이상의 filedㄹ들을  메서드들을 정의
    public void onPressedPowerButton() {
        System.out.print("tv의 ");
        powerButton.onPressed();
    }
    public void onPressedChannelDownButton() {
        System.out.print("tv의 ");
        channelDwonButton.onPressed();
    }
    public void onChannelDownButton() {
        System.out.print("tv의 ");
        channelDwonButton.onDown();
    }
    public void onPressedChannelUpButton() {
        System.out.print("tv의 ");
        channelUpButton.onPressed();
    }
    public void onupChannelUpButton() {
        System.out.print("tv의 ");
        System.out.println(channelUpButton.onUp());
    }
    //    VolumeDownButton / VolumeUpButton 클래스를 만들고 ChannelDown/Up과 같은 방식으로 작성하시오.
    // VolumeUpButton은 작성안하셔도 됩니다.
    public void onPressedVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("Tv의 ");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.print("Tv의 ");
        System.out.println(volumeUpButton.onUp());
    }
}