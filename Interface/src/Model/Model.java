package Model;

import java.util.ArrayList;

public class Model {
	public final ArrayList<Value> JavaListValues = new ArrayList<Value>();
	public final ArrayList<Value> ArduinoListValues = new ArrayList<Value>();

	public Model(){
		final ArduinoCommunication arduinocommunication = new ArduinoCommunication();
		arduinocommunication.OpenCommunicationWithArduino();
	}

}
