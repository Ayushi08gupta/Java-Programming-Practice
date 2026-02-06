import java.util.Scanner;
public class compareTwoStrings{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	         // Taking User input
		System.out.println("Enter Two Strings to compare");
		String s1 = sc.next();
		String s2 = sc.next();
		boolean issame = Same(s1 , s2);
		boolean isEqual = s1.equals(s2);
	       // Check Whether the Strings are same or not by using charAt() Method
		if(issame == isEqual == true ) System.out.println("Both Strings are same by charAt() method and .equals() method" );
		else if(!issame == isEqual == true)System.out.println("Both Strings are not same by charAt() method but same by .equals() method");
		else if(issame == !isEqual == true)System.out.println("Both Strings are same by charAt() method but not same by .equals() method");
		else System.out.println("Both Strings are not same by charAt() method and same by .equals() method");
												
	}
	// Function to check Strings are same or not 
	public static boolean Same(String s1 , String s2){
		for(int i =0 ; i < s1.length() ; i++ ){
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
}