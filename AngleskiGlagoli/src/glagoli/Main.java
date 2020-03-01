package glagoli;

import java.awt.EventQueue;

public class Main  {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					User frame = new User();
//					frame.setVisible(true);
					
					//Debugging
//					Ucenec x = new Ucenec();
//					x.setVisible(true);
					
					DBConnection.poveziBazo();
					DBConnection.narediTabelo("ucenec");
					DBConnection.narediTabeloGlagol("simple");
					DBConnection.narediTabeloGlagol("part");
					DBConnection.narediTabeloGlagol("prevod");
					DBConnection.narediTabeloGlagol("nivo");
					DBConnection.narediTabeloGlagol("razred");
					
					PolnjeneTabele.prikaziTabeloUcenec();
					
					
				} catch (Exception e) {
					System.out.println("Prislo je do napake! " + e.toString());
				}
			}
		});
	}

}

