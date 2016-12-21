import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Utopiantree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int n = in.nextInt();
        int size = 1;
        for (int i=1; i<= n; i+=2 )
        {
        	size *=2;
        	size+=1;
        }
        if(n%2 != 0)
        	size-=1;
        
        System.out.println(size);
        }
    }

