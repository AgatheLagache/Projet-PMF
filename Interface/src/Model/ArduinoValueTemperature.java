package Model;

public class ArduinoValueTemperature extends ArduinoValue {
    public int CoeffConvTemp;
    public int FidgeTemperature = 15;
    public int PeltierTemperature;
    public int RoomTemperature;
    public int MaxFridgeTemperature;

    protected int getCoeffConvTemp() {
        return this.CoeffConvTemp;
    }

    protected void setCoeffConvTemp(int coeffConvTemp) {
        this.CoeffConvTemp = coeffConvTemp;
    }

    protected int getFidgeTemperature() {
        return this.FidgeTemperature;
    }

    protected void setFidgeTemperature(int fidgeTemperature) {
        this.FidgeTemperature = fidgeTemperature;
    }

    protected int getPeltierTemperature() {
        return this.PeltierTemperature;
    }

    protected void setPeltierTemperature(int peltierTemperature) {
        this.PeltierTemperature = peltierTemperature;
    }

    protected int getRoomTemperature() {
        return this.RoomTemperature;
    }

    protected void setRoomTemperature(int roomTemperature) {
        this.RoomTemperature = roomTemperature;
    }

    protected int getMaxFridgeTemperature() {
        return this.MaxFridgeTemperature;
    }

    protected void setMaxFridgeTemperature(int maxFridgeTemperature) {
        this.MaxFridgeTemperature = maxFridgeTemperature;
    }

}
