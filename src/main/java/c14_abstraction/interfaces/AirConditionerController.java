package c14_abstraction.interfaces;

public class AirConditionerController {

    // 필드 선언
    PowerButton powerButton;
    TemperatureDownButton temperatureDownButton;
    TemperatureUpButton temperatureUpButton;

    // AllArgsConstructor 선언

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    // method들 선언

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureUpButton() {
        temperatureUpButton.onUp();
    }
}
