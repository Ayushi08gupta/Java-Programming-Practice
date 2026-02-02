import java.util.Scanner;
public class DistributeChoclates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		DistributeChoclates(num1 , num2);
				
	}
	public static void DistributeChoclates(int num1 ,int num2){
		int rem = num1 % num2;
		int quotient = num1 / num2;
		System.out.println("Remaining choclates are " + rem );
		System.out.println("Choclates divided in each student is " + quotient );
		return;
	}
}