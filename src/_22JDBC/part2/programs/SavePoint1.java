package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePoint1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		Connection con;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			Statement st = con.createStatement();
			con.setAutoCommit(false);
			st.executeUpdate("insert into employees(eno, ename) values (17,'Khusi')");
			st.executeUpdate("insert into employees(eno, ename) values (18,'Moni')");
			Savepoint sp = con.setSavepoint();
			st.executeUpdate("insert into employees(eno, ename) values (19,'Soni')");
			System.out.println("oops ..wrong entry just rollback");
			//con.rollback(sp);
			con.rollback();
			//con.releaseSavepoint(sp);
			// System.out.println("Operations are roll back from Savepoint");
			//con.commit();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
