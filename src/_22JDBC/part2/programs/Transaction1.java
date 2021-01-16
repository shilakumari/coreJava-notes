package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			Statement st = con.createStatement();
			System.out.println("Data before Transaction");
			System.out.println("-------------------------");
			ResultSet rs = st.executeQuery("select * from accounts");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "..." + rs.getInt(2));
			}
			System.out.println("Transaction begins...");
			con.setAutoCommit(false);
			st.executeUpdate("update accounts set balance=balance10000 where name='durga'");
			st.executeUpdate("update accounts set balance=balance+10000 where name='sunny' ");
			System.out.println("Can you please confirm this transaction of 10000....[Yes|No]");
			Scanner sc = new Scanner(System.in);
			String option = sc.next();
			if (option.equalsIgnoreCase("yes")) {
				con.commit();
				System.out.println("Transaction Commited");
			} else {
				con.rollback();
				System.out.println("Transaction Rolled Back");
			}
			System.out.println("Data After Transaction");
			System.out.println("-------------------------");
			ResultSet rs1 = st.executeQuery("select * from accounts");
			while (rs1.next()) {
				System.out.println(rs1.getString(1) + "..." + rs1.getInt(2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
