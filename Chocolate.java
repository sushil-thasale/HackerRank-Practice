import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int choc = (int)n/c;
            int wrappers = choc;
            int count=0;
            while(wrappers >= m)
            {
            	count+=1;
            	wrappers -= m;
            	wrappers += 1;
            }
            System.out.println(choc+count);
            
        }
    }
}
