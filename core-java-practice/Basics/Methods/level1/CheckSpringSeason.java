import java.util.Scanner;
public class CheckSpringSeason{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		String month = sc.next();
		if(date <=1 || date > 31){
			System.out.println("Invalid Input" );
			return ;
		}  
		boolean isSpring = SpringSeason(date , month);
		if(isSpring == true) {
			System.out.println("Yes it is Spring ");
		}
		else{
			System.out.println("NO it is not Spring ");
		}
		
	}
	public static boolean SpringSeason(int date , String month){
		if(date >= 20 && month.equals("March") || month.equals("April") ||  month.equals("May") || date <= 20 && month.equals("June")) 
			return true;
		return false;
	}
}