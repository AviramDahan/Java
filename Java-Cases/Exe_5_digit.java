import java.util.Scanner;

public class Exe_5_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aviram = new Scanner(System.in);

		char input;
		char nexTinput;
		int counter = 0;

		System.out.println("choose you digit");
		input = aviram.nextLine().charAt(0);
		while (counter < 2) {

			nexTinput = aviram.nextLine().charAt(0);

			if (nexTinput - input == 1) {

				counter++;
				input = nexTinput;
			} else
				counter = 0;

		}
		System.out.println("program done");

	}

}
