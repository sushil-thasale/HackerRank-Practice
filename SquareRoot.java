import java.util.Scanner;


public class SquareRoot {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long root = isSquare(n);
		System.out.println(root);
	}
	public static long isSquare(long n)
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
    		return mid;
    	}
    	return -1;
    }
}
