package Model;

public class Model {

	public Model(){
		final ArduinoCommunication arduinocommunication = new ArduinoCommunication();
		arduinocommunication.OpenCommunicationWithArduino();
	}

}
