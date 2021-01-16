package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParameterMetaDataDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			String driver = "oracle.jdbc.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?) ");
			ParameterMetaData pmd = pst.getParameterMetaData();
			int count = pmd.getParameterCount();
			for (int i = 1; i <= count; i++) {
				System.out.println("Parameter Number:" + i);
				//System.out.println("Parameter Mode:" + pmd.getParameterMode(i));
				//System.out.println("Parameter Type:" + pmd.getParameterType(i));
				//System.out.println("Parameter Precision:" + pmd.getPrecision(i));
				//System.out.println("Parameter Scale:" + pmd.getScale(i));
				//System.out.println("Parameter isSigned:" + pmd.isSigned(i));
				System.out.println("Parameter isNullable:" + pmd.isNullable(i));
				System.out.println("---------------");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
