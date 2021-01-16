package _22JDBC.part1.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRowsToHtml {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		String sqlQuery = "select * from employees";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sqlQuery);
			String data = "<html><body><center><table border='1' bgcolor='green'>";
			data = data + "<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
			while (rs.next()) {
				data = data + "<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getDouble(3)
						+ "</td><td>" + rs.getString(4) + "</td></tr>";
			}
			data = data + "</table><center></body></html>";
			FileOutputStream fos = new FileOutputStream("emp.html");
			byte[] b = data.getBytes();
			fos.write(b);
			fos.flush();
			System.out.println("Open emp.html to get Employees data");
			fos.close();
			con.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
