import java.util.Scanner;
public class SumOfnumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = Sumofnum(number);
		System.out.println("Sum of " + number + " natural number is " + sum );
				
	}
	public static int Sumofnum(int number){
		int sum = 0;
		for(int i = 1 ; i <= number ; i++){
			sum += i;
		}
		return sum;
	}
}