import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int num = n;
        int count =0;
        while(num!=0)
        {
        	int d=num%10;
        	if(d!=0)
        	if(n%d == 0)
        		count++;
        	num=num/10;
        }
        System.out.println(count);
    }
}
