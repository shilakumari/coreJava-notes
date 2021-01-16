package _22JDBC.part2.programs;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class ConnectionPoolDemoMySql {
	public static void main(String[] args) throws Exception {
		m1();
	}

	private static void m1() {
		MysqlConnectionPoolDataSource ds;
		try {
			ds = new MysqlConnectionPoolDataSource();
			ds.setURL("jdbc:mysql://localhost:3306/durgadb");
			ds.setUser("root");
			ds.setPassword("root123");
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			System.out.println("ENO\tENAME\t\ttESAL");
			while (rs.next()) {
				if (rs.getString(2).length() < 8) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getFloat(3));
				} else {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
				}
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
