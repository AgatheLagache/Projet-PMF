package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Controller;
import Model.ArduinoCommunication;
import Model.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class View.
 */
public class View {

	/** The frame. */
	public JFrame frame;

	/** The txt temp ext. */
	public JTextField txtTempExt;

	/** The txt temp module peltier. */
	private JTextField txtTempModulePeltier;

	/** The txt temp intern. */
	public JTextField txtTempIntern;

	/** The txt temp chose by user. */
	private JTextField txtTempChoseByUser;

	/** The txt attention condensation. */
	public static JTextField txtAttentionCondensation;

	/** The txt attention temperature. */
	public static JTextField txtAttentionTemperature;

	/** The text field temp desire. */
	private static JTextField textFieldTempDesire;

	/** The text field temp module peltier. */
	public static JTextField textFieldTempModulePeltier;

	/** The text field temp fridge. */
	public static JTextField textFieldTempFridge;

	/** The text field temp extern. */
	public static JTextField textFieldTempExtern;

	/** The temp frigo. */
	public int temp_frigo = 18;

	/** The model. */
	Model model;

	/** The controller. */
	Controller controller;

	/**
	 * Launch the application.
	 *
	 * @param model
	 *            the model
	 */

	/**
	 * Create the application.
	 *
	 * @param model
	 *
	 * @throws Exception
	 */
	public View(final Model model) {
		this.setModel(model);
	}

	/**
	 * Start.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void Start() throws Exception {
		this.FrameCreation();
		this.PlusButton();
		this.MinusButton();
		this.AttentionCondensation();
		this.AteentionVariationTemperature();
		this.TempExt();
		this.TempModulePeltier();
		this.TempIntern();
		this.TempChoseByUser();
		this.textFieldTempModulePeltier();
		this.FieldTempDesire();
		this.FieldTempFridge();
		this.FieldTempExtern();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void FrameCreation() throws Exception {
		this.frame = new JFrame();
		this.frame.getContentPane().setBackground(Color.BLACK);
		this.frame.setBounds(100, 100, 811, 544);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);
	}

	/**
	 * Temp ext.
	 */
	public void TempExt() {
		this.txtTempExt = new JTextField();
		this.txtTempExt.setBackground(Color.BLACK);
		this.txtTempExt.setForeground(Color.WHITE);
		this.txtTempExt.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempExt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempExt.setText("Temp\u00E9rtaure actuelle de la pi\u00E8ce");
		this.txtTempExt.setBounds(10, 107, 775, 37);
		this.frame.getContentPane().add(this.txtTempExt);
		this.txtTempExt.setColumns(10);

	}

	/**
	 * Temp module peltier.
	 */
	public void TempModulePeltier() {
		this.txtTempModulePeltier = new JTextField();
		this.txtTempModulePeltier.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempModulePeltier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempModulePeltier.setForeground(Color.WHITE);
		this.txtTempModulePeltier.setBackground(Color.BLACK);
		this.txtTempModulePeltier.setText("Temp\u00E9rature du module Peltier");
		this.txtTempModulePeltier.setBounds(10, 203, 775, 37);
		this.frame.getContentPane().add(this.txtTempModulePeltier);
		this.txtTempModulePeltier.setColumns(10);
	}

	/**
	 * Temp intern.
	 */
	public void TempIntern() {

		this.txtTempIntern = new JTextField();
		this.txtTempIntern.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempIntern.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempIntern.setBackground(Color.BLACK);
		this.txtTempIntern.setForeground(Color.WHITE);
		this.txtTempIntern.setText("Temp\u00E9rature actuelle du r\u00E9frig\u00E9rateur");
		this.txtTempIntern.setBounds(10, 11, 775, 37);
		this.frame.getContentPane().add(this.txtTempIntern);
		this.txtTempIntern.setColumns(10);
	}

	/**
	 * Temp chose by user.
	 */
	public void TempChoseByUser() {
		this.txtTempChoseByUser = new JTextField();
		this.txtTempChoseByUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempChoseByUser.setBackground(Color.GRAY);
		this.txtTempChoseByUser.setForeground(Color.WHITE);
		this.txtTempChoseByUser.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempChoseByUser.setText("Temp\u00E9rature d\u00E9sir\u00E9e");
		this.txtTempChoseByUser.setBounds(10, 321, 775, 37);
		this.frame.getContentPane().add(this.txtTempChoseByUser);
		this.txtTempChoseByUser.setColumns(10);
	}

	/**
	 * Attention condensation.
	 */
	public void AttentionCondensation() {
		View.txtAttentionCondensation = new JTextField();
		View.txtAttentionCondensation.setEditable(false);
		View.txtAttentionCondensation.setHorizontalAlignment(SwingConstants.CENTER);
		View.txtAttentionCondensation.setForeground(Color.RED);
		View.txtAttentionCondensation.setFont(new Font("Tahoma", Font.PLAIN, 24));
		View.txtAttentionCondensation.setText("ATTENTION, IL Y A FORMATION DE CONDENSATION!!!");
		View.txtAttentionCondensation.setBounds(10, 451, 775, 43);
		this.frame.getContentPane().add(View.txtAttentionCondensation);
		View.txtAttentionCondensation.setColumns(10);
		View.txtAttentionCondensation.setVisible(false);
	}

