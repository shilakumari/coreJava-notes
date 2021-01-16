package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchUpdates2 {

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
			PreparedStatement pst = con.prepareStatement("insert  into employees values(?,?,?,? )");
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
				pst.setInt(1, eno);
				pst.setString(2, ename);
				pst.setDouble(3, esal);
				pst.setString(4, eaddr);
				pst.addBatch();
				System.out.println("Do U want to Insert one more record[Yes/No]:");
				String option = sc.next();
				if (option.equalsIgnoreCase("No")) {
					break;
				}
			}
			pst.executeBatch();
			System.out.println("Records inserted Successfully");

			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}