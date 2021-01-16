package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRangeOfRecords2 {

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
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Begin Salary Range:");
			double beginSal = sc.nextDouble();
			System.out.println("Enter End Salary Range:");
			double endSal = sc.nextDouble();
			String sqlQuery = String.format("select * from employees where esal>%f and esal<%f", beginSal, endSal);
			boolean flag = false;
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("ENO\tENAME\tESALARY\tEADDR");

			while (rs.next()) {
				flag = true;
				// System.out.println(rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getDoubl
				// e("esal")+"\t"+rs.getString("eaddr"));
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
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
