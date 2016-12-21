import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayGift {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			BigInteger B, W, X, Y, Z, cost;
			int b = in.nextInt();
			B = new BigInteger("" + b);
			int w = in.nextInt();
			W = new BigInteger("" + w);
			int x = in.nextInt();
			X = new BigInteger("" + x);
			int y = in.nextInt();
			Y = new BigInteger("" + y);
			int z = in.nextInt();
			Z = new BigInteger("" + z);
			cost = new BigInteger("0");

			BigInteger MIN, MAX;
			int max = Math.max(x, y);
			int min = Math.min(x, y);
			MIN = new BigInteger("" + min);
			MAX = new BigInteger("" + max);

			if (z < max - min) {				
				cost = MIN.multiply(B.add(W));
				if (max == x)
					cost = cost.add(B.multiply(Z));
				else if (max == y)
					cost = cost.add(W.multiply(Z));
			} else {
				cost = B.multiply(X).add(W.multiply(Y));
			}
			System.out.println(cost);
		}
	}
}
