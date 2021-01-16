package _1001Projects.t20PointTables.try2;


public class PointTable {

	public static void showPointTable(String[][] teams) {
		for (String[] row : teams) {
			System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
		}
	}

	public static void showTop4GotMaxPointTable() {
		int points = 0;
		for (int i = 1; i <= Constants.TOTAL_TEAM; i++) {
			points = 0;
			for (int j = 1; j <= Constants.TOTAL_TEAM - 1; j++) {
				if (j <= Constants.TOTAL_TEAM - i) {
					points = points + 2;
				}
			}
			Constants.POINT_TABLE[i - 1][2] = "" + points;
		}
		showPointTable(Constants.POINT_TABLE);
	}

	public static void showTop4GotMinAndEqualPointTable() {
		int points = 0;
		for (int i = 1; i <= Constants.TOTAL_TEAM; i++) {
			points = 0;
			for (int j = 1; j <= Constants.TOTAL_TEAM - 1; j++) {
				if (j <= Constants.TOTAL_TEAM - i) {
					points = points + 2;
				}
			}
			Constants.POINT_TABLE[i - 1][2] = "" + points;
		}
		showPointTable(Constants.POINT_TABLE);
	}
}
