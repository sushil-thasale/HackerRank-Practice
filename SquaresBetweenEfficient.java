import java.util.Scanner;


public class SquaresBetweenEfficient {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();		
		int count=0;
		long start = (long)Math.floor(Math.sqrt(num1));		
		long end = (long)Math.ceil(Math.sqrt(num2));		
		long prevSquare = (long)Math.pow(start-1, 2);
		long currentSquare = 0;
		for(long i=start; i<= end; i++)
		{			
			currentSquare = prevSquare + 2*(i-1) + 1;
			if(currentSquare >= num1 && currentSquare <= num2)
				count++;
			System.out.println(currentSquare);
			if(currentSquare > num2)
				break;
			prevSquare = currentSquare;
		}
		System.out.println(count);
		
	}
}
