package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectParticularColumns {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			String sqlQuery = "select ename,eaddr from employees";
			boolean flag = false;
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("ENAME\tEADDR");

			while (rs.next()) {
				flag = true;
				System.out.println(rs.getString("ename") + "\t" + rs.getString("eaddr"));
				 //System.out.println(rs.getString(1)+"\t"+rs.getString(2)); 
			}
			if (flag == false) {
				System.out.println("No Records found");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
