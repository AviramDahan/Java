import java.util.Scanner;

public class Exe_2_from100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aviram = new Scanner(System.in);		
		
		 int num1,num2,Sum,DF100;
	       

		 
		 
			System.out.println("Enter First Number "); // Enter the first number
			 num1 = aviram.nextInt();
				System.out.println("Enter Second Number "); // Enter the second number
				 num2 = aviram.nextInt();
				 
				 
				 Sum = num1 + num2; // Define the connection between the first number and the second number
				 DF100 = Sum >=100 ? Sum : 100-Sum; // Calculation of the variable DF100

	System.out.println(DF100);
	
aviram.close();
		{		
		
	
	}
	

}
}