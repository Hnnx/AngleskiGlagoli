package glagoli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

	private static Connection povezava;

	private static String imeBaze = "DB//bazic";
	private static String url = "jdbc:sqlite:"+imeBaze+".db";
	private static ResultSet rs = null;
	private static Statement stmt = null;


	public static void poveziBazo() {

		try {

			povezava = DriverManager.getConnection(url);
			System.out.println("Povezava z bazo " + imeBaze + " uspesno vzpotavljena");

		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri povezovanju z bazo.\nOpis napake: " + e.toString());
		}
	}
	
	
	public static void narediTable(String tableName) {
		
		
		
		String tabelaUcenci = "CREATE TABLE IF NOT EXISTS "+tableName+" (\n"
		+ " id integer PRIMARY KEY AUTOINCREMENT,\n"
		+ " ime text NOT NULL,\n"
		+ " priimek text NOT NULL,\n"
		+ " starost integer,\n"
		+ " telefon text\n"
		+");";
		
		try {
			povezava = DriverManager.getConnection(url);
			stmt = povezava.createStatement();
			stmt.execute(tabelaUcenci);
			
			
		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri izdelavi tabele.\nOpis napake: "+e.toString());
		}
		
		
	}

	
}
