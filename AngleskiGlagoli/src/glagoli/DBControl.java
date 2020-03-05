package glagoli;

import java.sql.SQLException;

import glagoli.DBConnection;

public class DBControl extends DBConnection {

	private static String ucenecInsert = null;
	private static String glagolInsert = null;

	protected void insertUcenec(String ime, String priimek, int starost, String simple, String part, String prevod,
			String nivo, String razred) {

		try {

			ucenecInsert = "INSERT INTO ucenec"
					+ "(ime, priimek, starost, simple_FK, part_FK, prevod_FK, nivo_FK, razred_FK) VALUES (?,?,?,?,?,?,?,?)";

			pST = povezava.prepareStatement(ucenecInsert);

			pST.setString(1, ime);
			pST.setString(2, priimek);
			pST.setInt(3, starost);
			pST.setString(4, simple);
			pST.setString(5, part);
			pST.setString(6, prevod);
			pST.setString(7, nivo);
			pST.setString(8, razred);
			pST.executeUpdate();

			System.out.println("Uspesno vneseno v bazo");

		} catch (SQLException e) {
			System.out.println("Prislo je do napake pri povezovanju z bazo.\nOpis napake: " + e.toString());
		}

	}

	protected void insertGlagol(String tableName, String glagol) {

		try {

			glagolInsert = "INSERT INTO " + tableName + " " + "(glagol) VALUES (?)";

			pST = povezava.prepareStatement(glagolInsert);

			pST.setString(1, glagol);
			pST.executeUpdate();

			System.out.println("Glagol uspeno vnesen v bazo");

		} catch (SQLException e) {
			System.out.println("Pri vstavljanju podatkov v  tabelo je prislo do napake.\nOpis Napake: " + e.toString());
		}

	}

	protected void prikaziTabeloUcenec() {
		String sql = "SELECT * FROM ucenec";

		try {
			pST = povezava.prepareStatement(sql);

			vrnjeniPodatki = pST.executeQuery();

			while (vrnjeniPodatki.next()) {
				System.out.print(vrnjeniPodatki.getInt(1));
				System.out.print("\t" + vrnjeniPodatki.getString(2));
				System.out.print("\t" + vrnjeniPodatki.getString(3));
				System.out.print("\t" + vrnjeniPodatki.getInt(4));
				System.out.print("\t" + vrnjeniPodatki.getString(5));
				System.out.print("\t" + vrnjeniPodatki.getString(6));
				System.out.print("\t" + vrnjeniPodatki.getString(7));
				System.out.println("\t" + vrnjeniPodatki.getString(8));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void prikaziTabeloGlagol(String tableName) {

		String sql = "SELECT * FROM " + tableName;

		try {
			pST = povezava.prepareStatement(sql);
			vrnjeniPodatki = pST.executeQuery();

			while (vrnjeniPodatki.next()) {
				System.out.print(" " + vrnjeniPodatki.getString(2));

			}
		} catch (SQLException e) {
			System.out.println("Pri izpisovanju tabele je prislo do napake.\nOpis Napake: " + e.toString());
		}

	}

	protected void removeRecordID(String tableName, int id) {

		String deleteQuery = "DELETE FROM " + tableName + " WHERE id=?";

		try {

			pST = povezava.prepareStatement(deleteQuery);

			pST.setInt(1, id);
			pST.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void removeRecordName(String tableName, String ime) {

		String deleteQuery = "DELETE FROM " + tableName + " WHERE ime=?";

		try {

			pST = povezava.prepareStatement(deleteQuery);

			pST.setString(1, ime);
			pST.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void dropTable(String tableName) {

		String sql = "DROP TABLE " + tableName;

		try {

			pST = povezava.prepareStatement(sql);
			pST.execute();

		} catch (Exception e) {
			System.out.println("Pri brisanju tabele je prislo do napake.\nOpis Napake: " + e.toString());
		}

	}

}
