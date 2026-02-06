import java.util.Scanner; 
public class GcdAndLcmCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.print("Enter the Values : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// call the function to find palindrome			
		int gcd = GCD(num1 , num2);
		System.out.println("GCD of two number is : " + gcd);
		int lcm  = LCM(num1 , num2);
		System.out.println("LCM of two number is : " + lcm);
	}
	public static int GCD(int num1 ,int num2){
		int gcd = 1;
		int min = Math.min(num1 , num2);
		for(int i = 2; i <= min ; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	public static int LCM(int num1 ,int num2){
		int lcm = Math.abs(num1 * num2) / GCD(num1 , num2);
		return lcm;
	}


	
		
}