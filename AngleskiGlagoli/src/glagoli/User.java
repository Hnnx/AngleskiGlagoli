package glagoli;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

public class User extends JFrame {

	private JPanel contentPane;
	private static JTextField vnosUsername;
	private JPasswordField vnosPassword;
	private static String uporabniskoIme; 

	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 166);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUporabnik = new JLabel("Uporabnik");
		lblUporabnik.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUporabnik.setBounds(10, 11, 98, 27);
		contentPane.add(lblUporabnik);
		
		vnosUsername = new JTextField();
		vnosUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		vnosUsername.setBounds(91, 15, 162, 20);
		contentPane.add(vnosUsername);
		vnosUsername.setColumns(10);
		
		JButton btnVstop = new JButton("VSTOP");
		btnVstop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preveriPodatke();
			}
			
		});
		btnVstop.setBackground(SystemColor.inactiveCaption);
		btnVstop.setBounds(256, 93, 79, 23);
		contentPane.add(btnVstop);
		
		JButton btnIzhod = new JButton("IZHOD");
		btnIzhod.setBackground(SystemColor.inactiveCaption);
		btnIzhod.setForeground(Color.BLACK);
		btnIzhod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIzhod.setBounds(21, 93, 87, 23);
		contentPane.add(btnIzhod);
		
		JLabel lblGeslo = new JLabel("Geslo");
		lblGeslo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGeslo.setBounds(20, 45, 55, 27);
		contentPane.add(lblGeslo);
		
		vnosPassword = new JPasswordField();
		vnosPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		vnosPassword.setColumns(10);
		vnosPassword.setBounds(91, 49, 162, 20);
		contentPane.add(vnosPassword);
	}
	
	
	private void preveriPodatke() {
		
		uporabniskoIme = vnosUsername.getText();
		char[] getPassword = vnosPassword.getPassword();
		String stringPassword = new String(vnosPassword.getPassword());
		
		if( uporabniskoIme.equals("Nejc") && stringPassword.equals("g") ) {
			
			JOptionPane.showMessageDialog(null, "Pozdravljen, "+ uporabniskoIme);
			Ucenec u = new Ucenec();
			u.setVisible(true);
			dispose();
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Geslo in ime se ne ujemata","Napacen vnos",JOptionPane.ERROR_MESSAGE );
		}
		
		
	}
	
	public void setUporabnikoIme(String ime) {
		this.uporabniskoIme = ime;
	}
	
	public String getUporabniskoIme() {
		
		return uporabniskoIme;
	}
}
