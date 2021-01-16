package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaDataDemo2 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		int count = 0;
		Connection con;
		try {
			String driver = "oracle.jdbc.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			DatabaseMetaData dbmd = con.getMetaData();
			
			String catalog = null;
			String schemaPattern = null;
			String tableNamePattern = null;
			String[] types = null;
			
			ResultSet rs = dbmd.getTables(catalog, schemaPattern, tableNamePattern, types);
			// the parameters can help limit the number of tables that are
			// returned in the ResultSe 
			// the ResultSet contains 10 columns and 3rd column represent table
			// names.
			while (rs.next()) {
				count++;
				System.out.println(rs.getString(3));
			}
			System.out.println("The number of tables:" + count);

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
