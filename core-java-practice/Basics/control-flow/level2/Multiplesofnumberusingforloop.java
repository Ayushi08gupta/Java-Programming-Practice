import java.util.Scanner;
public class Multiplesofnumberusingforloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0 && num < 100 ){
			for(int i = num ; i >= 1 ; i-- ) {
				if(num % i == 0){
					System.out.println(num + " is divisible by " + i );
				}
			i--;
			}
		}
	}
 }