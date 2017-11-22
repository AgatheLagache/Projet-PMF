package Model;

public class Value {
    public int    ArduinoValue;
    public int    JavaValue;
    public String Name;

    protected int getArduinoValue() {
        return this.ArduinoValue;
    }

    protected void setArduinoValue(int arduinoValue) {
        this.ArduinoValue = arduinoValue;
    }

    protected int getJavaValue() {
        return this.JavaValue;
    }

    protected void setJavaValue(int javaValue) {
        this.JavaValue = javaValue;
    }

}
