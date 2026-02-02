import java.util.Scanner;
public class SumofNaturalNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Sum of " + num + " natural number by recursion is " + sum(num));
		System.out.println("Sum of " + num + " natural number by formula is " + num*(num + 1) /2);
		System.out.println(" Both results are same ");


						
	}
	public static int sum (int num){
		int Sum = num;
		if (num == 0) return 0;
		Sum += sum(num-1);
		return Sum;
	}
}