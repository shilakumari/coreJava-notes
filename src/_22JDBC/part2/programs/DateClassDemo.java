package _22JDBC.part2.programs;

public class DateClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		java.util.Date udate = new java.util.Date();
		System.out.println("util Date:" + udate);
		long l = udate.getTime();
		java.sql.Date sdate = new java.sql.Date(l);
		System.out.println("sql Date:" + sdate);
	}

}
