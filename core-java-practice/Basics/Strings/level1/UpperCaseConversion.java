import java.util.Scanner;
public class UpperCaseConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	         // Taking User input
		System.out.println("Enter Strings in lower case");
		String s = sc.next();
		// using built in function
		System.out.println("convert lowercase to uppercase using in - built function");
		String up = s.toUpperCase();
		for(int i =0 ; i< up.length() ; i++){
			System.out.print(up.charAt(i));
		}
		System.out.println();
		System.out.println("convert lowercase to uppercase using charAt() method");
		// using loop and charAt() method
		String str = UperCase(s);
		for(int i =0 ; i< str.length ; i++){
			System.out.print(str.charAt(i));
		}
			       											
	}
	// Method to form a array of characters of string using charAt() method 
	public static String UperCase(String s){
		String str = new String();
		for(int i =0 ; i < s.length() ; i++){
			str.charAt(i) = s.charAt(i);
		}
		return str;
	}
}