package _22JDBC.part1.programs;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCCodingStandards2 {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getOracleConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ".." + rs.getString(2) + "..." + rs.getDouble(3) + ".." + rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanup(con, st, rs);
		}
	}

}
