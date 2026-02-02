import java.util.Scanner;
public class LeapYearOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeapYear = LeapYear(year);
		if(isLeapYear == true) {
			System.out.println(year + " is a leap year");
		}
		else{
			System.out.println(year + " is not a leap year");
		}
						
	}
	public static boolean LeapYear (int year){
		if(year >= 1582){
			if((year % 4 == 0 && year % 10 != 0) || year % 400 == 0 ) return true;
			else return false;
		}
		return false;
	}
}