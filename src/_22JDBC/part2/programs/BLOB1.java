package _22JDBC.part2.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BLOB1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			String sqlQuery = "insert into employees values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, 204);
			ps.setString(2, "Katrina");
			ps.setDouble(3, 785678.0);
			ps.setString(4, "Delhi");
			ps.setDate(5, java.sql.Date.valueOf("1996-02-03"));

			File f = new File("src/_22JDBC/part2/programs/logic.png");
			InputStream fis = new FileInputStream(f);
			// ps.setBinaryStream(6, fis);//RTE in oracle10g
			// ps.setBinaryStream(6,fis,fis.available());
			ps.setBinaryStream(6, fis, (int) (f.length()));

			System.out.println("inserting image from :" + f.getAbsolutePath());
			int updateCount = ps.executeUpdate();
			if (updateCount == 1) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Record Not Inserted");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
