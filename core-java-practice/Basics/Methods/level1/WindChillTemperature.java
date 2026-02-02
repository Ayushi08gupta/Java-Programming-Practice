import java.util.Scanner;
public class WindChillTemperature{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int windSpeed = sc.nextInt();
		System.out.println("WindChill of the temperature is " + WindChill(temp ,windSpeed ) );
				
	}
	public static double  WindChill(int temp ,int windSpeed){
		double windchill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed*0.16;
		
		return windchill;
	}
}