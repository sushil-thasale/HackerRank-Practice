import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCypher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        k=k%26;
        char ch='a',c='a';
        for(int i=0;i<s.length();i++)
        {
        	c = s.charAt(i);
        	if(c>='a' && c<='z')
        	{        		
        		ch = (char)(c+k);
        		if(ch>'z')
        		{
        			int offset = (int)'z' - (int)c;
        			ch = (char)((int)'a'-1 + (k-offset)); 
        			
        		}
        		c=ch;
        	}
        	else if(c>='A' && c<='Z')
        	{        		
        		ch = (char)(c+k);
        		if(ch>'Z')
        		{
        			int offset = (int)'Z' - (int)c;
        			
        			ch = (char)((int)'A'-1 + (k-offset)); 
        			
        		}
        		c=ch;
        	}
        	System.out.print(c);
        }
    }
}
