import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneMatrixInAnother {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			String Pfirst = P[0];

			Boolean present = false;
			outer_loop: for (int gi = 0; gi < G.length; gi++) {

				for (int start_index = 0; start_index <= G[gi].length() - c; start_index++) {
					
					if (G[gi].indexOf(Pfirst, start_index) != -1 && (gi + r - 1 < G.length)) {
						int index = G[gi].indexOf(Pfirst, start_index);

						String G2[] = new String[r];
						for (int i = 0; i < r; i++)
							if (index + c > G[gi + i].length() - 1) {
								G2[i] = G[gi + i].substring(index);
							} else {
								G2[i] = G[gi + i].substring(index, index + c);
							}

						present = true;
						for (int i = 0; i < r; i++) {
							if (!G2[i].equalsIgnoreCase(P[i])) {
								present = false;
							}
						}

						if (present) {
							System.out.println("YES");
							break outer_loop;
						}
					}
				}
			}
				if (!present)
					System.out.println("NO");
			}
		}
	}
