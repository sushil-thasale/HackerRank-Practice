import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaStones {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int min = Math.min(a, b);
			int max = Math.max(a, b);

			int low = min * (n - 1);
			int high = max * (n - 1);
			int diff = max - min;

			if (min == max)
				System.out.println(low);
			else {
				while (low <= high) {
					System.out.print(low + " ");
					low += diff;
				}
				System.out.println();
			}
		}
	}
}