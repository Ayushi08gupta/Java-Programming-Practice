import java.util.Scanner;
public class Multiplesofnumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0 && num < 100 ){
			int i = num;
			while(i >= 1 ) {
				if(num % i == 0){
					System.out.println(num + " is divisible by " + i );
				}
			i--;
			}
		}
	}
 }