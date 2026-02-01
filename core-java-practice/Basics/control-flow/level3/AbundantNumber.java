import java.util.Scanner;
public class AbundantNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		for(int i = 1 ; i < n ; i++ ){
			if(n % i == 0) sum += i;
		}			
		if(sum > num) System.out.println(num + " Is an Abundant  Number " );
		else System.out.println(num + " Is not an Abundant Number " );


	}
 }