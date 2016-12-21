import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        
        for(int i=1;i<grid.length-1;i++)
        {
        	for(int j=1;j<grid[i].length()-1;j++)
        	{
        		int depth = (int)grid[i].charAt(j);
        		int neighbour1 = (int)grid[i].charAt(j-1);
        		int neighbour2 = (int)grid[i].charAt(j+1);
        		int neighbour3 = (int)grid[i-1].charAt(j);
        		int neighbour4 = (int)grid[i+1].charAt(j);
        		if(depth>neighbour1 && depth>neighbour2 && depth>neighbour3 && depth>neighbour4)
        		{
        			StringBuilder s = new StringBuilder(grid[i]);
        			s.setCharAt(j, 'X');
        			grid[i] = s.toString();
        		}
        	}
        }
        for(int i=0;i<grid.length;i++)
        	System.out.println(grid[i]);
    }
}
