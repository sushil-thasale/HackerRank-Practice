import java.util.Scanner;



	public class SquaresBetween {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner sc = new Scanner(System.in);
	    	int t=sc.nextInt();
	    	for(int i=1;i<=t;i++)
	    	{
	    	
	    	int num1 = sc.nextInt();
	    		int num2 = sc.nextInt();
	    		int count= 0;
	    		for(int j=num1;j<=num2;j++)
	    		{
	    			if(isSquare(j))
	    				count++;
	    		}
	    		System.out.println(count);
	    	
	    }}
	    
	    public static boolean isSquare(long n)
	    {	    	    
	    	long lb=1;
	    	long ub=n;
	    	while(lb<=ub)
	    	{
	    		long mid = (long) Math.ceil((lb+ub)/2);
	    	if(mid*mid < n)
	    		lb = mid+1;
	    	else if(mid*mid > n)
	    		ub = mid-1;
	    	else
	    		return true;
	    	}
	    	return false;
	    }
	}