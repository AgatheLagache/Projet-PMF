package Model;

public class ArduinoValueTemperature extends ArduinoValue {
    public int   CoeffConvTemp;
    public Value FidgeTemperature;
    public Value PeltierTemperature;
    public Value RoomTemperature;
    public Value MaxFridgeTemperature;

    protected int getCoeffConvTemp() {
        return this.CoeffConvTemp;
    }

    protected void setCoeffConvTemp(int coeffConvTemp) {
        this.CoeffConvTemp = coeffConvTemp;
    }

    protected Value getFidgeTemperature() {
        return this.FidgeTemperature;
    }

    protected void setFidgeTemperature(Value fidgeTemperature) {
        this.FidgeTemperature = fidgeTemperature;
    }

    protected Value getPeltierTemperature() {
        return this.PeltierTemperature;
    }

    protected void setPeltierTemperature(Value peltierTemperature) {
        this.PeltierTemperature = peltierTemperature;
    }

    protected Value getRoomTemperature() {
        return this.RoomTemperature;
    }

    protected void setRoomTemperature(Value roomTemperature) {
        this.RoomTemperature = roomTemperature;
    }

    protected Value getMaxFridgeTemperature() {
        return this.MaxFridgeTemperature;
    }

    protected void setMaxFridgeTemperature(Value maxFridgeTemperature) {
        this.MaxFridgeTemperature = maxFridgeTemperature;
    }

}
