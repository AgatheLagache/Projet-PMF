package Model;

public class ArduinoValueHumidity extends ArduinoValue {

    public int          CoeffConvHumidity;
    public static Value MINHUMIDITYVALUE;

    protected int getCoeffConvHumidity() {
        return this.CoeffConvHumidity;
    }

    protected void setCoeffConvHumidity(int coeffConvHumidity) {
        this.CoeffConvHumidity = coeffConvHumidity;
    }
}
