import java.util.Scanner;
public class countDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int count = 0;
		while (n > 0){
			count++;
			n /= 10;
		}			
		System.out.println(num + " Number of digits are " + count );


	}
 }