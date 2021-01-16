package _22JDBC.part2.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BLOB2 {

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
			PreparedStatement ps = con.prepareStatement("select eno,pic from employees where eno=203");
			ResultSet rs = ps.executeQuery();
			
			FileOutputStream os = new FileOutputStream("src/_22JDBC/part2/programs/logic2.png");
			if (rs.next()) {
				String name = rs.getString(1);
				InputStream is = rs.getBinaryStream(2);
				byte[] buffer = new byte[2048];
				while (is.read(buffer) > 0) {
					os.write(buffer);
				}
				os.flush();
				System.out.println("image is available in :logic2.png");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
