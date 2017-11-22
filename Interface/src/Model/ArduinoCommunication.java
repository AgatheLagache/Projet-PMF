package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import View.View;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class ArduinoCommunication implements SerialPortEventListener {

	SerialPort serialPort;
	private static final String PORT_NAMES[] = { "COM4" };
	private BufferedReader input;
	public static OutputStream output;
	private String temp_ext;
	private String temp_int;
	private String temp_peltier;
	private String condensation;
	private final String mauvais = "mauvais";
	private final String bon = "bon";
	private static final int TIME_OUT = 2000;
	private static final int DATA_RATE = 9600;

	@SuppressWarnings("static-access")
	public void OpenCommunicationWithArduino() {
		CommPortIdentifier portId = null;
		@SuppressWarnings("rawtypes")
		final Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		while (portEnum.hasMoreElements()) {
			final CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (final String portName : PORT_NAMES) {
				if (currPortId.getName().equals(portName)) {
					portId = currPortId;
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
			return;
		}

		try {
			this.serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);
			this.serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);
			this.input = new BufferedReader(new InputStreamReader(this.serialPort.getInputStream()));
			this.output = this.serialPort.getOutputStream();
			this.serialPort.addEventListener(this);
			this.serialPort.notifyOnDataAvailable(true);
		} catch (final Exception e) {
			System.err.println(e.toString());
		}
	}

	@Override
	public synchronized void serialEvent(final SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				final String inputLine = this.input.readLine();
				final String[] tab = inputLine.split("/");
				this.temp_ext = tab[0];
				this.temp_peltier = tab[1];
				this.temp_int = tab[2];
				this.condensation = tab[3];
				System.out.println(inputLine);
				View.textFieldTempExtern.setText("" + this.temp_ext + " °C");
				View.textFieldTempFridge.setText("" + this.temp_int + " °C");
				View.textFieldTempModulePeltier.setText("" + this.temp_peltier + " °C");
				if (this.mauvais.equals(this.condensation)) {
					View.txtAttentionCondensation.setVisible(true);
				} else if (this.bon.equals(this.condensation)) {
					View.txtAttentionCondensation.setVisible(false);

				}
			} catch (final Exception e) {
				System.err.println(e.toString());
			}
		}
	}

}
