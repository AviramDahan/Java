import java.util.Scanner;

public class Exe_3_upside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Enter First Number "); // Input to first number
		num1 = s.nextInt();
		System.out.println("Enter Second Number "); // Input to second number
		num2 = s.nextInt();
		System.out.println("Enter Third Number "); // Input to third number
		num3 = s.nextInt();
		// if num1 the biggest
		if (num1 > num2 && num1 > num3) {
			System.out.print(" "+ num1+ " ");
			if (num2 > num3) {
				System.out.print(" " +num2+ " ");
				System.out.print(" " +num3+ " ");
			} else {
				System.out.print(" " +num3+ " ");
				System.out.print(" " +num2+ " ");
			}
		}
		// if num2 the biggest
		else if (num2 > num3) {
			System.out.print(" " +num2+ " ");
			if (num1 > num3) {
				System.out.print(" "+ num1+ " ");
				System.out.print(" "+ num3+" ");
			} else {
				System.out.print(" " +num3+ " ");
				System.out.print(" " +num1 +" ");
			}
		}
		// if num13 the biggest
		else {
			System.out.print( " "+ num3 +" ");
			if (num1 > num2) {
				System.out.print(" "+ num1 +" ");
				System.out.print(" " +num2 +" ");

			} else {
				System.out.print(" " +num2+ " ");
				System.out.print(" " +num1+ " ");

			}
		}



		s.close();

	}
}

