import java.util.Scanner;

public class Exe_1_number
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner aviram = new Scanner(System.in);		
		
		int num1,num2,num3,num4; 
		
		System.out.println("choose your first number"); // Enter the first number
		num1 = aviram.nextInt();
		
		System.out.println("choose your second number" ); // Enter the second number
		num2 = aviram.nextInt();
		
		System.out.println("choose your third number"  ); // Enter the third number
		num3 = aviram.nextInt();
		
	    num4 = 	num1+num2+num3; 
	
		if (num4 %2==0) // If the numbers are even
		{
System.out.println("even");
		}
		
		else
			if (num4 %2 != 0) // If the numbers are odd
			{
			System.out.println("odd");
			}
		
		aviram.close();
	}
	
	
	
}
