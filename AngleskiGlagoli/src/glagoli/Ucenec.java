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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ucenec extends JFrame {

	private JPanel mainPanel;

	//>> Glagoli
	JTextField glagol1, pastS1, pastP1,prevod1,	
	glagol2, pastS2, pastP2, prevod2,
	glagol3, pastS3, pastP3, prevod3,
	glagol4, pastS4 ,pastP4, prevod4,
	glagol5, pastS5, pastP5, prevod5,
	glagol6, pastS6 ,pastP6 ,prevod6,
	glagol7, pastS7, pastP7 ,prevod7,	
	glagol8, pastS8, pastP8, prevod8,
	glagol9 ,pastS9, pastP9, prevod9,
	glagol10, pastS10, pastP10, prevod10,
	glagol11, pastS11, pastP11, prevod11,
	glagol12, pastS12, pastP12, prevod12,
	glagol13, pastS13, pastP13, prevod13,
	glagol14, pastS14, pastP14, prevod14,
	glagol15, pastS15, pastP15, prevod15;

	//>> Tab nad glagoli 
	private JPanel vrsticaZNapisiPanel;	
	private JLabel glagolTab, pastSimpleTab, pastPrincipleTab, prevodTab;


	//>> Buttoni za preverjanje
	private JButton resetButton;
	private JButton check1, check2, check3, check4, check5, check6, check10, check11, check12 ,check9 ,check8 ,check7 ,check13 ,check14 ,check15;
	JButton checkAllBtn;

	//>>Paleta
	private static Color temnoModra = new Color(0, 0, 51);
	private static Color winColor = new Color(46, 204, 113);
	private static Color loseColor = new Color(255, 51, 51);

	//>> Ikone
	private static ImageIcon checkIcon;
	private static ImageIcon resetIcon;
	private static ImageIcon exitIcon;

	//>> Tocke
	private JLabel tocke30;
	private static int tocke;
	private static JLabel playerTockeLabel;
	private static JProgressBar progressBarTocke;

	//Dimenzije



	public Ucenec() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 789, 789);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 51, 102));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(null);
		setContentPane(mainPanel);


		/*   >> MAIN PANEL Z GLAGOLI keyword: GLAGOLPANEL  << */
		JPanel glagoliPanel = new JPanel();
		glagoliPanel.setBounds(40, 150, 665, 594);
		mainPanel.add(glagoliPanel);
		glagoliPanel.setLayout(new GridLayout(0, 4, 50, 10));

		/*   >>  GLAGOLI V GRIDU <<  keyword: GLAGOLGRID << */
		glagol1 = makeGlagol("HAVE"); pastS1 = makeGlagol(); pastP1 = makeGlagol(); prevod1 = makeGlagol("IMETI");		
		glagoliPanel.add(glagol1); glagoliPanel.add(pastS1); glagoliPanel.add(pastP1); glagoliPanel.add(prevod1);

		glagol2 = makeGlagol("LOSE"); pastS2 = makeGlagol(); pastP2 = makeGlagol(); prevod2 = makeGlagol("IZGUBITI");
		glagoliPanel.add(glagol2); glagoliPanel.add(pastS2); glagoliPanel.add(pastP2); glagoliPanel.add(prevod2);

		glagol3 = makeGlagol("STAND"); pastS3 = makeGlagol(); pastP3 = makeGlagol(); prevod3 = makeGlagol("STATI");
		glagoliPanel.add(glagol3); glagoliPanel.add(pastS3); glagoliPanel.add(pastP3); glagoliPanel.add(prevod3);

		glagol4 = makeGlagol("EAT"); pastS4 = makeGlagol(); pastP4 = makeGlagol(); prevod4 = makeGlagol("JESTI");
		glagoliPanel.add(glagol4); glagoliPanel.add(pastS4); glagoliPanel.add(pastP4); glagoliPanel.add(prevod4);

		glagol5 = makeGlagol("MEET"); pastS5 = makeGlagol(); pastP5 = makeGlagol(); prevod5 = makeGlagol("SRECATI");
		glagoliPanel.add(glagol5); glagoliPanel.add(pastS5); glagoliPanel.add(pastP5); glagoliPanel.add(prevod5);

		glagol6 = makeGlagol("THINK"); pastS6 = makeGlagol(); pastP6 = makeGlagol(); prevod6 = makeGlagol("MISLITI");
		glagoliPanel.add(glagol6); glagoliPanel.add(pastS6); glagoliPanel.add(pastP6); glagoliPanel.add(prevod6);

		glagol7 = makeGlagol("GET"); pastS7 = makeGlagol(); pastP7 = makeGlagol(); prevod7 = makeGlagol("DOBITI");	
		glagoliPanel.add(glagol7); glagoliPanel.add(pastS7); glagoliPanel.add(pastP7); glagoliPanel.add(prevod7);

		glagol8 = makeGlagol("DRAW"); pastS8= makeGlagol(); pastP8 = makeGlagol(); prevod8 = makeGlagol("RISATI");
		glagoliPanel.add(glagol8); glagoliPanel.add(pastS8); glagoliPanel.add(pastP8); glagoliPanel.add(prevod8);

		glagol9 = makeGlagol("KNOW"); pastS9 = makeGlagol(); pastP9 = makeGlagol(); prevod9 = makeGlagol("VEDETI");
		glagoliPanel.add(glagol9); glagoliPanel.add(pastS9); glagoliPanel.add(pastP9); glagoliPanel.add(prevod9);		

		glagol10 = makeGlagol("SING"); pastS10 = makeGlagol(); pastP10 = makeGlagol(); prevod10 = makeGlagol("PETI");
		glagoliPanel.add(glagol10); glagoliPanel.add(pastS10); glagoliPanel.add(pastP10); glagoliPanel.add(prevod10);

		glagol11 = makeGlagol("SWIM"); pastS11 = makeGlagol(); pastP11 = makeGlagol(); prevod11 = makeGlagol("PLAVATI");
		glagoliPanel.add(glagol11); glagoliPanel.add(pastS11); glagoliPanel.add(pastP11); glagoliPanel.add(prevod11);

		glagol12 = makeGlagol("TAKE"); pastS12 = makeGlagol(); pastP12 = makeGlagol(); prevod12 = makeGlagol("VZETI");
		glagoliPanel.add(glagol12); glagoliPanel.add(pastS12); glagoliPanel.add(pastP12); glagoliPanel.add(prevod12);

		glagol13 = makeGlagol("FORGET"); pastS13 = makeGlagol(); pastP13 = makeGlagol(); prevod13 = makeGlagol("POZABITI");
		glagoliPanel.add(glagol13); glagoliPanel.add(pastS13); glagoliPanel.add(pastP13); glagoliPanel.add(prevod13);

		glagol14 = makeGlagol("READ"); pastS14 = makeGlagol(); pastP14 = makeGlagol(); prevod14 = makeGlagol("BRATI");
		glagoliPanel.add(glagol14); glagoliPanel.add(pastS14); glagoliPanel.add(pastP14); glagoliPanel.add(prevod14);

		glagol15 = makeGlagol("SEW"); pastS15 = makeGlagol(); pastP15 = makeGlagol(); prevod15 = makeGlagol("SIVATI");
		glagoliPanel.add(glagol15); glagoliPanel.add(pastS15); glagoliPanel.add(pastP15); glagoliPanel.add(prevod15);



		/*	>> HARD + SOFT RESET	<< keyword: hardReset */
		resetIcon = new ImageIcon(getClass().getClassLoader().getResource("arrw.png"));
		Image resetImg = resetIcon.getImage();
		Image resizeResetIcon = resetImg.getScaledInstance(27, 27, java.awt.Image.SCALE_SMOOTH);		
		resetIcon = new ImageIcon(resizeResetIcon); 

		//EXIT BUTTON (debug)
		exitIcon = new ImageIcon(getClass().getClassLoader().getResource("novExit.png"));	
		Image exitImg = exitIcon.getImage();
		Image resizeExitIcon = exitImg.getScaledInstance(30, 37, java.awt.Image.SCALE_SMOOTH);
		exitIcon = new ImageIcon(resizeExitIcon);

		//CHECK ICON
		checkIcon = new ImageIcon(getClass().getClassLoader().getResource("check.png"));				
		Image checkImg = checkIcon.getImage();
		Image newCheckImg = checkImg.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		checkIcon = new ImageIcon( newCheckImg);



		/*	>> USER INFO PANEL << keyword: USERPANEL */
		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBounds(42, 10, 663, 69);
		userInfoPanel.setBackground(temnoModra);
		mainPanel.add(userInfoPanel);
		userInfoPanel.setLayout(null);

		JLabel ucenecLabel = new JLabel("Ucenec :");
		ucenecLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		ucenecLabel.setForeground(Color.WHITE);
		ucenecLabel.setBounds(10, 0, 67, 30);
		userInfoPanel.add(ucenecLabel);

		JLabel tockeLabel = new JLabel("Tocke :");
		tockeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		tockeLabel.setForeground(Color.WHITE);
		tockeLabel.setBounds(10, 41, 57, 14);
		userInfoPanel.add(tockeLabel);

		User u = new User(); 
		String ime = u.getUporabniskoIme();

		JLabel userName = new JLabel(ime);
		userName.setForeground(Color.WHITE);
		userName.setFont(new Font("Arial", Font.PLAIN, 15));
		userName.setBounds(73, -2, 133, 35);
		userInfoPanel.add(userName);

		tocke30 = new JLabel(" / 30");
		tocke30.setForeground(Color.WHITE);
		tocke30.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tocke30.setBounds(87, 29, 57, 34);
		userInfoPanel.add(tocke30);

		progressBarTocke = new JProgressBar();
		progressBarTocke.setMaximum(300);
		progressBarTocke.setMinimum(0);
		progressBarTocke.setForeground(winColor);
		progressBarTocke.setValue(getTockeBar());
		progressBarTocke.setBounds(154, 36, 455, 20);
		userInfoPanel.add(progressBarTocke);

		playerTockeLabel = new JLabel(getTocke());
		playerTockeLabel.setForeground(Color.WHITE);
		playerTockeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		playerTockeLabel.setBounds(73, 31, 30, 30);
		userInfoPanel.add(playerTockeLabel);

		resetButton = new JButton(resetIcon);
		resetButton.setBounds(619, 29, 35, 35);
		userInfoPanel.add(resetButton);
		resetButton.setToolTipText("Ponastavi");
		resetButton.setBackground(temnoModra);
		resetButton.setOpaque(false);
		resetButton.setBorderPainted(false);

		resetButton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				tocke = 0;
				playerTockeLabel.setText(getTocke());
				progressBarTocke.setValue(0);

				JTextField[] glagolCol = {
						glagol1, pastS1, pastP1,prevod1,	
						glagol2, pastS2, pastP2, prevod2,
						glagol3, pastS3, pastP3, prevod3,
						glagol4, pastS4 ,pastP4, prevod4,
						glagol5, pastS5, pastP5, prevod5,
						glagol6, pastS6 ,pastP6 ,prevod6,
						glagol7, pastS7, pastP7 ,prevod7,	
						glagol8, pastS8, pastP8, prevod8,
						glagol9 ,pastS9, pastP9, prevod9,
						glagol10, pastS10, pastP10, prevod10,
						glagol11, pastS11, pastP11, prevod11,
						glagol12, pastS12, pastP12, prevod12,
						glagol13, pastS13, pastP13, prevod13,
						glagol14, pastS14, pastP14, prevod14,
						glagol15, pastS15, pastP15, prevod15,

				};

				JTextField[] pastSimpleCol = {pastS1,pastS2,pastS3,pastS4,pastS5,pastS6,pastS7,pastS8,pastS9,pastS10,pastS11,pastS12,pastS13,pastS14,pastS15};
				JTextField[] pastPrincipleCol = {pastP1,pastP2,pastP3,pastP4,pastP5,pastP6,pastP7,pastP8,pastP9,pastP10,pastP11,pastP12,pastP13,pastP14,pastP15};


				resetPolja(pastSimpleCol);
				resetPolja(pastPrincipleCol);
				//resetPolja(glagolCol);
			}
		});


		/*	>> CHECK GRID PANEL	<<	keyword: CHECKPANEL */
		JPanel checkGridPanel = new JPanel();
		checkGridPanel.setBounds(715, 150, 41, 594);
		checkGridPanel.setBackground(Color.black);
		checkGridPanel.setOpaque(false);
		mainPanel.add(checkGridPanel);
		checkGridPanel.setLayout(new GridLayout(0, 1, 20, 20));

		check1 = makeButton("had", pastS1, "had", pastP1); checkGridPanel.add(check1);
		check2 = makeButton("lost",pastS2, "lost", pastP2); checkGridPanel.add(check2);
		check3 = makeButton("stood", pastS3, "stood", pastP3); checkGridPanel.add(check3);
		check4 = makeButton("ate",pastS4, "eaten", pastP4); checkGridPanel.add(check4);
		check5 = makeButton("met",pastS5, "met", pastP5); checkGridPanel.add(check5);
		check6 = makeButton("thought",pastS6, "thought", pastP6); checkGridPanel.add(check6);
		check7 = makeButton("got",pastS7, "got", pastP7); checkGridPanel.add(check7);
		check8 = makeButton("drew",pastS8, "drawn", pastP8); checkGridPanel.add(check8);
		check9 = makeButton("know",pastS9, "knew", pastP9); checkGridPanel.add(check9);
		check10 = makeButton("sang",pastS10, "sung", pastP10); checkGridPanel.add(check10); 		
		check11 = makeButton("swam",pastS11, "swum", pastP11); checkGridPanel.add(check11);
		check12 = makeButton("took",pastS12, "taken", pastP12); checkGridPanel.add(check12);
		check13 = makeButton("forgot",pastS13, "forgotten", pastP13); checkGridPanel.add(check13);
		check14 = makeButton("read",pastS14, "read", pastP14); checkGridPanel.add(check14);
		check15 = makeButton("sewed",pastS15, "sewn", pastP15); checkGridPanel.add(check15);


		/*	>> VRSTICA Z NAPISI NAD GLAGOLI	<< */		
		vrsticaZNapisiPanel = new JPanel();
		vrsticaZNapisiPanel.setBounds(40, 90, 665, 50);
		vrsticaZNapisiPanel.setBackground(temnoModra);
		mainPanel.add(vrsticaZNapisiPanel);
		vrsticaZNapisiPanel.setLayout(new GridLayout(1, 0, 5, 0));

		glagolTab = new JLabel("GLAGOL");
		glagolTab.setFont(new Font("Arial", Font.PLAIN, 18));
		glagolTab.setForeground(Color.WHITE);
		glagolTab.setBackground(temnoModra);
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

		//	>>	 GUMB ZA PRVERJANJE VSEH STOLPCEV	<< /*

		checkAllBtn = new JButton(checkIcon);
		checkAllBtn.setBounds(715, 100, 35, 35);
		mainPanel.add(checkAllBtn);
		checkAllBtn.setToolTipText("Preveri vse resitve");
		checkAllBtn.setBackground(Color.WHITE);
		checkAllBtn.setOpaque(false);
		checkAllBtn.setBorder(null);




		JButton exit = new JButton(exitIcon);
		exit.setBounds(715, 42, 30, 37);
		mainPanel.add(exit);
		exit.setBackground(loseColor);
		exit.setOpaque(false);
		exit.setBorder(null);
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});

		checkAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField[] pastSimpleCol = {pastS1,pastS2,pastS3,pastS4,pastS5,pastS6,pastS7,pastS8,pastS9,pastS10,pastS11,pastS12,pastS13,pastS14,pastS15};
				String[] odgovoriSimple= {"had","lost","stood","ate","met","thought","got","drew", "knew","sang","swam","took","forgot","read","sewed"};				
				JTextField[] pastPrincipleCol = {pastP1,pastP2,pastP3,pastP4,pastP5,pastP6,pastP7,pastP8,pastP9,pastP10,pastP11,pastP12,pastP13,pastP14,pastP15};
				String[] odgovoriPrinciple= {"had","lost","stood","eaten","met","thought","gotten","drawn", "knew","sung","swum","taken","forgotten","read","sewn"};


				preveriVsaPolja(pastSimpleCol, odgovoriSimple,pastPrincipleCol, odgovoriPrinciple);


			}

			private void preveriVsaPolja(JTextField[] glagolInput, String[] simple, JTextField[] caseCheck, String[] principle) {
				tocke = 0;

				for (int i = 0; i < glagolInput.length; i++) {
					//>>BLANK:

					if(glagolInput[i].getText().isBlank()) {
						glagolInput[i].setBackground(Color.LIGHT_GRAY);
						glagolInput[i].setEditable(false);
					}
					if(caseCheck[i].getText().isBlank()) {
						caseCheck[i].setBackground(Color.LIGHT_GRAY);
						caseCheck[i].setEditable(false);
					}


					//>> PRVI STOLPEC:					
					if(glagolInput[i].getText().equals(simple[i])) {
						tocke++;
						playerTockeLabel.setText(getTocke());
						glagolInput[i].setForeground(winColor);
						glagolInput[i].setEditable(false);
					}
					else {
						glagolInput[i].setForeground(loseColor);
						glagolInput[i].setEditable(false);
					}

					//>> DRUGI STOPLEC:
					if(caseCheck[i].getText().equals(principle[i])) {
						tocke++;
						playerTockeLabel.setText(getTocke());
						progressBarTocke.setValue(getTockeBar());
						caseCheck[i].setForeground(winColor);
						caseCheck[i].setEditable(false);
					}
					else {
						caseCheck[i].setEditable(false);
						caseCheck[i].setForeground(loseColor);
					}


				}


			}
		});
	}

	private JButton makeButton(String caseCheckS,JTextField fieldS, String caseCheckP, JTextField fieldP) {

		//ICON
		checkIcon = new ImageIcon(getClass().getClassLoader().getResource("check.png"));				
		Image checkImg = checkIcon.getImage();
		Image newCheckImg = checkImg.getScaledInstance(15, 17, java.awt.Image.SCALE_SMOOTH);
		checkIcon = new ImageIcon( newCheckImg);
		//>>

		JButton btn = new JButton();
		btn = new JButton(checkIcon);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vneseniTextS = fieldS.getText();
				String vneseniTextP = fieldP.getText();


				if(fieldS.getText().isEmpty() || fieldS.getText().isBlank()) {
					fieldS.setEditable(true);
				}

				else if(vneseniTextS.equalsIgnoreCase(caseCheckS) && vneseniTextP.equalsIgnoreCase(caseCheckP) ) {


					if( fieldP.isEditable() |  fieldS.isEditable()) {
						tocke +=2;
						playerTockeLabel.setText(getTocke());
						progressBarTocke.setValue(getTockeBar());
					}				
					playerTockeLabel.setText(getTocke());
					fieldS.setForeground(winColor);
					fieldS.setEditable(false);
					fieldP.setForeground(winColor);
					fieldP.setEditable(false);

				}

				else if(vneseniTextS.equalsIgnoreCase(caseCheckS) && !vneseniTextP.equalsIgnoreCase(caseCheckP)) {

					if( fieldP.isEditable() |  fieldS.isEditable()) {
						tocke +=1;
						playerTockeLabel.setText(getTocke());
						progressBarTocke.setValue(getTockeBar());
					}



					fieldS.setForeground(winColor);
					fieldS.setEditable(false);
					fieldP.setForeground(loseColor);
					fieldP.setEditable(false);

				}

				else if( ! vneseniTextS.equalsIgnoreCase(caseCheckS) && vneseniTextP.equalsIgnoreCase(caseCheckP)) {

					if( fieldP.isEditable() |  fieldS.isEditable()) {
						tocke +=1;
						playerTockeLabel.setText(getTocke());
						progressBarTocke.setValue(getTockeBar());
					}

					fieldS.setForeground(loseColor);
					fieldS.setEditable(false);
					fieldP.setForeground(winColor);
					fieldP.setEditable(false);


				}


				else if( !vneseniTextS.equalsIgnoreCase(caseCheckS) && ! vneseniTextP.equalsIgnoreCase(caseCheckP)) {

					fieldP.setForeground(loseColor);
					fieldS.setEditable(false);
					fieldP.setForeground(loseColor);
					fieldP.setEditable(false);

				}
				else {
					if(fieldS.getText().isEmpty() || fieldS.getText().isBlank()) {
						fieldS.setEditable(true);
					}
				}
			}
		});

		btn.setBackground(temnoModra);
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		return btn;
	}


	private JButton makeButton(String caseCheckS,JTextField fieldS) {

		//ICON
		checkIcon = new ImageIcon(getClass().getClassLoader().getResource("check.png"));
		checkIcon = new ImageIcon("check.png");
		Image checkImg = checkIcon.getImage();
		Image newCheckImg = checkImg.getScaledInstance(15, 17, java.awt.Image.SCALE_SMOOTH);
		checkIcon = new ImageIcon( newCheckImg);
		//>>

		JButton btn = new JButton();
		btn = new JButton(checkIcon);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vneseniTextS = fieldS.getText();
				if(vneseniTextS.equalsIgnoreCase(caseCheckS) ) {
					tocke++;
					playerTockeLabel.setText(getTocke());
					fieldS.setForeground(winColor);
					fieldS.setEditable(false);

				}
				else {
					fieldS.setForeground(loseColor);
					fieldS.setEditable(false);
				}
			}
		});

		btn.setBackground(temnoModra);
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		return btn;
	}


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

	public void resetPolja(JTextField[] field) {


		for (JTextField element : field) {

			element.setEditable(true);
			element.setText(null);			
			element.setBackground(Color.white);
			element.setForeground(Color.black);
		}

	}

	public static String getTocke() {
		String strPoints = String.valueOf(tocke);
		return strPoints;
	}

	public static int getTockeBar() {
		int pointsPercentage = tocke * 10;
		return pointsPercentage;
	}

}
