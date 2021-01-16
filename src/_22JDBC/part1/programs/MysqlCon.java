package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//Tpye-4 driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/freeReport", "root", "root123");
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Type-1 driver
			Connection con=DriverManager.getConnection("jdbc:odbc:MyMySqlDSN","root","root123" );*/
			System.out.println(con.getClass().getSimpleName());	
			System.out.println(con.getClass().getCanonicalName());
			System.out.println(con.getClass().getName()); 
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from feereport_accountant");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}