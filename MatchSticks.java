import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();            
        }
        int count=n;
        while(count!=0)
            {
        	System.out.println(count);
            count=0;
            int min=100000;
            for(int i=0;i<n;i++)
            {
            	if(arr[i]>0 && arr[i]<=min)
                  min=arr[i];
            }
            
            
            for(int i=0;i<n;i++)
                {
            	if( arr[i]>0)
            	{
                arr[i] -= min; 
                if(arr[i]>0)
                    count++;
            	}
            }                   
        }
    }
}
