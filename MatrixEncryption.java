import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixEncryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int len = s.length();
		int row = (int) Math.floor(Math.sqrt(len));
		int col = (int) Math.ceil(Math.sqrt(len));
		String output="";
		for (int i = 0; i < col; i++) {
			
			for (int j = i; j < len; j+=col) {
				if(!(""+s.charAt(j)).equals(""))
					System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
