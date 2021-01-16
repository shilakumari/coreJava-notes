package _22JDBC.part2.programs;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class FilteredRowSetRetriveDemo {
	public static void main(String[] args) throws Exception {
		RowSetFactory rsf = RowSetProvider.newFactory();
		FilteredRowSet rs = rsf.createFilteredRowSet();
		rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
		rs.setUsername("root");
		rs.setPassword("root");
		rs.setCommand("select * from employees");
		rs.execute();
		System.out.println("Data Before Filtering");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
		}
		EmployeeSalaryFilter f = new EmployeeSalaryFilter(100, 5000);
		rs.setFilter(f);
		rs.beforeFirst();
		System.out.println("Data After Filtering");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
		}
		rs.close();
	}
}


class EmployeeSalaryFilter implements Predicate {

	float low;
	float high;

	public EmployeeSalaryFilter(float low, float high) {
		this.low = low;
		this.high = high;
	}

	// this method will be called at the time of row insertion
	public boolean evaluate(Object value, String columnName) throws SQLException {
		return false;
	}

	// this method will be called at the time of row insertion
	public boolean evaluate(Object value, int column) throws SQLException {
		return false;
	}

	public boolean evaluate(RowSet rs) {
		boolean eval = false;
		try {
			FilteredRowSet frs = (FilteredRowSet) rs;
			float esal = frs.getFloat(3);
			if ((esal >= low) && (esal <= high)) {
				eval = true;
			} else {
				eval = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eval;
	}
}

