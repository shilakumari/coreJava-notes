package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class ConnectionPoolDemoOracle {
	public static void main(String[] args) throws Exception {
		m1();
	}

	private static void m1() {
		OracleConnectionPoolDataSource ds;
		try {
			ds = new OracleConnectionPoolDataSource();
			ds.setURL("jdbc:oracle:thin:@localhost:1521:XE");
			ds.setUser("system");
			ds.setPassword("myoracle");
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getDate(5)
						+ "\t" + rs.getBinaryStream(6) + "\t" + rs.getCharacterStream(7));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
