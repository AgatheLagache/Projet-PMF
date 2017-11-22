package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model {

	/**
	 * Instantiates a new model.
	 */
	public Model(){
		final ArduinoCommunication arduinocommunication = new ArduinoCommunication();
		arduinocommunication.OpenCommunicationWithArduino();
	}

}
