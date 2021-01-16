package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdates1 {

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
			// st.addBatch("select * from employees");
			st.addBatch("insert into employees values(600,'Mallika',6000,'Chennai')");
			st.addBatch("update employees set esal=esal+1000 where esal<4000");
			st.addBatch("delete from employees where esal>=8000000000000");
			int[] count = st.executeBatch();
			int updateCount = 0;
			for (int x : count) {
				updateCount = updateCount + x;
			}
			System.out.println("The number of rows updated :" + updateCount);
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
