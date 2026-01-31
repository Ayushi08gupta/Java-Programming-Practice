import java.util.Scanner;
class DistanceConversion{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int distance = sc.nextInt();
	double distanceInMiles = distance / 1.6;
	System.out.println("The total miles is " + distanceInMiles + " mile for the given " + distance + " Km " );
}
}