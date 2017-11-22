package Controller;

import Model.ArduinoCommunication;
import View.View;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller {

	/**
	 * Instantiates a new controller.
	 *
	 * @throws Exception the exception
	 */
	@SuppressWarnings("static-access")
	public Controller() throws Exception {
		this.UpdateIHM();
	}

	/**
	 * Update IHM.
	 */
	public static void UpdateIHM() {
		View.textFieldTempExtern.setText("" + ArduinoCommunication.temp_ext + " °C");
		View.textFieldTempFridge.setText("" + ArduinoCommunication.temp_int + " °C");
		View.textFieldTempModulePeltier.setText("" + ArduinoCommunication.temp_peltier + " °C");

		if ("mauvais".equals(ArduinoCommunication.condensation)) {
			View.txtAttentionCondensation.setVisible(true);
		} else if ("bon".equals(ArduinoCommunication.condensation)) {
			View.txtAttentionCondensation.setVisible(false);
		}

		if ("chaud".equals(ArduinoCommunication.variation)) {
			View.txtAttentionTemperature.setVisible(true);
		} else if ("froid".equals(ArduinoCommunication.variation)) {
			View.txtAttentionTemperature.setVisible(false);
		}
	}

}
