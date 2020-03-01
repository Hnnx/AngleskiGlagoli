package glagoli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

	protected static Connection povezava;

	protected static String imeBaze = "DB//bazic";
	protected static String url = "jdbc:sqlite:"+imeBaze+".db";
	protected static Statement stmt = null;
	protected static ResultSet vrnjeniPodatki = null;


	public static void poveziBazo() {

		try {
			povezava = DriverManager.getConnection(url);
			System.out.println("Povezava z bazo " + imeBaze + " uspesno vzpotavljena");

		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri povezovanju z bazo.\nOpis napake: " + e.toString());
		}
	}

	public static void narediTabelo(String tableName) {
		
		
		
		String tabelaUcenci = "CREATE TABLE IF NOT EXISTS "+tableName+" (\n"
		+ " id integer PRIMARY KEY AUTOINCREMENT,\n"
		+ " ime text NOT NULL,\n"
		+ " priimek TEXT NOT NULL,\n"
		+ " starost INTEGER NOT NULL,\n"
		+ " simple_FK TEXT,\n"
		+ " part_FK TEXT,\n"
		+ " prevod_FK TEXT,\n"
		+ " nivo_FK TEXT,\n"
		+ " razred_FK TEXT\n"
		+");";
		
		try {
			povezava = DriverManager.getConnection(url);
			stmt = povezava.createStatement();
			stmt.execute(tabelaUcenci);
			System.out.println("tabela " + tableName+" uspesno ustvarjena");
			
			
		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri izdelavi tabele.\nOpis napake: "+e.toString());
		}
		
		
	}

	public static void narediTabeloGlagol(String tableName) {
		
		
		
		String tabelaGlagoli = "CREATE TABLE IF NOT EXISTS "+tableName+" (\n"
		+ " id integer PRIMARY KEY AUTOINCREMENT,\n"
		+ " glagol text NOT NULL\n"
		+");";
		
		try {
			povezava = DriverManager.getConnection(url);
			stmt = povezava.createStatement();
			stmt.execute(tabelaGlagoli);
			System.out.println("tabela " + tableName+" uspesno ustvarjena");
			
			
		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri izdelavi tabele.\nOpis napake: "+e.toString());
		}
		
		
	
		
	}
	
}




