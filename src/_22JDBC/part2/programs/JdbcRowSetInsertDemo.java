package _22JDBC.part2.programs;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetInsertDemo {

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
			Scanner s = new Scanner(System.in);
			rs.moveToInsertRow();
			while (true) {
				System.out.print("Employee Number    :");
				int eno = s.nextInt();
				System.out.print("Employee Name      :");
				String ename = s.next();
				System.out.print("Employee Salary    :");
				float esal = s.nextFloat();
				System.out.print("Employee Address   :");
				String eaddr = s.next();
				rs.updateInt(1, eno);
				rs.updateString(2, ename);
				rs.updateFloat(3, esal);
				rs.updateString(4, eaddr);
				rs.insertRow();
				System.out.println("Employee Inserted Successfully");
				System.out.print("Do You Want to insert One more Employee[yes/no]?  :");
				String option = s.next();
				if (option.equalsIgnoreCase("No")) {
					break;
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
