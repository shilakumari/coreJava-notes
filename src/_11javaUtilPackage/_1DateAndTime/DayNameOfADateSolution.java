package _11javaUtilPackage._1DateAndTime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayNameOfADateSolution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

class Result {

	public static String findDay(int month, int day, int year) {
		String dayName = "";
		Calendar calendar = Calendar.getInstance();
		//calendar.clear();
		calendar.set(year, month - 1, day);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case 1:
			dayName = "SUNDAY";
			break;
		case 2:
			dayName = "MONDAY";
			break;
		case 3:
			dayName = "TUESDAY";
			break;
		case 4:
			dayName = "WEDNESDAY";
			break;
		case 5:
			dayName = "THURSDAY";
			break;
		case 6:
			dayName = "FRIDAY";
			break;
		case 7:
			dayName = "SATURDAY";
			break;
		}
		return dayName;
	}

}
