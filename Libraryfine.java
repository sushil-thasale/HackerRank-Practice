import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Libraryfine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		
		String date1=d1+"/"+m1+"/"+y1;
		String date2=d2+"/"+m2+"/"+y2;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
		Date dd1=dateFormat.parse(date1);
		Date dd2=dateFormat.parse(date2);
		
				
		int fine = 0;
		if (dd1.compareTo(dd2) <= 0) {
			fine = 0;
		} else if (y1 > y2) {
			fine = 10000;
		} else if (m1 > m2) {
			fine = 500 * (m1 - m2);
		} else if (d1 > d2) {
			fine = 15 * (d1 - d2);
		}
		System.out.println(fine);
		}catch(ParseException e ){System.out.println("parse exception");}
	}
}
