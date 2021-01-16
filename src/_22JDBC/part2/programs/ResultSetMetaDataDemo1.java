package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataDemo1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			String driver = "oracle.jdbc.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			String col1 = rsmd.getColumnName(1);
			String col2 = rsmd.getColumnName(2);
			String col3 = rsmd.getColumnName(3);
			String col4 = rsmd.getColumnName(4);
			System.out.println(col1 + "\t" + col2 + "\t" + col3 + "\t" + col4);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
