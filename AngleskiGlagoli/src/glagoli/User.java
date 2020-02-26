package glagoli;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class User extends JFrame {

	//Panels
	private JPanel okvirPanel;
	private JPanel userInfoPanel;
	private JPanel gumbiPanel;
	
	//Username/Password fields
	private JLabel uporabnikLabel;
	private JTextField vnosUsername;	
	private JPasswordField vnosPassword;
	private JLabel gesloLabel;
	
	private static String uporabniskoIme; 
	
	//Gumbi Vhod/Izhod
	private JButton btnIzhod;
	private JButton btnVstop;
	
	//Paleta
	private static Color temnoModra = new Color(0, 0, 51);
	private static Color offModra = new Color(0,0,51);
	

	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 166);
		okvirPanel = new JPanel();
		okvirPanel.setBackground(offModra);
		okvirPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		okvirPanel.setLayout(null);
		setContentPane(okvirPanel);
		
		
		/*	>> USER INFO PANEL	<< */
		userInfoPanel = new JPanel();
		userInfoPanel.setBounds(10, 11, 275, 61);
		userInfoPanel.setBackground(offModra);
		userInfoPanel.setOpaque(false);
		okvirPanel.add(userInfoPanel);
		GridBagLayout gbl_userInfoPanel = new GridBagLayout();
		gbl_userInfoPanel.columnWidths = new int[]{137, 137, 0};
		gbl_userInfoPanel.rowHeights = new int[]{25, 25, 0};
		gbl_userInfoPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_userInfoPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		userInfoPanel.setLayout(gbl_userInfoPanel);
		
		uporabnikLabel = new JLabel("Uporabnik");
		GridBagConstraints gbc_uporabnikLabel = new GridBagConstraints();
		gbc_uporabnikLabel.fill = GridBagConstraints.VERTICAL;
		gbc_uporabnikLabel.insets = new Insets(0, 0, 5, 5);
		gbc_uporabnikLabel.gridx = 0;
		gbc_uporabnikLabel.gridy = 0;
		userInfoPanel.add(uporabnikLabel, gbc_uporabnikLabel);
		uporabnikLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		uporabnikLabel.setForeground(Color.white);
		
		
		vnosUsername = new JTextField();
		GridBagConstraints gbc_vnosUsername = new GridBagConstraints();
		gbc_vnosUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_vnosUsername.insets = new Insets(0, 0, 5, 0);
		gbc_vnosUsername.gridx = 1;
		gbc_vnosUsername.gridy = 0;
		vnosUsername.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		userInfoPanel.add(vnosUsername, gbc_vnosUsername);
		vnosUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		vnosUsername.setColumns(10);
		
		gesloLabel = new JLabel("Geslo");
		GridBagConstraints gbc_gesloLabel = new GridBagConstraints();
		gbc_gesloLabel.fill = GridBagConstraints.VERTICAL;
		gbc_gesloLabel.insets = new Insets(0, 0, 0, 5);
		gbc_gesloLabel.gridx = 0;
		gbc_gesloLabel.gridy = 1;
		userInfoPanel.add(gesloLabel, gbc_gesloLabel);
		gesloLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		gesloLabel.setForeground(Color.white);
		
		vnosPassword = new JPasswordField();
		GridBagConstraints gbc_vnosPassword = new GridBagConstraints();
		gbc_vnosPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_vnosPassword.gridx = 1;
		gbc_vnosPassword.gridy = 1;
		vnosPassword.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		userInfoPanel.add(vnosPassword, gbc_vnosPassword);
		vnosPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		vnosPassword.setColumns(10);
		
		/*	>> GUMBI PANEL	<< */
		gumbiPanel = new JPanel();
		gumbiPanel.setBounds(68, 83, 180, 24);
		gumbiPanel.setBackground(offModra);
		gumbiPanel.setOpaque(false);
		okvirPanel.add(gumbiPanel);
		gumbiPanel.setLayout(null);
		
		btnIzhod = new JButton("IZHOD");
		btnIzhod.setBounds(0, 0, 60, 23);
		btnIzhod.setBackground(temnoModra);
		btnIzhod.setForeground(Color.white);
		btnIzhod.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		gumbiPanel.add(btnIzhod);
		btnIzhod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnVstop = new JButton("VSTOP");
		btnVstop.setBounds(120, 0, 60, 23);
		btnVstop.setForeground(Color.WHITE);
		btnVstop.setBackground(temnoModra);
		btnVstop.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		gumbiPanel.add(btnVstop);
		btnVstop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preveriPodatke();
			}
			
		});
	}
	
	
	
	private void preveriPodatke() {
		
		uporabniskoIme = vnosUsername.getText();
		char[] getPassword = vnosPassword.getPassword();
		String stringPassword = new String(vnosPassword.getPassword());
		
		if( uporabniskoIme.equals("user") && stringPassword.equals("admin")     ||   uporabniskoIme.equals("Admin") && stringPassword.equals("geslo1")  || uporabniskoIme.equals("Nejc") && stringPassword.equals("geslo1")) {
			
			JOptionPane.showMessageDialog(null, "Pozdravljen, "+ uporabniskoIme);
			Ucenec u = new Ucenec();
			u.setVisible(true);
			dispose();
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Geslo in ime se ne ujemata","Napacen vnos",JOptionPane.ERROR_MESSAGE );
		}
		
		
	}
	
	public String getUporabniskoIme() {
		
		return uporabniskoIme;
	}
}
