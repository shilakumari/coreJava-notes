package _1001Projects.t20PointTables;


public class PointTable {
	public static final String[][] POINT_TABLE= {
			{"1","Australia",""},
			{"2","Newziland",""},
			{"3","India",""},
			{"4","England",""},
			{"5","Bangladesh",""},
			{"6","Srilanka",""},
			{"7","Pakistan",""},
			{"8","West Indiies",""},
			{"9","South Africa",""},
			{"10","Afganistan",""},
	};
	void showPointTable() {
		for(String[] row:POINT_TABLE) {
		System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]);
		}
	}
}
