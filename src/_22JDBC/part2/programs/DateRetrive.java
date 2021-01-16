package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateRetrive {

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
			PreparedStatement ps = con.prepareStatement("select * from employees ");
			ResultSet rs = ps.executeQuery();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
			while (rs.next()) {
				int eNo = rs.getInt(1);
				String eName = rs.getString(2);
				double eSalary = rs.getDouble(3);
				String eAddr = rs.getString(4);
				java.sql.Date sdate = rs.getDate(5);
				String s = sdf.format(sdate);
				System.out.println(eNo + "\t" + eName + "\t" + eSalary + "\t" + eAddr + "\t" + s);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
