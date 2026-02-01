import java.util.Scanner;
public class PowerofnumberbyWhileloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		int result = 1;
		int counter = 0;
			while ( counter != pow ){
				result *= num; 	
				counter++;			
			}
		System.out.println(num + " To the power " + pow + " is " + result );
	}
 }