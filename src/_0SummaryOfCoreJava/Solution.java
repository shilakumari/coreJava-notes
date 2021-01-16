package _0SummaryOfCoreJava;

class Result {

	public static String winner(String erica, String bob) {
		String winner = "Tie";
		int ericaTotalPoints = getTotalPoint(erica);
		int bobTotalPoints = getTotalPoint(bob);
		if (ericaTotalPoints != bobTotalPoints) {
			winner =ericaTotalPoints > bobTotalPoints ? "Erica" : "Bob";
		}
		return winner;
	}

	static int getTotalPoint(String str) {
		int totalPoints = 0;
		for (int i = 0; i < str.length(); i++) {
			totalPoints = totalPoints + getPoint(str.charAt(i));
		}
		
		System.out.println(totalPoints);
		return totalPoints;
	}

	static int getPoint(char ch) {
		int point = 0;
		switch (ch) {
		case 'E':
			point = 1;
			break;
		case 'M':
			point = 3;
			break;
		case 'H':
			point = 5;
			break;
		}
		return point;
	}
}

public class Solution {

	public static void main(String[] args) {
		System.out.println(Result.winner("EMMHHHH", "MMMMMM"));
	}
}