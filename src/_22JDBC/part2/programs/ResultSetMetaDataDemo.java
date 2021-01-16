package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {

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
			
			int count = rsmd.getColumnCount();
			
			for (int i = 1; i <= count; i++) {
				System.out.println("Column Number:" + i);
				System.out.println("Column Name:" + rsmd.getColumnName(i));
				System.out.println("Column Type:" + rsmd.getColumnType(i));
				System.out.println("Column Size:" + rsmd.getColumnDisplaySize(i));
				System.out.println(rsmd.getTableName(i));
				System.out.println();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
