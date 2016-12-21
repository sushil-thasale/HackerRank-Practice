import java.util.Scanner;


public class Sherlock2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int y = n;
		while(y%3 != 0)
		{y -= 5;}
		
		if(y<0)
		{System.out.println(-1);}
		else
		{
			int fives = y;
			int threes = n-y;
			for (int i=1; i<=fives; i++)
				System.out.print(5);
			for (int i=1; i<=threes; i++)
				System.out.print(3);
		}
		System.out.println();
		
	}

}
