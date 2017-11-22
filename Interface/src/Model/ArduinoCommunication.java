package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import Controller.Controller;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

// TODO: Auto-generated Javadoc
/**
 * The Class ArduinoCommunication.
 */
public class ArduinoCommunication implements SerialPortEventListener {

	/** The serial port. */
	SerialPort serialPort;

	/** The Constant PORT_NAMES. */
	private static final String PORT_NAMES[] = { "COM4" };

	/** The input. */
	private BufferedReader input;

	/** The output. */
	public static OutputStream output;

	/** The temp ext. */
	public static String temp_ext;

	/** The temp int. */
	public static String temp_int;

	/** The temp peltier. */
	public static String temp_peltier;

	/** The condensation. */
	public static String condensation;

	/** The variation. */
	public static String variation;

	/** The Constant TIME_OUT. */
	private static final int TIME_OUT = 2000;

	/** The Constant DATA_RATE. */
	private static final int DATA_RATE = 9600;

	/**
	 * Open communication with arduino.
	 */
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
			ArduinoCommunication.output = this.serialPort.getOutputStream();
			this.serialPort.addEventListener(this);
			this.serialPort.notifyOnDataAvailable(true);
		} catch (final Exception e) {
			System.err.println(e.toString());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see gnu.io.SerialPortEventListener#serialEvent(gnu.io.SerialPortEvent)
	 */
	@Override
	public synchronized void serialEvent(final SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				final String inputLine = this.input.readLine();
				final String[] tab = inputLine.split("/");
				ArduinoCommunication.temp_ext = tab[0];
				ArduinoCommunication.temp_peltier = tab[1];
				ArduinoCommunication.temp_int = tab[2];
				ArduinoCommunication.condensation = tab[3];
				ArduinoCommunication.variation = tab[4];
				System.out.println(inputLine);

				Controller.UpdateIHM();

			} catch (final Exception e) {
				System.err.println(e.toString());
			}
		}
	}

}
