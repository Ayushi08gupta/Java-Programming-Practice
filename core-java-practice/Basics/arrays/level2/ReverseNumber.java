import java.util.Scanner;
public class ReverseNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int count = 0;
		while(n > 0){
			count ++;
			n /= 10;
		}
		int reverse[] = new int[count+1];
		n = num;
		int i = 0;
		while(n > 0){ 
			reverse[i] = n % 10;
			System.out.print(reverse[i]);
			i++;
			n /= 10;
		}
		
	}
 }