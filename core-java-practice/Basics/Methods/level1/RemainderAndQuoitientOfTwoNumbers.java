import java.util.Scanner;
public class RemainderAndQuoitientOfTwoNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		RemainderAndQuoitient(num1 , num2);
				
	}
	public static void RemainderAndQuoitient(int num1 ,int num2){
		int rem = num1 % num2;
		int quotient = num1 / num2;
		System.out.println("Remainder of two number is " + rem );
		System.out.println("Quotient of two number is " + quotient );
		return;
	}
}