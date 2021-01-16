package _22JDBC.part2.programs;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDeleteDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		RowSetFactory rsf;
		try {
			rsf = RowSetProvider.newFactory();
			CachedRowSet rs = rsf.createCachedRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/durgadb?relaxAutoCommit=true");
			rs.setUsername("root");
			rs.setPassword("root123");
			rs.setCommand("select * from employees");
			rs.execute();
			while (rs.next()) {
				float esal = rs.getFloat(3);
				if (esal > 6000) {
					rs.deleteRow();
				}
			}
			rs.moveToCurrentRow();
			rs.acceptChanges();
			rs.close();
			System.out.println("Records deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
