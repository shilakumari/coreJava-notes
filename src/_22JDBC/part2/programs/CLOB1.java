package _22JDBC.part2.programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CLOB1 {

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
			String sqlQuery = "insert into employees(eno,ename,Resume) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, 205);
			ps.setString(2, "Aswrya");
			
			File f = new File("src/_22JDBC/part2/programs/ClobFile.txt");
			FileReader fr = new FileReader(f);
			ps.setCharacterStream(3,fr,(int)f.length());
			
			System.out.println("file is inserting from :" + f.getAbsolutePath());
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
