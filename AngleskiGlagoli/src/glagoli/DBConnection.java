package glagoli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static Connection povezava;
	private static boolean imaPodatke;



	public ResultSet prikaziUcence() {

		if(povezava == null) {
			povezi();
		}

		Statement izjavaPrikaziUcence = null;
		ResultSet res = null;
		try {
			izjavaPrikaziUcence = povezava.createStatement();
			res = izjavaPrikaziUcence.executeQuery("SELECT ime, priimek FROM ucenci");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;


	}

	private void povezi() {

		try {

			try {
				Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			povezava = DriverManager.getConnection("jdbc:sqlite:AngleskiGlagoli.db");

		} catch (SQLException e ) {
			System.out.println("aa");
		}



	}

}
