import java.util.Scanner;
public class HarshadNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		while (n > 0){
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}			
		if(num % sum == 0) System.out.println(num + " Is a Harshad Number " );
		else System.out.println(num + " Is not a Harshad Number " );


	}
 }