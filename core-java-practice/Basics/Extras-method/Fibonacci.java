import java.util.Scanner; 
public class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		// Taking Input values from user 
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		// call the function
		System.out.print("The Fabonacci Sequesnce is :  ");
		for(int i =0 ; i <num ;i++){
			int value = FibonacciSequence(i);
			System.out.print(value + " ");
		}
		
	}
	public static int FibonacciSequence(int num){
		if(num == 0 ) return 1;
		if(num == 1 ) return 1;
		else {
			return FibonacciSequence(num-1) + FibonacciSequence(num-2);
			
		}
		}
	
		
}