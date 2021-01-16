package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JoinRowSetRetriveDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() { // Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb ", "root", "root123");
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet rs1 = rsf.createCachedRowSet();
			rs1.setCommand("select * from student");
			rs1.execute(con);
			CachedRowSet rs2 = rsf.createCachedRowSet();
			rs2.setCommand("select * from courses");
			rs2.execute(con);
			JoinRowSet rs = rsf.createJoinRowSet();
			rs.addRowSet(rs1, 4);
			rs.addRowSet(rs2, 1);
			System.out.println("SID\tSNAME\tSADDR\tCID\tCNAME\tCCOST");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\n");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
