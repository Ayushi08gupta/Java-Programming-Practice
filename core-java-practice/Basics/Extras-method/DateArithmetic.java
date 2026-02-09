import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date ");
		String input = sc.nextLine();
		LocalDate date = LocalDate.parse(input);
		LocalDate updated = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);		
		System.out.println("Updated Date after adding 7 Days 1 Month 1 year and subtracting 3 weeks:  " + updated);

	}	
}