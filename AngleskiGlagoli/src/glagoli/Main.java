package glagoli;

import java.awt.EventQueue;

public class Main  {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
					
					//Debugging
//					Ucenec x = new Ucenec();
//					x.setVisible(true);
					
					DBConnection povezava = new DBConnection();
					povezava.poveziUstvari();
					
					DBControl uredi = new DBControl();
					uredi.insertGlagol("simple", "having");
					
					uredi.prikaziTabeloGlagol("simple");
					
					
					
//					RSTable tabela = new RSTable();
//					tabela.setVisible(true);
					
					
					
				} catch (Exception e) {
					System.out.println("Prislo je do napake! " + e.toString());
				}
			}
		});
	}

}

