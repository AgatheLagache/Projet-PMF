package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window {

	public JTextField getTextField_3() {
		return this.textField_3;
	}

	public void setTextField_3(final JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTxtAttentionApparitionDe() {
		return this.txtAttentionApparitionDe;
	}

	public void setTxtAttentionApparitionDe(final JTextField txtAttentionApparitionDe) {
		this.txtAttentionApparitionDe = txtAttentionApparitionDe;
	}

	JFrame             frame;
	private JTextField txtTemprtaureActuelleDe;
	private JTextField txtTempratureDuModule;
	private JTextField txtTempratureActuelleDu;
	private JTextField txtTempratureDsire;
	private JTextField txtAttentionApparitionDe;
	private JTextField textField;
	private JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public int         temp_frigo    = 18;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 *
	 * @throws Exception
	 */
	public Window() throws Exception {
		this.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 * @throws Exception
	 */
	//@SuppressWarnings("static-access")
	public void initialize() throws Exception {
		this.frame = new JFrame();
		this.frame.getContentPane().setBackground(Color.BLACK);
		this.frame.setBounds(100, 100, 811, 544);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);

		final JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(602, 369, 122, 37);
		this.frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(final ActionEvent e) {
				Window.this.clickPlusButton();
			}
		});

		final JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				Window.this.clickMinusButton();
			}
		});
		btnNewButton_1.setBounds(59, 369, 122, 37);
		this.frame.getContentPane().add(btnNewButton_1);

		this.txtTemprtaureActuelleDe = new JTextField();
		this.txtTemprtaureActuelleDe.setBackground(Color.BLACK);
		this.txtTemprtaureActuelleDe.setForeground(Color.WHITE);
		this.txtTemprtaureActuelleDe.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTemprtaureActuelleDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTemprtaureActuelleDe.setText("Temp\u00E9rtaure actuelle de la pi\u00E8ce");
		this.txtTemprtaureActuelleDe.setBounds(10, 107, 775, 37);
		this.frame.getContentPane().add(this.txtTemprtaureActuelleDe);
		this.txtTemprtaureActuelleDe.setColumns(10);

		this.txtTempratureDuModule = new JTextField();
		this.txtTempratureDuModule.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempratureDuModule.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempratureDuModule.setForeground(Color.WHITE);
		this.txtTempratureDuModule.setBackground(Color.BLACK);
		this.txtTempratureDuModule.setText("Temp\u00E9rature du module Peltier");
		this.txtTempratureDuModule.setBounds(10, 203, 775, 37);
		this.frame.getContentPane().add(this.txtTempratureDuModule);
		this.txtTempratureDuModule.setColumns(10);

		this.txtTempratureActuelleDu = new JTextField();
		this.txtTempratureActuelleDu.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempratureActuelleDu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempratureActuelleDu.setBackground(Color.BLACK);
		this.txtTempratureActuelleDu.setForeground(Color.WHITE);
		this.txtTempratureActuelleDu.setText("Temp\u00E9rature actuelle du r\u00E9frig\u00E9rateur");
		this.txtTempratureActuelleDu.setBounds(10, 11, 775, 37);
		this.frame.getContentPane().add(this.txtTempratureActuelleDu);
		this.txtTempratureActuelleDu.setColumns(10);

		this.txtTempratureDsire = new JTextField();
		this.txtTempratureDsire.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.txtTempratureDsire.setBackground(Color.GRAY);
		this.txtTempratureDsire.setForeground(Color.WHITE);
		this.txtTempratureDsire.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtTempratureDsire.setText("Temp\u00E9rature d\u00E9sir\u00E9e");
		this.txtTempratureDsire.setBounds(10, 321, 775, 37);
		this.frame.getContentPane().add(this.txtTempratureDsire);
		this.txtTempratureDsire.setColumns(10);

		this.txtAttentionApparitionDe = new JTextField();
		this.txtAttentionApparitionDe.setEditable(false);
		this.txtAttentionApparitionDe.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtAttentionApparitionDe.setForeground(Color.RED);
		this.txtAttentionApparitionDe.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.txtAttentionApparitionDe.setText("ATTENTION, APPARITION DE CONDENSATION DETECTEE");
		this.txtAttentionApparitionDe.setBounds(10, 446, 775, 48);
		this.frame.getContentPane().add(this.txtAttentionApparitionDe);
		this.txtAttentionApparitionDe.setColumns(10);

		this.textField = new JTextField();
		this.textField.setEditable(false);
		this.textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.textField.setHorizontalAlignment(SwingConstants.CENTER);
		this.textField.setBounds(221, 369, 342, 37);
		this.frame.getContentPane().add(this.textField);
		this.textField.setColumns(10);
		this.getTextField().setText("" + this.temp_frigo +  " °C");


		this.textField_1 = new JTextField();
		this.textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.textField_1.setEnabled(false);
		this.textField_1.setBounds(221, 251, 342, 37);
		this.frame.getContentPane().add(this.textField_1);
		this.textField_1.setColumns(10);

		this.textField_2 = new JTextField();
		this.textField_2.setEditable(false);
		this.textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.textField_2.setBounds(221, 59, 342, 37);
		this.frame.getContentPane().add(this.textField_2);
		this.textField_2.setColumns(10);


		this.textField_3 = new JTextField();
		this.textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.textField_3.setEditable(false);
		this.textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.textField_3.setBounds(221, 155, 342, 37);
		this.frame.getContentPane().add(this.textField_3);
		this.textField_3.setColumns(10);

	}

	public void clickPlusButton() {
		this.temp_frigo++;
		this.getTextField().setText("" + this.temp_frigo + " °C");
	}

	public void clickMinusButton() {
		if (this.temp_frigo == 0) {
			this.getTextField().setText("" + this.temp_frigo + " °C");
		} else {
			this.temp_frigo--;
			this.getTextField().setText("" + this.temp_frigo + " °C");
		}
	}

	public JTextField getTextField() {
		return this.textField;
	}

	public void setTextField(final JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_2() {
		return this.textField_2;
	}

	public void setTextField_2(final JTextField textField_2) {
		this.textField_2 = textField_2;
	}

}
