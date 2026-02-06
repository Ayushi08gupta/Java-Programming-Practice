import java.util.Scanner;
public class BasicCalculator{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// taking Opertaion choice from the user
		System.out.println("Enter what operation you want to perform");
				String choice = sc.next();

		 switch(choice) {
			case "add" :
				addition(num1 , num2);
				break;
			case "sub" :
				Subtract(num1 , num2);
				break;

			case "mul" :
				multiplication(num1 , num2);
				break;

			case "divide" :
				division(num1 , num2);
				break;

		}
	}
	public static void addition(int num1 , int num2){
			int add = num1 + num2;
			System.out.println("Addition of two number is " + add );
			return;
		}
		public static void Subtract(int num1 , int num2){
			int difference = num1 - num2;
			System.out.println("Subtraction of two number is " + difference);
			return;
		}
		public static void multiplication(int num1 , int num2){
			int product = num1 * num2;
			System.out.println("Product of two number is " + product);
			return;
		}
		public static void division(int num1 , int num2){
			double divide = num1 / num2;
			System.out.println("Division of two number is " + divide);
			return;
		}
	
		
}