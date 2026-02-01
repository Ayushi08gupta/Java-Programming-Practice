import java.util.Scanner;
public class GreatestFactorUsingWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = num -1;
		while(i >= 1 ) {
			if(num % i == 0){
				System.out.println("Greatest Factor of " + num + " is " + i );
				break;
			}
			i--;
		}
	}
}
 	