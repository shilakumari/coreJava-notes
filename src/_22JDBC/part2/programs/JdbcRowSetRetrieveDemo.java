package _22JDBC.part2.programs;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetRetrieveDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		RowSetFactory rsf;
		try {
			rsf = RowSetProvider.newFactory();
			JdbcRowSet rs = rsf.createJdbcRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
			rs.setUsername("root");
			rs.setPassword("root123");
			rs.setCommand("select * from employees");
			rs.execute();
			System.out.println("Employee Details In Forward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			System.out.println("Employee Details In Backward Direction");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.previous()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			System.out.println("Accessing Randomly...");
			rs.absolute(3);
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			rs.first();
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			rs.last();
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
