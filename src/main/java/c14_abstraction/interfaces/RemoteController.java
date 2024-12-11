package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    // 추가된 필드
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;  // 이 필드들을 추가하는 순간에 AllArgsConstructor가 아님
    // 그렇기 때문에 밑에 있는 생성자를 수정할 필요가 있음.

    /*
        AllArgsConstructor를 정의하세요.
     */

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        // 소괄호 내에 매개변수를 수정했기 때문에 이하의 코드가 필요함
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        // 마찬가지로 이걸 완성하는 순간 Main 단계에서 오류가 발생함 -> 아까전에는 Main이 AllArgs를 만족했으나
        // 이젠 아니기 때문
    }

    // 메서드 정의
    // PowerButton의 메서드 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
                                        // PowerButton 클래스에서 정의했던 메서드를 호출 가능
    }

    // ChannelDownButton의 메서드 구현 -> 메서드 두개씩입니다
    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }
    // ChannelUpButton의 메서드 구현
    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton(){
        channelUpButton.onUp();
    }

    // VolumeDownButton 메서드 구현 - 2개입니다.
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // VolumeUpButton 메서드 구현 - 2개입니다.
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }

}
