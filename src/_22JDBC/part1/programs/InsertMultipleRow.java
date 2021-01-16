package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleRow {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		String sql_query = "insert into employees values(100,'durga',1000,'hyd')";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Employee Number:");
				int eno = sc.nextInt();
				System.out.println("Employee Name:");
				String ename = sc.next();
				System.out.println("Employee Sal:");
				double esal = sc.nextDouble();

				System.out.println("Employee Address:");
				String eaddr = sc.next();
				String sqlQuery = String.format("insert into employees values(%d,'%s',%f,'%s')", eno, ename, esal,
						eaddr);
				st.executeUpdate(sqlQuery);
				System.out.println("Record Inserted Successfully");
				System.out.println("Do U want to Insert one more record[Yes/No]:");
				String option = sc.next();
				if (option.equalsIgnoreCase("No")) {
					break;
				}
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
