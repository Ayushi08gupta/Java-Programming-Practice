import java.util.Scanner; 
public class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.print("Enter the String : ");
		String input = sc.next();
		// call the function to check Palindrome or not
			boolean result = PalindromeChecker(input);
			Print(result);
			
				
	}
	public static boolean PalindromeChecker(String value){
		int i =0 ; int  j = value.length()-1;
			while(i < j){
				if(value.charAt(i) != value.charAt(j)) return false;
			}
			return true;
		}
	public static void Print(boolean result){
		if(result == true) {
			System.out.println("The String is Palindrome");
		}
		else{
						System.out.println("The String is not Palindrome");
		}

	}

	
		
}