package glagoli;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RSTable extends JFrame {
	
	//Panels
	private JPanel okvirPanel;
	
	public RSTable() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 640, 480);
		okvirPanel = new JPanel();
		okvirPanel.setLayout(null);
		okvirPanel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(okvirPanel);
		
		
	}
	
	
	
	

}
