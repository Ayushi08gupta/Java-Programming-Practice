import java.util.Scanner;
public class GreatestFactor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num -1 ; i > 1 ; i--){
			if(num % i == 0){
				System.out.println("Greatest Factor of " + num + " is " + i );
			break;
			}
		}
	}
}
 	