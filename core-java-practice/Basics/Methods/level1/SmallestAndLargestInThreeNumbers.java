import java.util.Scanner;
public class SmallestAndLargestInThreeNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		SmallestAndLargest(num1 , num2 , num3);
				
	}
	public static void SmallestAndLargest(int num1 ,int num2 , int num3){
		int min = 0;
		int max = 0;
		if(num1 < num2 && num1 < num3) {
			min = num1;
			if(num2 < num3) max = num3;
			else max = num2;
		}
			
		else if (num1 < num2){
			min = num3;
			max = num2;
		}
		else{
			min = num2;
			if(num1 > num3) max = num1;
			else max = num3;
		}
		System.out.println("Minimum of three numbers is " + min);
		System.out.println("Maximum of three numbers is " + max);
		return;
	}
}