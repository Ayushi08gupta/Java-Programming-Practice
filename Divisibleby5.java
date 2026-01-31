import java.util.Scanner;
class Divisibleby5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("Is Number " + num + " divisible by 5 ? " + " Yes" );
		}
		else{
 			System.out.println("Is Number " + num + " divisible by 5 ? " + " No" );
		}
	}
}