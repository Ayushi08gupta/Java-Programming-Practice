import java.util.Scanner; 
public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.print("Enter the Value : ");
		int input = sc.nextInt();
		// call the function to find palindrome			
		int fact = FactorialFinder(input);
		System.out.println("Factorial of a numbrer is : " +fact);
	}
	public static int FactorialFinder(int value){
		if (value == 1) return 1;
		return FactorialFinder(value-1)*value;
	}

	
		
}