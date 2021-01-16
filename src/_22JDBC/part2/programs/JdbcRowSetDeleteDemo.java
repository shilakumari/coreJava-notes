package _22JDBC.part2.programs;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDeleteDemo {

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
			rs.setPassword("root");
			rs.setCommand("select * from employees");
			rs.execute();
			while (rs.next()) {
				float esal = rs.getFloat(3);
				if (esal > 5000) {
					rs.deleteRow();
				}
			}
			System.out.println("Records Deleted Successfully");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
