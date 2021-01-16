package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleToMySQL {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		int count = 0;
		String driver = "oracle.jdbc.OracleDriver";
		Connection con1;
		try {
			Class.forName(driver);
			con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "myoracle");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
			Statement st1 = con1.createStatement();
			Statement st2 = con2.createStatement();
			ResultSet rs = st1.executeQuery("select * from employees");
			while (rs.next()) {
				count++;
				int eno = rs.getInt(1);
				String ename = rs.getString(2);
				double esal = rs.getDouble(3);
				String eaddr = rs.getString(4);
				String sqlQuery = String.format("insert into employees values(%d,'%s',%f,'%s')", eno, ename, esal,
						eaddr);
				st2.executeUpdate(sqlQuery);
			}
			System.out.println("Total Data copied from Oracle to MySQL and number of records:" + count);
			con1.close();
			con2.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
