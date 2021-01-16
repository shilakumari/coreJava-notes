package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsert {

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
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Eno:");
			int eNo = sc.nextInt();
			System.out.println("Enter employee Name:");
			String eName = sc.next();
			System.out.println("Enter employee salary:");
			double eSalary = sc.nextDouble();
			System.out.println("Enter employee address:");
			String eAddr = sc.next();
			System.out.println("Enter DOP(dd-mm-yyyy):");
			String dop = sc.next();

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(dop);
			long l = udate.getTime();
			java.sql.Date sdate = new java.sql.Date(l);
			String sqlQuery = "insert into employees values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, eNo);
			ps.setString(2, eName);
			ps.setDouble(3, eSalary);
			ps.setString(4, eAddr);
			ps.setDate(5, sdate);
			int rc = ps.executeUpdate();
			if (rc == 0)
				System.out.println("Record Not inserted");
			else
				System.out.println("Record  inserted");

			con.close();
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			e.printStackTrace();
		}
	}

}