	/**
	 * Ateention variation temperature.
	 */
	public void AteentionVariationTemperature() {
		View.txtAttentionTemperature = new JTextField();
		View.txtAttentionTemperature.setEditable(false);
		View.txtAttentionTemperature.setHorizontalAlignment(SwingConstants.CENTER);
		View.txtAttentionTemperature.setForeground(Color.RED);
		View.txtAttentionTemperature.setFont(new Font("Tahoma", Font.PLAIN, 24));
		View.txtAttentionTemperature.setText("ATTENTION, VERIFIEZ QUE LA PORTE EST FERMEE!!!");
		View.txtAttentionTemperature.setBounds(10, 409, 775, 43);
		this.frame.getContentPane().add(View.txtAttentionTemperature);
		View.txtAttentionTemperature.setColumns(10);
		View.txtAttentionTemperature.setVisible(false);
	}

	/**
	 * Field temp desire.
	 */
	public void FieldTempDesire() {
		View.textFieldTempDesire = new JTextField();
		View.textFieldTempDesire.setEditable(false);
		View.textFieldTempDesire.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.textFieldTempDesire.setHorizontalAlignment(SwingConstants.CENTER);
		View.textFieldTempDesire.setBounds(221, 369, 342, 37);
		this.frame.getContentPane().add(View.textFieldTempDesire);
		View.textFieldTempDesire.setColumns(10);
		this.getTextField().setText("" + this.temp_frigo + " °C");
	}

	/**
	 * Text field temp module peltier.
	 */
	public void textFieldTempModulePeltier() {
		View.textFieldTempModulePeltier = new JTextField();
		View.textFieldTempModulePeltier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.textFieldTempModulePeltier.setHorizontalAlignment(SwingConstants.CENTER);
		View.textFieldTempModulePeltier.setEditable(false);
		View.textFieldTempModulePeltier.setBounds(221, 251, 342, 37);
		this.frame.getContentPane().add(View.textFieldTempModulePeltier);
		View.textFieldTempModulePeltier.setColumns(10);
	}

	/**
	 * Field temp fridge.
	 */
	public void FieldTempFridge() {

		View.textFieldTempFridge = new JTextField();
		View.textFieldTempFridge.setEditable(false);
		View.textFieldTempFridge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.textFieldTempFridge.setHorizontalAlignment(SwingConstants.CENTER);
		View.textFieldTempFridge.setBounds(221, 59, 342, 37);
		this.frame.getContentPane().add(View.textFieldTempFridge);
		View.textFieldTempFridge.setColumns(10);
	}

	/**
	 * Field temp extern.
	 */
	public void FieldTempExtern() {

		View.textFieldTempExtern = new JTextField();
		View.textFieldTempExtern.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.textFieldTempExtern.setHorizontalAlignment(SwingConstants.CENTER);
		View.textFieldTempExtern.setEditable(false);
		View.textFieldTempExtern.setBounds(221, 155, 342, 37);
		this.frame.getContentPane().add(View.textFieldTempExtern);
		View.textFieldTempExtern.setColumns(10);
	}

	/**
	 * Click plus button.
	 *
	 * @throws Exception
	 *             the exception
	 */

	public void clickPlusButton() throws Exception {
		if (this.temp_frigo == 19) {
			this.getTextField().setText("" + this.temp_frigo + " °C");
		} else {
			this.temp_frigo++;
			this.getTextField().setText("" + this.temp_frigo + " °C");
			ArduinoCommunication.output.write("z".getBytes());
		}
	}

	/**
	 * Click minus button.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */

	public void clickMinusButton() throws IOException {
		if (this.temp_frigo == 17) {
			this.getTextField().setText("" + this.temp_frigo + " °C");
		} else {
			this.temp_frigo--;
			this.getTextField().setText("" + this.temp_frigo + " °C");
			ArduinoCommunication.output.write("a".getBytes());
		}
	}

	/**
	 * Gets the text field.
	 *
	 * @return the text field
	 */
	public JTextField getTextField() {
		return View.textFieldTempDesire;
	}

	/**
	 * Sets the text field.
	 *
	 * @param textField
	 *            the new text field
	 */
	public void setTextField(final JTextField textField) {
		View.textFieldTempDesire = textField;
	}

	/**
	 * Gets the text field 2.
	 *
	 * @return the text field 2
	 */
	public JTextField getTextField_2() {
		return View.textFieldTempFridge;
	}

	/**
	 * Sets the text field 2.
	 *
	 * @param textField_2
	 *            the new text field 2
	 */
	public void setTextField_2(final JTextField textField_2) {
		View.textFieldTempFridge = textField_2;
	}

	/**
	 * Gets the txt attention apparition de.
	 *
	 * @return the txt attention apparition de
	 */
	public JTextField getTxtAttentionApparitionDe() {
		return View.txtAttentionCondensation;
	}

	/**
	 * Sets the txt attention apparition de.
	 *
	 * @param txtAttentionApparitionDe
	 *            the new txt attention apparition de
	 */
	public void setTxtAttentionApparitionDe(final JTextField txtAttentionApparitionDe) {
		View.txtAttentionCondensation = txtAttentionApparitionDe;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public Model getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	public void setModel(final Model model) {
		this.model = model;
	}

	/**
	 * Plus button.
	 */
	public void PlusButton() { // Affiche le bouton + sur l'interface

		final JButton PlusButton = new JButton("+");
		PlusButton.setBackground(Color.GREEN);
		PlusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PlusButton.setBounds(602, 369, 122, 37);
		this.frame.getContentPane().add(PlusButton);
		PlusButton.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(final ActionEvent e) {
				try {
					View.this.clickPlusButton();
				} catch (final Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	/**
	 * Minus button.
	 */
	public void MinusButton() { // Affiche le bouton - sur l'interface
		final JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				try {
					View.this.clickMinusButton();
				} catch (final IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(59, 369, 122, 37);
		this.frame.getContentPane().add(btnNewButton_1);

	}

}
