import java.util.Scanner;
public class TemperatureConverter{
	public static double celciusToFerhinite(double temp){
		double ferhinite = (temp * 1.8 ) + 32;
		return ferhinite;
	}
	public static double FerhiniteToCelcius(double temp){
		double celcius = (temp - 32 ) * (5/9);
		return celcius;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature ");
		double temp = sc.nextDouble();
		System.out.println("Choose Conversion : 1 for celciusTo Ferhinite and 2 for Ferhinite To Celcius");
		int choice = sc.nextInt();
		if(choice == 1){
			System.out.println("Temperature in Ferhinite is : " + celciusToFerhinite(temp));
		}
		else if(choice == 2){
			System.out.println("Temperature in Celcius is : " + FerhiniteToCelcius(temp));
		}
		else
			 System.out.println("Invalid Choice");

	}
}