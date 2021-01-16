package _22JDBC.part2.programs;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetDeleteDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		RowSetFactory rsf;
		try {
			rsf = RowSetProvider.newFactory();
			WebRowSet rs = rsf.createWebRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/durgadb?relaxAutoCommit=true");
			rs.setUsername("root");
			rs.setPassword("root123");
			rs.setCommand("select * from employees");
			rs.execute();
			FileReader fr = new FileReader("emp.xml");
			rs.readXml(fr);
			rs.acceptChanges();
			System.out.println("emp data deleted successfully");
			fr.close();
			rs.close();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
