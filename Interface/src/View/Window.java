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

import Model.ArduinoCommunication;

public class Window {

	public JFrame frame;
	public JTextField txtTempExt;
	private JTextField txtTempModulePeltier;
	public JTextField txtTempIntern;
	private JTextField txtTempChoseByUser;
	public static JTextField txtAttentionCondensation;
	private JTextField textFieldTempDesire;
	public static JTextField textFieldTempModulePeltier;
	public static JTextField textFieldTempFridge;
	public static JTextField textFieldTempExtern;
	public int temp_frigo = 18;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 *
	 * @throws Exception
	 */
	public Window() throws Exception {
		this.FrameCreation();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 * @throws Exception
	 */
	public void FrameCreation() throws Exception {
		this.frame = new JFrame();
		this.frame.getContentPane().setBackground(Color.BLACK);
		this.frame.setBounds(100, 100, 811, 544);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);
	}

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

	public void AttentionCondensation() {

		Window.txtAttentionCondensation = new JTextField();
		Window.txtAttentionCondensation.setEditable(false);
		Window.txtAttentionCondensation.setHorizontalAlignment(SwingConstants.CENTER);
		Window.txtAttentionCondensation.setForeground(Color.RED);
		Window.txtAttentionCondensation.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Window.txtAttentionCondensation.setText("ATTENTION, IL Y A FORMATION DE CONDENSATION!!!");
		Window.txtAttentionCondensation.setBounds(10, 446, 775, 48);
		this.frame.getContentPane().add(Window.txtAttentionCondensation);
		Window.txtAttentionCondensation.setColumns(10);
		Window.txtAttentionCondensation.setVisible(false);
	}

	public void FieldTempDesire() {
		this.textFieldTempDesire = new JTextField();
		this.textFieldTempDesire.setEditable(false);
		this.textFieldTempDesire.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.textFieldTempDesire.setHorizontalAlignment(SwingConstants.CENTER);
		this.textFieldTempDesire.setBounds(221, 369, 342, 37);
		this.frame.getContentPane().add(this.textFieldTempDesire);
		this.textFieldTempDesire.setColumns(10);
		this.getTextField().setText("" + this.temp_frigo + " °C");
	}

	public void textFieldTempModulePeltier() {
		Window.textFieldTempModulePeltier = new JTextField();
		Window.textFieldTempModulePeltier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Window.textFieldTempModulePeltier.setHorizontalAlignment(SwingConstants.CENTER);
		Window.textFieldTempModulePeltier.setEditable(false);
		Window.textFieldTempModulePeltier.setBounds(221, 251, 342, 37);
		this.frame.getContentPane().add(Window.textFieldTempModulePeltier);
		Window.textFieldTempModulePeltier.setColumns(10);
	}

	public void FieldTempFridge() {

		Window.textFieldTempFridge = new JTextField();
		Window.textFieldTempFridge.setEditable(false);
		Window.textFieldTempFridge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Window.textFieldTempFridge.setHorizontalAlignment(SwingConstants.CENTER);
		Window.textFieldTempFridge.setBounds(221, 59, 342, 37);
		this.frame.getContentPane().add(Window.textFieldTempFridge);
		Window.textFieldTempFridge.setColumns(10);
	}

	public void FieldTempExtern() {

		Window.textFieldTempExtern = new JTextField();
		Window.textFieldTempExtern.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Window.textFieldTempExtern.setHorizontalAlignment(SwingConstants.CENTER);
		Window.textFieldTempExtern.setEditable(false);
		Window.textFieldTempExtern.setBounds(221, 155, 342, 37);
		this.frame.getContentPane().add(Window.textFieldTempExtern);
		Window.textFieldTempExtern.setColumns(10);
	}

	public void clickPlusButton() throws Exception {
		if (this.temp_frigo == 19) {
			this.getTextField().setText("" + this.temp_frigo + " °C");
		} else {
			this.temp_frigo++;
			this.getTextField().setText("" + this.temp_frigo + " °C");
			ArduinoCommunication.output.write("z".getBytes());
		}
	}

	public void clickMinusButton() throws IOException {
		if (this.temp_frigo == 17) {
			this.getTextField().setText("" + this.temp_frigo + " °C");
		} else {
			this.temp_frigo--;
			this.getTextField().setText("" + this.temp_frigo + " °C");
			ArduinoCommunication.output.write("a".getBytes());
		}
	}

	public JTextField getTextField() {
		return this.textFieldTempDesire;
	}

	public void setTextField(final JTextField textField) {
		this.textFieldTempDesire = textField;
	}

	public JTextField getTextField_2() {
		return Window.textFieldTempFridge;
	}

	public void setTextField_2(final JTextField textField_2) {
		Window.textFieldTempFridge = textField_2;
	}

	public JTextField getTxtAttentionApparitionDe() {
		return Window.txtAttentionCondensation;
	}

	public void setTxtAttentionApparitionDe(final JTextField txtAttentionApparitionDe) {
		Window.txtAttentionCondensation = txtAttentionApparitionDe;
	}

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
					Window.this.clickPlusButton();
				} catch (final Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	public void MinusButton() { // Affiche le bouton - sur l'interface
		final JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				try {
					Window.this.clickMinusButton();
				} catch (final IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(59, 369, 122, 37);
		this.frame.getContentPane().add(btnNewButton_1);

	}

}
