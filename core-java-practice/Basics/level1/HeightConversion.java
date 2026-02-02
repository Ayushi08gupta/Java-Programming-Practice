import java.util.Scanner;
class HeightConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double HeightInCm = sc.nextDouble();
		double HeightInInch = HeightInCm * 2.54;
		double HeightInFeet = HeightInInch * 12;
 		System.out.println(" Your Height in cm is " + HeightInCm +" while in feet is " + HeightInFeet + " and inches is " +HeightInInch  );
}
}