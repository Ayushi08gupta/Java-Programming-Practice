import java.util.Scanner; 
public class MaximumValue{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.println("Enter three values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// call the function
		int max = Maximum(num1 , num2 , num3);
		System.out.println("Maximum of three numbers is " + max);
		
		
	}
	public static int Maximum(int num1 , int num2 , int num3){
			int max1 = Math.max(num1 , num2);
			int max = Math.max(max1 , num3);
			return max;
		}
	
		
}