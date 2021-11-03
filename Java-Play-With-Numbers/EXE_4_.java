import java.util.Scanner;

public class EXE_4_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aviram = new Scanner(System.in);		
		
		int quadNum;
		System.out.println("Enter four digit number"); // Enter 4 numbers
		 quadNum = aviram.nextInt();
		 
		 int units = quadNum % 10; // Display units
		 int tens =  quadNum % 100 /10 ; // Display tens
		 int hundreds =  quadNum %1000/100; // Display hundreds
		 int thousands = quadNum %10000/1000; // Display thousands
		 
		 if (thousands > hundreds && hundreds >tens && tens > units && thousands > units && hundreds > units && thousands > tens) {
			 
		 System.out.println("the result is :"  + units);
		 
		 }
		 else {
			 System.out.println("the result is :" + hundreds);
		 
			 aviram.close();
			 
		 }
		 
		 }
		
		
		
	}


