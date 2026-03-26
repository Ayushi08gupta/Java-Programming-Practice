import java.time.LocalDate;
import java.util.Scanner;

public class CoffeeCounter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want ?  Expresso , Latte , Cappuccino or type exit to stop");
		double gst_rate = 0.05;
		Srting input = sc.next();
		if(input.quals("exit")) {
			System.out.println("Thankyou !!");
				break;
		}
		while(true){
			switch(input) {
				case "Expresso" : 
					price = 120.0;
					break;
				case "Latte" : 
					price = 120.0;
					break;
				case "Cappuccino" : 
					price = 120.0;
					break;
				default :
				System.out.println("Sorry !!");
				continue;

			}
			System.out.println("Enter Quantity : ");
			int Quantity = sc.nextInt();
			double total = price * Quantity;
			double gst = total * gst_rate;
			double final = total + gst;
			System.out.println("Your Total bill is : "+ final);
				
		}
		
	}	
}