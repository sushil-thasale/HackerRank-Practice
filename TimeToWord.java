import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeToWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();

		String[] tensNames = { "", " ten", " twenty", " thirty", " forty",
				" fifty", " sixty", " seventy", " eighty", " ninety" };

		String[] numNames = { "", " one", " two", " three", " four", " five",
				" six", " seven", " eight", " nine", " ten", " eleven",
				" twelve", " thirteen", " fourteen", " fifteen", " sixteen",
				" seventeen", " eighteen", " nineteen" };

		String time = null;
		switch (m) {

		case 0:
			time = numNames[h] + " o' clock";
			break;
		case 15:
			time = "quarter past" + numNames[h];
			break;
		case 30:
			time = "half past" + numNames[h];
			break;
		case 45:
			time = "quarter to" + numNames[h + 1];
			break;
		default:
			break;
		}
		String min = "" + m;
		if (time == null) {
			if (m < 30)

			{
				if (m < 20) {
					time = numNames[m] + " minutes past" + numNames[h];
				} else {
					time = tensNames[2] + numNames[Integer.parseInt("" + min.charAt(1))]
							+ " minutes past" + numNames[h];
				}

			} else {
				int remaining_time = 60 - m;
				String rt = "" + remaining_time;
				if (remaining_time < 20) {
					time = numNames[remaining_time] + " minutes to" + numNames[h + 1];
				} else {
					time = tensNames[2]
							+ numNames[Integer.parseInt("" + rt.charAt(1))]
							+ " minutes to" + numNames[h+1];
				}

			}
		}
		System.out.println(time.trim());
	}
}