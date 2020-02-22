package glagoli;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ucenec extends JFrame {

	private JPanel frame;
	
	//>> Glagoli
	private JTextField glagol1, pastS1,pastP1, prevod1;	
	private JTextField glagol2, pastS2, pastP2, prevod2;
	private JTextField glagol3, pastS3, pastP3, prevod3;
	private JTextField glagol4, pastS4 ,pastP4, prevod4;
	private JTextField glagol5, pastS5, pastP5, prevod5;
	private JTextField glagol6, pastS6 ,pastP6 ,prevod6;
	private JTextField glagol7, pastS7, pastP7 ,prevod7;	
	private JTextField glagol8, pastS8, pastP8, prevod8;
	private JTextField glagol9 ,pastS9, pastP9, prevod9;
	private JTextField glagol10, pastS10, pastP10, prevod10;
	private JTextField glagol11, pastS11, pastP11, prevod11;
	private JTextField glagol12, pastS12, pastP12, prevod12;
	private JTextField glagol13, pastS13, pastP13, prevod13;
	private JTextField glagol14, pastS14, pastP14, prevod14;
	private JTextField glagol15, pastS15, pastP15, prevod15;
	
	
	
	//>> Tab nad glagoli
	private JPanel vrsticaZNapisi;	
	private JLabel glagolTab, pastSimpleTab, pastPrincipleTab, prevodTab;
	
	private JButton check1;
	private JButton check2;
	private JButton check3;
	private JButton check4;
	private JButton check5;
	private JButton check6;
	private JButton aaa;
	private JButton check8aaa;
	private JButton aa;
	private JButton check9;
	private JButton check8;
	private JButton check7;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	
	private JLabel resetIcon;
	private JLabel tocke15;
	
	Color temnoModra = new Color(0, 0, 51);
	
	public Ucenec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 904);
		frame = new JPanel();
		frame.setBackground(new Color(0, 51, 102));
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame);
		frame.setLayout(null);
		
		JPanel glagolPanel = new JPanel();
		glagolPanel.setBounds(40, 184, 704, 649);
		frame.add(glagolPanel);
		glagolPanel.setLayout(new GridLayout(0, 4, 20, 20));
		
		
		
		glagol1 = new JTextField();
		glagol1.setText("HAVE");
		glagol1.setEditable(false);
		glagol1.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(glagol1);
		glagol1.setColumns(10);
		
		pastS1 = new JTextField();
		pastS1.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastS1);
		pastS1.setColumns(10);
		
		pastP1 = new JTextField();
		pastP1.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastP1);
		pastP1.setColumns(10);
		
		prevod1 = new JTextField();
		prevod1.setEditable(false);
		prevod1.setText("IMETI");
		prevod1.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(prevod1);
		prevod1.setColumns(10);
		
		glagol2 = new JTextField();
		glagol2.setEditable(false);
		glagol2.setText("LOSE");
		glagol2.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(glagol2);
		glagol2.setColumns(10);
		
		pastS2 = new JTextField();
		pastS2.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastS2);
		pastS2.setColumns(10);
		
		pastP2 = new JTextField();
		pastP2.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastP2);
		pastP2.setColumns(10);
		
		prevod2 = new JTextField();
		prevod2.setEditable(false);
		prevod2.setText("IZGUBITI");
		prevod2.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(prevod2);
		prevod2.setColumns(10);
		
		glagol3 = new JTextField();
		glagol3.setText("STAND");
		glagol3.setEditable(false);
		glagol3.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(glagol3);
		glagol3.setColumns(10);
		
		pastS3 = new JTextField();
		pastS3.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastS3);
		pastS3.setColumns(10);
		
		pastP3 = new JTextField();
		pastP3.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastP3);
		pastP3.setColumns(10);
		
		prevod3 = new JTextField();
		prevod3.setEditable(false);
		prevod3.setText("STATI");
		prevod3.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(prevod3);
		prevod3.setColumns(10);
		
		glagol4 = new JTextField();
		glagol4.setText("EAT");
		glagol4.setEditable(false);
		glagol4.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(glagol4);
		glagol4.setColumns(10);
		
		pastS4 = new JTextField();
		pastS4.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastS4);
		pastS4.setColumns(10);
		
		pastP4 = new JTextField();
		pastP4.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastP4);
		pastP4.setColumns(10);
		
		prevod4 = new JTextField();
		prevod4.setEditable(false);
		prevod4.setText("JESTI");
		prevod4.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(prevod4);
		prevod4.setColumns(10);
		
		glagol5 = new JTextField();
		glagol5.setText("MEET");
		glagol5.setEditable(false);
		glagol5.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(glagol5);
		glagol5.setColumns(10);
		
		pastS5 = new JTextField();
		pastS5.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastS5);
		pastS5.setColumns(10);
		
		pastP5 = new JTextField();
		pastP5.setHorizontalAlignment(SwingConstants.CENTER);
		glagolPanel.add(pastP5);
		pastP5.setColumns(10);
		
		prevod5 = new JTextField();
		prevod5.setEditable(false);
		prevod5.setText("SRECATI");
		prevod5.setHorizontalAlignment(SwingConstants.CENTER);
		prevod5.setColumns(10);
		glagolPanel.add(prevod5);
		
		glagol6 = new JTextField();
		glagol6.setText("THINK");
		glagol6.setEditable(false);
		glagol6.setHorizontalAlignment(SwingConstants.CENTER);
		glagol6.setColumns(10);
		glagolPanel.add(glagol6);
		
		pastS6 = new JTextField();
		pastS6.setHorizontalAlignment(SwingConstants.CENTER);
		pastS6.setColumns(10);
		glagolPanel.add(pastS6);
		
		pastP6 = new JTextField();
		pastP6.setHorizontalAlignment(SwingConstants.CENTER);
		pastP6.setColumns(10);
		glagolPanel.add(pastP6);
		
		prevod6 = new JTextField();
		prevod6.setEditable(false);
		prevod6.setText("MISLITI");
		prevod6.setHorizontalAlignment(SwingConstants.CENTER);
		prevod6.setColumns(10);
		glagolPanel.add(prevod6);
		
		glagol7 = new JTextField();
		glagol7.setText("GET");
		glagol7.setEditable(false);
		glagol7.setHorizontalAlignment(SwingConstants.CENTER);
		glagol7.setColumns(10);
		glagolPanel.add(glagol7);
		
		pastS7 = new JTextField();
		pastS7.setHorizontalAlignment(SwingConstants.CENTER);
		pastS7.setColumns(10);
		glagolPanel.add(pastS7);
		
		pastP7 = new JTextField();
		pastP7.setHorizontalAlignment(SwingConstants.CENTER);
		pastP7.setColumns(10);
		glagolPanel.add(pastP7);
		
		prevod7 = new JTextField();
		prevod7.setEditable(false);
		prevod7.setText("DOBITI");
		prevod7.setHorizontalAlignment(SwingConstants.CENTER);
		prevod7.setColumns(10);
		glagolPanel.add(prevod7);
		
		glagol8 = new JTextField();
		glagol8.setText("DRAW");
		glagol8.setEditable(false);
		glagol8.setHorizontalAlignment(SwingConstants.CENTER);
		glagol8.setColumns(10);
		glagolPanel.add(glagol8);
		
		pastS8 = new JTextField();
		pastS8.setHorizontalAlignment(SwingConstants.CENTER);
		pastS8.setColumns(10);
		glagolPanel.add(pastS8);
		
		pastP8 = new JTextField();
		pastP8.setHorizontalAlignment(SwingConstants.CENTER);
		pastP8.setColumns(10);
		glagolPanel.add(pastP8);
		
		prevod8 = new JTextField();
		prevod8.setEditable(false);
		prevod8.setText("RISATI");
		prevod8.setHorizontalAlignment(SwingConstants.CENTER);
		prevod8.setColumns(10);
		glagolPanel.add(prevod8);
		
		glagol9 = new JTextField();
		glagol9.setText("KNOW");
		glagol9.setEditable(false);
		glagol9.setHorizontalAlignment(SwingConstants.CENTER);
		glagol9.setColumns(10);
		glagolPanel.add(glagol9);
		
		pastS9 = new JTextField();
		pastS9.setHorizontalAlignment(SwingConstants.CENTER);
		pastS9.setColumns(10);
		glagolPanel.add(pastS9);
		
		pastP9 = new JTextField();
		pastP9.setHorizontalAlignment(SwingConstants.CENTER);
		pastP9.setColumns(10);
		glagolPanel.add(pastP9);
		
		prevod9 = new JTextField();
		prevod9.setEditable(false);
		prevod9.setText("VEDETI");
		prevod9.setHorizontalAlignment(SwingConstants.CENTER);
		prevod9.setColumns(10);
		glagolPanel.add(prevod9);
		
		glagol10 = new JTextField();
		glagol10.setText("SING");
		glagol10.setEditable(false);
		glagol10.setHorizontalAlignment(SwingConstants.CENTER);
		glagol10.setColumns(10);
		glagolPanel.add(glagol10);
		
		pastS10 = new JTextField();
		pastS10.setHorizontalAlignment(SwingConstants.CENTER);
		pastS10.setColumns(10);
		glagolPanel.add(pastS10);
		
		pastP10 = new JTextField();
		pastP10.setHorizontalAlignment(SwingConstants.CENTER);
		pastP10.setColumns(10);
		glagolPanel.add(pastP10);
		
		prevod10 = new JTextField();
		prevod10.setEditable(false);
		prevod10.setText("PETI");
		prevod10.setHorizontalAlignment(SwingConstants.CENTER);
		prevod10.setColumns(10);
		glagolPanel.add(prevod10);
		
		glagol11 = new JTextField();
		glagol11.setText("SWIM");
		glagol11.setEditable(false);
		glagol11.setHorizontalAlignment(SwingConstants.CENTER);
		glagol11.setColumns(10);
		glagolPanel.add(glagol11);
		
		pastS11 = new JTextField();
		pastS11.setHorizontalAlignment(SwingConstants.CENTER);
		pastS11.setColumns(10);
		glagolPanel.add(pastS11);
		
		pastP11 = new JTextField();
		pastP11.setHorizontalAlignment(SwingConstants.CENTER);
		pastP11.setColumns(10);
		glagolPanel.add(pastP11);
		
		prevod11 = new JTextField();
		prevod11.setText("PLAVATI");
		prevod11.setEditable(false);
		prevod11.setHorizontalAlignment(SwingConstants.CENTER);
		prevod11.setColumns(10);
		glagolPanel.add(prevod11);
		
		glagol12 = new JTextField();
		glagol12.setEditable(false);
		glagol12.setHorizontalAlignment(SwingConstants.CENTER);
		glagol12.setColumns(10);
		glagolPanel.add(glagol12);
		
		pastS12 = new JTextField();
		pastS12.setHorizontalAlignment(SwingConstants.CENTER);
		pastS12.setColumns(10);
		glagolPanel.add(pastS12);
		
		pastP12 = new JTextField();
		pastP12.setHorizontalAlignment(SwingConstants.CENTER);
		pastP12.setColumns(10);
		glagolPanel.add(pastP12);
		
		prevod12 = new JTextField();
		prevod12.setEditable(false);
		prevod12.setHorizontalAlignment(SwingConstants.CENTER);
		prevod12.setColumns(10);
		glagolPanel.add(prevod12);
		
		glagol13 = new JTextField();
		glagol13.setEditable(false);
		glagol13.setHorizontalAlignment(SwingConstants.CENTER);
		glagol13.setColumns(10);
		glagolPanel.add(glagol13);
		
		pastS13 = new JTextField();
		pastS13.setHorizontalAlignment(SwingConstants.CENTER);
		pastS13.setColumns(10);
		glagolPanel.add(pastS13);
		
		pastP13 = new JTextField();
		pastP13.setHorizontalAlignment(SwingConstants.CENTER);
		pastP13.setColumns(10);
		glagolPanel.add(pastP13);
		
		prevod13 = new JTextField();
		prevod13.setEditable(false);
		prevod13.setHorizontalAlignment(SwingConstants.CENTER);
		prevod13.setColumns(10);
		glagolPanel.add(prevod13);
		
		glagol14 = new JTextField();
		glagol14.setEditable(false);
		glagol14.setHorizontalAlignment(SwingConstants.CENTER);
		glagol14.setColumns(10);
		glagolPanel.add(glagol14);
		
		pastS14 = new JTextField();
		pastS14.setHorizontalAlignment(SwingConstants.CENTER);
		pastS14.setColumns(10);
		glagolPanel.add(pastS14);
		
		pastP14 = new JTextField();
		pastP14.setHorizontalAlignment(SwingConstants.CENTER);
		pastP14.setColumns(10);
		glagolPanel.add(pastP14);
		
		prevod14 = new JTextField();
		prevod14.setEditable(false);
		prevod14.setHorizontalAlignment(SwingConstants.CENTER);
		prevod14.setColumns(10);
		glagolPanel.add(prevod14);
		
		glagol15 = new JTextField();
		glagol15.setEditable(false);
		glagol15.setHorizontalAlignment(SwingConstants.CENTER);
		glagol15.setColumns(10);
		glagolPanel.add(glagol15);
		
		pastS15 = new JTextField();
		pastS15.setHorizontalAlignment(SwingConstants.CENTER);
		pastS15.setColumns(10);
		glagolPanel.add(pastS15);
		
		pastP15 = new JTextField();
		pastP15.setHorizontalAlignment(SwingConstants.CENTER);
		pastP15.setColumns(10);
		glagolPanel.add(pastP15);
		
		prevod15 = new JTextField();
		prevod15.setHorizontalAlignment(SwingConstants.CENTER);
		prevod15.setEditable(false);
		prevod15.setColumns(10);
		glagolPanel.add(prevod15);
		
		vrsticaZNapisi = new JPanel();
		vrsticaZNapisi.setBackground(new Color(0, 0, 51));
		vrsticaZNapisi.setBounds(40, 121, 709, 50);
		frame.add(vrsticaZNapisi);
		vrsticaZNapisi.setLayout(new GridLayout(1, 0, 0, 0));
		
		glagolTab = new JLabel("Glagol");
		glagolTab.setForeground(Color.WHITE);
		glagolTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisi.add(glagolTab);
		
		pastSimpleTab = new JLabel("Past simple");
		pastSimpleTab.setForeground(Color.WHITE);
		pastSimpleTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisi.add(pastSimpleTab);
		
		pastPrincipleTab = new JLabel("Past principle");
		pastPrincipleTab.setForeground(Color.WHITE);
		pastPrincipleTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisi.add(pastPrincipleTab);
		
		prevodTab = new JLabel("Prevod");
		prevodTab.setForeground(Color.WHITE);
		prevodTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisi.add(prevodTab);
		
		
		//Adding check IMG so it doesn't get resized by JButton
		
		ImageIcon checkIcon = new ImageIcon("C:\\Users\\anhjje\\Desktop\\output-onlinepngtools.png");
		
		Image checkImg = checkIcon.getImage();
		Image newCheckImg = checkImg.getScaledInstance(15, 17, java.awt.Image.SCALE_SMOOTH);
		checkIcon = new ImageIcon( newCheckImg);
		
		check1 = new JButton(checkIcon);
		check1.setBounds(778, 184, 37, 23);
		check1.setBackground(temnoModra);
		check1.setBorderPainted(false);
		check1.setOpaque(false);
		
		frame.add(check1);
		
		check2 = new JButton("PREVERI");
		check2.setBounds(754, 233, 89, 23);
		frame.add(check2);
		
		check3 = new JButton("PREVERI");
		check3.setBounds(754, 279, 89, 23);
		frame.add(check3);
		
		check4 = new JButton("PREVERI");
		check4.setBounds(754, 320, 89, 23);
		frame.add(check4);
		
		check5 = new JButton("PREVERI");
		check5.setBounds(754, 366, 89, 23);
		frame.add(check5);
		
		check6 = new JButton("PREVERI");
		check6.setBounds(754, 412, 89, 23);
		frame.add(check6);
		
		check7 = new JButton("PREVERI");
		check7.setBounds(754, 455, 89, 23);
		frame.add(check7);
		
		check8 = new JButton("PREVERI");
		check8.setBounds(754, 501, 89, 23);
		frame.add(check8);
		
		check9 = new JButton("PREVERI");
		check9.setBounds(754, 547, 89, 23);
		frame.add(check9);
		
		aaa = new JButton("PREVERI");
		aaa.setBounds(754, 680, 89, 23);
		frame.add(aaa);
		
		check8aaa = new JButton("PREVERI");
		check8aaa.setBounds(754, 634, 89, 23);
		frame.add(check8aaa);
		
		aa = new JButton("PREVERI");
		aa.setBounds(754, 588, 89, 23);
		frame.add(aa);
		
		button_11 = new JButton("PREVERI");
		button_11.setBounds(754, 810, 89, 23);
		frame.add(button_11);
		
		button_12 = new JButton("PREVERI");
		button_12.setBounds(754, 764, 89, 23);
		frame.add(button_12);
		
		button_13 = new JButton("PREVERI");
		button_13.setBounds(754, 718, 89, 23);
		frame.add(button_13);
		
		resetIcon = new JLabel("");
		resetIcon.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				resetPolja();
				
				
				
			}
		});
		resetIcon.setToolTipText("PONASTAVI");
		resetIcon.setIcon(new ImageIcon("C:\\Users\\anhjje\\Desktop\\arrw.png"));
		resetIcon.setBounds(782, 121, 33, 50);
		frame.add(resetIcon);
		
		JPanel userInfo = new JPanel();
		userInfo.setBounds(40, 21, 346, 89);
		userInfo.setBackground(temnoModra);
		frame.add(userInfo);
		userInfo.setLayout(null);
		
		JLabel ucenecLabel = new JLabel("Ucenec :");
		ucenecLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ucenecLabel.setForeground(Color.WHITE);
		ucenecLabel.setBounds(10, 0, 76, 30);
		userInfo.add(ucenecLabel);
		
		JLabel tockeLabel = new JLabel("Tocke :");
		tockeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tockeLabel.setForeground(Color.WHITE);
		tockeLabel.setBounds(20, 41, 67, 14);
		userInfo.add(tockeLabel);
		

		User u = new User();	
		String ime = u.getUporabniskoIme();
		
		
		JLabel userName = new JLabel(ime);
		userName.setForeground(Color.WHITE);
		userName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userName.setBounds(94, -2, 133, 35);
		userInfo.add(userName);
		
		tocke15 = new JLabel(" / 15");
		tocke15.setForeground(Color.WHITE);
		tocke15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tocke15.setBounds(128, 30, 57, 34);
		userInfo.add(tocke15);
		
		JSeparator crtaPodUcencem = new JSeparator();
		crtaPodUcencem.setBounds(-1, 29, 347, 1);
		userInfo.add(crtaPodUcencem);
		
		JProgressBar tockeBar = new JProgressBar();
		tockeBar.setValue(40);
		tockeBar.setBounds(10, 66, 326, 12);
		userInfo.add(tockeBar);
		
		JLabel tocke = new JLabel("3");
		tocke.setForeground(Color.WHITE);
		tocke.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tocke.setBounds(104, 32, 30, 30);
		userInfo.add(tocke);
	}
	
	public void resetPolja() {
		
		pastS1.setText(null);pastP1.setText(null);
		pastS2.setText(null);pastP2.setText(null);
		pastS3.setText(null);pastP3.setText(null);
		pastS4.setText(null);pastP4.setText(null);
		pastS5.setText(null);pastP5.setText(null);
		pastS6.setText(null);pastP6.setText(null);
		pastS7.setText(null);pastP7.setText(null);
		pastS8.setText(null);pastP8.setText(null);
		pastS9.setText(null);pastP9.setText(null);
		pastS10.setText(null);pastP10.setText(null);
		pastS11.setText(null);pastP11.setText(null);
		pastS12.setText(null);pastP12.setText(null);
		pastS13.setText(null);pastP13.setText(null);
		pastS14.setText(null);pastP14.setText(null);
		pastS15.setText(null);pastP15.setText(null);
		
	}
}
