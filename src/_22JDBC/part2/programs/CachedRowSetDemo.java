package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb ", "root", "root123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet crs = rsf.createCachedRowSet();
			crs.populate(rs);
			con.close();
			// Now we cannot access RS but we can access CRS
			// if(rs.next()){}RE:SQLException:Operation not allowed after
			// ResultSet
			// closed
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("-----------------------------");
			while (crs.next()) {
				System.out.println(
						crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3) + "\t" + crs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
