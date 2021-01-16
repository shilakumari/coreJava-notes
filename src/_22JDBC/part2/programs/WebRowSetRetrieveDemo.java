package _22JDBC.part2.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetRetrieveDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		RowSetFactory rsf;
		try {
			rsf = RowSetProvider.newFactory();
			WebRowSet rs = rsf.createWebRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
			rs.setUsername("root");
			rs.setPassword("root123");
			rs.setCommand("select * from employees");
			rs.execute();
			
			FileWriter fw = new FileWriter("emp.xml");
			rs.writeXml(fw);
			System.out.println("Employee Data transfered to emp.xml file");
			
			fw.close();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
