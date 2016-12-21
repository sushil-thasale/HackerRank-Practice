import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();

		long num = Integer.parseInt(n);
		BigInteger fact = new BigInteger("1");
		BigInteger b;

		for (long i = 1; i <= num; i++) {
			b = new BigInteger("" + i);
			//System.out.println(b.toString());
			fact = fact.multiply(b);
		}
		System.out.println(fact.toString());
	}
}
