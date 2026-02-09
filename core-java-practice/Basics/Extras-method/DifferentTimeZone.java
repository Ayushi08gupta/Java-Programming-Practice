import java.util.Scanner;
import java.time.LocalDate; 
public class DateArithmetic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Date date = sc.nextDate();
		LocalDate custom = LocalDate.of(date); 
		System.out.println("Input date is " + custom);
	}	
}