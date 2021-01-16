package _22JDBC.part2.programs;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class CreateDifferentRowSetObject {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		RowSetFactory rsf;
		try {
			rsf = RowSetProvider.newFactory();
			JdbcRowSet jrs = rsf.createJdbcRowSet();
			CachedRowSet crs = rsf.createCachedRowSet();
			WebRowSet wrs = rsf.createWebRowSet();
			JoinRowSet jnrs = rsf.createJoinRowSet();
			FilteredRowSet frs = rsf.createFilteredRowSet();
			System.out.println(jrs.getClass().getName());
			System.out.println(crs.getClass().getName());
			System.out.println(wrs.getClass().getName());
			System.out.println(jnrs.getClass().getName());
			System.out.println(frs.getClass().getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
