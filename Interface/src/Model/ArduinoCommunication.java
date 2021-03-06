package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import View.Window;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class ArduinoCommunication implements SerialPortEventListener {

	SerialPort serialPort;
	/** The port we're normally going to use. */
	private static final String PORT_NAMES[] = { "COM4" // Windows
	};
	/**
	 * A BufferedReader which will be fed by a InputStreamReader converting the
	 * bytes into characters making the displayed results codepage independent
	 */
	private BufferedReader input;
	/** The output stream to the port */
	public static OutputStream output;
	private String temp_ext;
	private String temp_int;
	private String temp_peltier;
	private String condensation;
	private final String mauvais = "mauvais";
	private final String bon = "bon";
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 2000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 9600;

	public void OpenCommunicationWithArduino() {
		// the next line is for Raspberry Pi and
		// gets us into the while loop and was suggested here was suggested
		// http://www.raspberrypi.org/phpBB3/viewtopic.php?f=81&t=32186
		// System.setProperty("gnu.io.rxtx.SerialPorts", "/dev/ttyACM0");

		CommPortIdentifier portId = null;
		final Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		// First, Find an instance of serial port as set in PORT_NAMES.
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
			// open serial port, and use class name for the appName.
			this.serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);

			// set port parameters
			this.serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);

			// open the streams
			this.input = new BufferedReader(new InputStreamReader(this.serialPort.getInputStream()));
			this.output = this.serialPort.getOutputStream();

			// add event listeners
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
				this.temp_int= tab[2];
				this.condensation = tab[3];
				System.out.println(inputLine);
				Window.textFieldTempExtern.setText("" + this.temp_ext + " �C");
				Window.textFieldTempFridge.setText("" + this.temp_int + " �C");
				Window.textFieldTempModulePeltier.setText("" + this.temp_peltier + " �C");
				if (this.mauvais.equals(this.condensation)) {
					Window.txtAttentionCondensation.setVisible(true);
				} else if (this.bon.equals(this.condensation)) {
					Window.txtAttentionCondensation.setVisible(false);

				}
			} catch (final Exception e) {
				System.err.println(e.toString());
			}
		}
	}

	public void ReceiveArduinoValues() {

	}

	public void SendValuesToArduino() {

	}

}
