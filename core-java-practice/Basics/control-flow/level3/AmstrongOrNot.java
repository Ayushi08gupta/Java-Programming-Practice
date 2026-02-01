import java.util.Scanner;
public class AmstrongOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		while (n > 0){
			int rem = n % 10;
			sum += Math.pow(rem,3);
			n /= 10;
		}
		if(sum == num){
			System.out.println(num + " is an Amstrong Number " );
		}
		else{
			System.out.println(num + " is not an Amstrong Number " );
		}

	}
 }