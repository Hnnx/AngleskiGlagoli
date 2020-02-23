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
import java.awt.FlowLayout;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;

public class Ucenec extends JFrame {

	private JPanel mainPanel;

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
	private JPanel vrsticaZNapisiPanel;	
	private JLabel glagolTab, pastSimpleTab, pastPrincipleTab, prevodTab;

	private JButton resetButton;
	private JButton check1;
	private JButton check2;
	private JButton check3;
	private JButton check4;
	private JButton check5;
	private JButton check6;
	private JButton check10;
	private JButton check11;
	private JButton check12;
	private JButton check9;
	private JButton check8;
	private JButton check7;
	private JButton check13;
	private JButton check14;
	private JButton check15;

	private JLabel tocke15;

	Color temnoModra = new Color(0, 0, 51);
	Color offModra = new Color(0,0,51);
	Color winColor = new Color(46, 204, 113 );



	/*   >>>  METODA ZA KREIRANJE FIELDOV Z GLAGOLI  <<<  keyword: FIELDGEN  */
	private static JTextField makeGlagol(String text) {

		JTextField textField = new JTextField();
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		textField.setText(text);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);		
		textField.setColumns(10);

		return textField;

	}


	private static JTextField makeGlagol() {

		JTextField textField = new JTextField();
		textField.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		textField.setEditable(true);
		textField.setHorizontalAlignment(SwingConstants.CENTER);		
		textField.setColumns(10);

		return textField;

	}

	public Ucenec() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 904);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 51, 102));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);

		/*    >> MAIN PANEL Z GLAGOLI keyword: GLAGOLPANEL  << */
		JPanel glagoliPanel = new JPanel();
		glagoliPanel.setBounds(40, 184, 704, 649);
		mainPanel.add(glagoliPanel);
		glagoliPanel.setLayout(new GridLayout(0, 4, 20, 20));



		/*   >>  GLAGOLI V GRIDU <<  keyword: GLAGOLGRID */

		glagol1 = makeGlagol("HAVE");   pastS1 = makeGlagol();   pastP1 = makeGlagol();   prevod1 = makeGlagol("IMETI");		
		glagoliPanel.add(glagol1); glagoliPanel.add(pastS1); glagoliPanel.add(pastP1); glagoliPanel.add(prevod1);

		glagol2 = makeGlagol("LOSE");   pastS2 = makeGlagol();   pastP2 = makeGlagol();	  prevod2 = makeGlagol("IZGUBITI");
		glagoliPanel.add(glagol2); glagoliPanel.add(pastS2); glagoliPanel.add(pastP2); glagoliPanel.add(prevod2);

		glagol3 = makeGlagol("STAND");   pastS3 = makeGlagol();   pastP3 = makeGlagol();   prevod3 = makeGlagol("STATI");
		glagoliPanel.add(glagol3); glagoliPanel.add(pastS3); glagoliPanel.add(pastP3); glagoliPanel.add(prevod3);

		glagol4 = makeGlagol("EAT");   pastS4 = makeGlagol();   pastP4 = makeGlagol();   prevod4 = makeGlagol("JESTI");
		glagoliPanel.add(glagol4); glagoliPanel.add(pastS4); glagoliPanel.add(pastP4); glagoliPanel.add(prevod4);

		glagol5 = makeGlagol("MEET");   pastS5 = makeGlagol();   pastP5 = makeGlagol();   prevod5 = makeGlagol("SRECATI");
		glagoliPanel.add(glagol5); glagoliPanel.add(pastS5); glagoliPanel.add(pastP5); glagoliPanel.add(prevod5);

		glagol6 = makeGlagol("THINK");   pastS6 = makeGlagol();   pastP6 = makeGlagol();   prevod6 = makeGlagol("MISLITI");
		glagoliPanel.add(glagol6); glagoliPanel.add(pastS6); glagoliPanel.add(pastP6); glagoliPanel.add(prevod6);

		glagol7 = makeGlagol("GET");   pastS7 = makeGlagol();   pastP7 = makeGlagol();   prevod7 = makeGlagol("DOBITI");	
		glagoliPanel.add(glagol7); glagoliPanel.add(pastS7); glagoliPanel.add(pastP7); glagoliPanel.add(prevod7);

		glagol8 = makeGlagol("DRAW");   pastS8= makeGlagol();   pastP8 = makeGlagol();   prevod8 = makeGlagol("RISATI");
		glagoliPanel.add(glagol8); glagoliPanel.add(pastS8); glagoliPanel.add(pastP8); glagoliPanel.add(prevod8);

		glagol9 = makeGlagol("KNOW");   pastS9 = makeGlagol();   pastP9 = makeGlagol();   prevod9 = makeGlagol("VEDETI");
		glagoliPanel.add(glagol9); glagoliPanel.add(pastS9); glagoliPanel.add(pastP9); glagoliPanel.add(prevod9);		

		glagol10 = makeGlagol("SING");   pastS10 = makeGlagol();   pastP10 = makeGlagol();   prevod10 = makeGlagol("PETI");
		glagoliPanel.add(glagol10); glagoliPanel.add(pastS10); glagoliPanel.add(pastP10); glagoliPanel.add(prevod10);

		glagol11 = makeGlagol("SWIM");   pastS11 = makeGlagol();   pastP11 = makeGlagol();   prevod11 = makeGlagol("PLAVATI");
		glagoliPanel.add(glagol11); glagoliPanel.add(pastS11); glagoliPanel.add(pastP11); glagoliPanel.add(prevod11);

		glagol12 = makeGlagol("BURN");   pastS12 = makeGlagol();   pastP12 = makeGlagol();   prevod12 = makeGlagol("GORETI");
		glagoliPanel.add(glagol12); glagoliPanel.add(pastS12); glagoliPanel.add(pastP12); glagoliPanel.add(prevod12);

		glagol13 = makeGlagol("FORGET");   pastS13 = makeGlagol();   pastP13 = makeGlagol();   prevod13 = makeGlagol("POZABITI");
		glagoliPanel.add(glagol13); glagoliPanel.add(pastS13); glagoliPanel.add(pastP13); glagoliPanel.add(prevod13);

		glagol14 = makeGlagol("READ");   pastS14 = makeGlagol();   pastP14 = makeGlagol();   prevod14 = makeGlagol("BRATI");
		glagoliPanel.add(glagol14); glagoliPanel.add(pastS14); glagoliPanel.add(pastP14); glagoliPanel.add(prevod14);

		glagol15 = makeGlagol("SEW");   pastS15 = makeGlagol();   pastP15 = makeGlagol();   prevod15 = makeGlagol("SIVATI");
		glagoliPanel.add(glagol15); glagoliPanel.add(pastS15); glagoliPanel.add(pastP15); glagoliPanel.add(prevod15);



		vrsticaZNapisiPanel = new JPanel();
		vrsticaZNapisiPanel.setBackground(new Color(0, 0, 51));
		vrsticaZNapisiPanel.setBounds(40, 121, 709, 50);
		mainPanel.add(vrsticaZNapisiPanel);
		vrsticaZNapisiPanel.setLayout(new GridLayout(1, 0, 5, 0));

		glagolTab = new JLabel("GLAGOL");
		glagolTab.setFont(new Font("Arial", Font.PLAIN, 18));
		glagolTab.setForeground(Color.WHITE);
		glagolTab.setBackground(offModra);
		glagolTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisiPanel.add(glagolTab);

		pastSimpleTab = new JLabel("SIMPLE");
		pastSimpleTab.setFont(new Font("Arial", Font.PLAIN, 18));
		pastSimpleTab.setForeground(Color.WHITE);
		pastSimpleTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisiPanel.add(pastSimpleTab);

		pastPrincipleTab = new JLabel("PRINCIPLE");
		pastPrincipleTab.setFont(new Font("Arial", Font.PLAIN, 18));
		pastPrincipleTab.setForeground(Color.WHITE);
		pastPrincipleTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisiPanel.add(pastPrincipleTab);

		prevodTab = new JLabel("PREVOD");
		prevodTab.setFont(new Font("Arial", Font.PLAIN, 18));
		prevodTab.setForeground(Color.WHITE);
		prevodTab.setHorizontalAlignment(SwingConstants.CENTER);
		vrsticaZNapisiPanel.add(prevodTab);


		//Adding check IMG so it doesn't get resized by JButton

		ImageIcon checkIcon = new ImageIcon("C:\\Users\\anhjje\\Desktop\\output-onlinepngtools.png");

		Image checkImg = checkIcon.getImage();
		Image newCheckImg = checkImg.getScaledInstance(15, 17, java.awt.Image.SCALE_SMOOTH);
		checkIcon = new ImageIcon( newCheckImg);



		// RESIZE + ADD ICON
		ImageIcon resetIcon = new ImageIcon("C:\\Users\\anhjje\\Desktop\\arrw.png");		
		Image resetImg = resetIcon.getImage();
		Image resizeResetIcon = resetImg.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);		
		resetIcon = new ImageIcon(resizeResetIcon); 

		//Reset Button 
		resetButton = new JButton(resetIcon);
		resetButton.setBounds(766, 132, 35, 35);
		resetButton.setBackground(temnoModra);
		resetButton.setOpaque(false);
		resetButton.setBorderPainted(false);

		resetButton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				resetPolja();
			}
		});

		mainPanel.add(resetButton);


		JButton exit = new JButton("EXIT");
		exit.setBounds(790, 20, 120,90);
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});

		getContentPane().add(exit);



		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBounds(40, 21, 346, 89);
		userInfoPanel.setBackground(temnoModra);
		mainPanel.add(userInfoPanel);
		userInfoPanel.setLayout(null);

		JLabel ucenecLabel = new JLabel("Ucenec :");
		ucenecLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		ucenecLabel.setForeground(Color.WHITE);
		ucenecLabel.setBounds(10, 0, 76, 30);
		userInfoPanel.add(ucenecLabel);

		JLabel tockeLabel = new JLabel("Tocke :");
		tockeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		tockeLabel.setForeground(Color.WHITE);
		tockeLabel.setBounds(20, 41, 67, 14);
		userInfoPanel.add(tockeLabel);


		User u = new User();	
		String ime = u.getUporabniskoIme();


		JLabel userName = new JLabel(ime);
		userName.setForeground(Color.WHITE);
		userName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userName.setBounds(94, -2, 133, 35);
		userInfoPanel.add(userName);

		tocke15 = new JLabel(" / 15");
		tocke15.setForeground(Color.WHITE);
		tocke15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tocke15.setBounds(128, 30, 57, 34);
		userInfoPanel.add(tocke15);

		JSeparator crtaPodUcencem = new JSeparator();
		crtaPodUcencem.setBounds(-1, 29, 347, 1);
		userInfoPanel.add(crtaPodUcencem);

		JProgressBar tockeBar = new JProgressBar();
		tockeBar.setValue(40);
		tockeBar.setBounds(10, 66, 326, 12);
		userInfoPanel.add(tockeBar);

		JLabel tocke = new JLabel(getPoints());
		tocke.setForeground(Color.WHITE);
		tocke.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tocke.setBounds(104, 32, 30, 30);
		userInfoPanel.add(tocke);

		JPanel checkGridPanel = new JPanel();
		checkGridPanel.setBounds(754, 184, 41, 649);
		checkGridPanel.setBackground(Color.black);
		checkGridPanel.setOpaque(false);
		mainPanel.add(checkGridPanel);
		checkGridPanel.setLayout(new GridLayout(0, 1, 20, 20));



		check1 = new JButton(checkIcon);
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String vneseniText = pastS1.getText();

				if(vneseniText.equals("AAA")) {

					//pastS1.setBackground(winColor);
					pastS1.setForeground(winColor);
					pastS1.setEditable(false);

				}
				else {
					pastS1.setForeground(Color.red);
					pastS1.setEditable(false);
				}


			}
		});



		checkGridPanel.add(check1);
		check1.setBackground(temnoModra);
		check1.setBorderPainted(false);
		check1.setOpaque(false);

		check2 = new JButton(checkIcon);
		checkGridPanel.add(check2);
		check2.setBackground(temnoModra);
		check2.setBorderPainted(false);
		check2.setOpaque(false);

		check3 = new JButton(checkIcon);
		checkGridPanel.add(check3);
		check3.setBackground(temnoModra);
		check3.setBorderPainted(false);
		check3.setOpaque(false);

		check4 = new JButton(checkIcon);
		checkGridPanel.add(check4);
		check4.setBackground(temnoModra);
		check4.setBorderPainted(false);
		check4.setOpaque(false);

		check5 = new JButton(checkIcon);
		checkGridPanel.add(check5);
		check5.setBackground(temnoModra);
		check5.setBorderPainted(false);
		check5.setOpaque(false);

		check6 = new JButton(checkIcon);
		checkGridPanel.add(check6);
		check6.setBackground(temnoModra);
		check6.setBorderPainted(false);
		check6.setOpaque(false);

		check7 = new JButton(checkIcon);
		checkGridPanel.add(check7);
		check7.setBackground(temnoModra);
		check7.setBorderPainted(false);
		check7.setOpaque(false);

		check8 = new JButton(checkIcon);
		checkGridPanel.add(check8);
		check8.setBackground(temnoModra);
		check8.setBorderPainted(false);
		check8.setOpaque(false);

		check9 = new JButton(checkIcon);
		checkGridPanel.add(check9);
		check9.setBackground(temnoModra);
		check9.setBorderPainted(false);
		check9.setOpaque(false);

		check10 = new JButton(checkIcon);
		checkGridPanel.add(check10);
		check10.setBackground(temnoModra);
		check10.setBorderPainted(false);
		check10.setOpaque(false);

		check11 = new JButton(checkIcon);
		checkGridPanel.add(check11);
		check11.setBackground(temnoModra);
		check11.setBorderPainted(false);
		check11.setOpaque(false);

		check12 = new JButton(checkIcon);
		checkGridPanel.add(check12);
		check12.setBackground(temnoModra);
		check12.setBorderPainted(false);
		check12.setOpaque(false);

		check14 = new JButton(checkIcon);
		checkGridPanel.add(check14);
		check14.setBackground(temnoModra);
		check14.setBorderPainted(false);
		check14.setOpaque(false);

		check13 = new JButton(checkIcon);
		checkGridPanel.add(check13);
		check13.setBackground(temnoModra);
		check13.setBorderPainted(false);
		check13.setOpaque(false);

		check15 = new JButton(checkIcon);
		checkGridPanel.add(check15);
		check15.setBackground(temnoModra);
		check15.setBorderPainted(false);
		check15.setOpaque(false);
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

	public static String getPoints() {
		return "3";
	}

	public static void anwserChecker(JButton btn) {



	}
}
