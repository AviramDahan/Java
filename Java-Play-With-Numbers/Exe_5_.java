import java.util.Scanner;

public class Exe_5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aviram = new Scanner(System.in);		

		 int orderNum; 
		 System.out.println("enter your order number:");
		 orderNum = aviram.nextInt();
		
		 
		 int nightNum;
		 int roomNum;
		 int floorNum;
		 
		 int priceFloor1To5 = 100;// Price of floors 1-5
		 int priceFloor6To9 = 150;// Price of floors 6-9
		
		
		 
		 nightNum = orderNum %10000/1000; // Calculate the number of nights
		 roomNum = orderNum %1000/10;// Calculation of the room number
		 floorNum = orderNum %10;// Calculation of the floor

		 
		 System.out.println("your room number is:"+ roomNum);
		 
		 
		 if (floorNum >=1 && floorNum <=5 )
			 System.out.println("The Price is :"+nightNum*priceFloor1To5);
		 else
			 System.out.println("the Price is :"+ nightNum* priceFloor6To9);
		 
		 
		 
		 
		 aviram.close();
	

		

	}

}
