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

    public JTextField getTxtAttentionApparitionDe() {
        return this.txtAttentionCondensation;
    }

    public void setTxtAttentionApparitionDe(final JTextField txtAttentionApparitionDe) {
        this.txtAttentionCondensation = txtAttentionApparitionDe;
    }

    JFrame             frame;
    private JTextField txtTempExt;
    private JTextField txtTempModulePeltier;
    private JTextField txtTempIntern;
    private JTextField txtTempChoseByUser;
    private JTextField txtAttentionCondensation;
    private JTextField textFieldTempDesire;
    private JTextField textFieldTempModulePeltier;
    private JTextField textFieldTempFridge;
    private JTextField textFieldTempExtern;
    public int         temp_frigo    = 18;
    private final int  temp_actuelle = 18;

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

        this.txtTempExt = new JTextField();
        this.txtTempExt.setBackground(Color.BLACK);
        this.txtTempExt.setForeground(Color.WHITE);
        this.txtTempExt.setHorizontalAlignment(SwingConstants.CENTER);
        this.txtTempExt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.txtTempExt.setText("Temp\u00E9rtaure actuelle de la pi\u00E8ce");
        this.txtTempExt.setBounds(10, 107, 775, 37);
        this.frame.getContentPane().add(this.txtTempExt);
        this.txtTempExt.setColumns(10);

        this.txtTempModulePeltier = new JTextField();
        this.txtTempModulePeltier.setHorizontalAlignment(SwingConstants.CENTER);
        this.txtTempModulePeltier.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.txtTempModulePeltier.setForeground(Color.WHITE);
        this.txtTempModulePeltier.setBackground(Color.BLACK);
        this.txtTempModulePeltier.setText("Temp\u00E9rature du module Peltier");
        this.txtTempModulePeltier.setBounds(10, 203, 775, 37);
        this.frame.getContentPane().add(this.txtTempModulePeltier);
        this.txtTempModulePeltier.setColumns(10);

        this.txtTempIntern = new JTextField();
        this.txtTempIntern.setHorizontalAlignment(SwingConstants.CENTER);
        this.txtTempIntern.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.txtTempIntern.setBackground(Color.BLACK);
        this.txtTempIntern.setForeground(Color.WHITE);
        this.txtTempIntern.setText("Temp\u00E9rature actuelle du r\u00E9frig\u00E9rateur");
        this.txtTempIntern.setBounds(10, 11, 775, 37);
        this.frame.getContentPane().add(this.txtTempIntern);
        this.txtTempIntern.setColumns(10);

        this.txtTempChoseByUser = new JTextField();
        this.txtTempChoseByUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.txtTempChoseByUser.setBackground(Color.GRAY);
        this.txtTempChoseByUser.setForeground(Color.WHITE);
        this.txtTempChoseByUser.setHorizontalAlignment(SwingConstants.CENTER);
        this.txtTempChoseByUser.setText("Temp\u00E9rature d\u00E9sir\u00E9e");
        this.txtTempChoseByUser.setBounds(10, 321, 775, 37);
        this.frame.getContentPane().add(this.txtTempChoseByUser);
        this.txtTempChoseByUser.setColumns(10);

        this.txtAttentionCondensation = new JTextField();
        this.txtAttentionCondensation.setEditable(false);
        this.txtAttentionCondensation.setHorizontalAlignment(SwingConstants.CENTER);
        this.txtAttentionCondensation.setForeground(Color.RED);
        this.txtAttentionCondensation.setFont(new Font("Tahoma", Font.PLAIN, 24));
        this.txtAttentionCondensation.setText("ATTENTION, APPARITION DE CONDENSATION DETECTEE");
        this.txtAttentionCondensation.setBounds(10, 446, 775, 48);
        this.frame.getContentPane().add(this.txtAttentionCondensation);
        this.txtAttentionCondensation.setColumns(10);

        this.textFieldTempDesire = new JTextField();
        this.textFieldTempDesire.setEditable(false);
        this.textFieldTempDesire.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.textFieldTempDesire.setHorizontalAlignment(SwingConstants.CENTER);
        this.textFieldTempDesire.setBounds(221, 369, 342, 37);
        this.frame.getContentPane().add(this.textFieldTempDesire);
        this.textFieldTempDesire.setColumns(10);
        this.getTextField().setText("" + this.temp_frigo + " °C");

        this.textFieldTempDesire = new JTextField();
        this.textFieldTempDesire.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.textFieldTempDesire.setEnabled(false);
        this.textFieldTempDesire.setBounds(221, 251, 342, 37);
        this.frame.getContentPane().add(this.textFieldTempDesire);
        this.textFieldTempDesire.setColumns(10);

        this.textFieldTempFridge = new JTextField();
        this.textFieldTempFridge.setEditable(false);
        this.textFieldTempFridge.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.textFieldTempFridge.setHorizontalAlignment(SwingConstants.CENTER);
        this.textFieldTempFridge.setBounds(221, 59, 342, 37);
        this.frame.getContentPane().add(this.textFieldTempFridge);
        this.textFieldTempFridge.setColumns(10);
        this.textFieldTempFridge.setText("" + this.temp_actuelle + "°C");

        this.textFieldTempExtern = new JTextField();
        this.textFieldTempExtern.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.textFieldTempExtern.setEnabled(false);
        this.textFieldTempExtern.setBounds(221, 155, 342, 37);
        this.frame.getContentPane().add(this.textFieldTempExtern);
        this.textFieldTempExtern.setColumns(10);
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
        return this.textFieldTempDesire;
    }

    public void setTextField(final JTextField textField) {
        this.textFieldTempDesire = textField;
    }

    public JTextField getTextField_2() {
        return this.textFieldTempFridge;
    }

    public void setTextField_2(final JTextField textField_2) {
        this.textFieldTempFridge = textField_2;
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
                Window.this.clickPlusButton();
            }
        });

    }

    public void LessButton() { // Affiche le bouton - sur l'interface
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

    }

}
