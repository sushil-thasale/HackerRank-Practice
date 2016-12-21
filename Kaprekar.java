import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kaprekar {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		String output = "";
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {

			String num = "" + i;
			String numSquare = "" + (long) Math.pow(i, 2);
			// System.out.println(numSquare);
			String numLeft, numRight;

			if (numSquare.length() > 1) {
				numLeft = numSquare.substring(0,
						(int) Math.floor(numSquare.length() / 2));

				numRight = numSquare.substring((int) (Math.floor(numSquare
						.length() / 2)));
			} else {
				numLeft = numSquare;
				numRight = "";
			}

			// System.out.println(numRight);

			// System.out.println(numLeft);
			int l = Integer.parseInt(numLeft);
			int r;
			if (numRight.equals(""))
				r = 0;
			else
				r = Integer.parseInt(numRight);

			if (l + r == i)
				output = output + i + " ";
		}
		if (output.equals(""))
			System.out.println("INVALID RANGE");
		else
			System.out.println(output);
	}
}
