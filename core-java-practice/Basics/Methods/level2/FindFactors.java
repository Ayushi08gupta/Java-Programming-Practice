import java.util.Scanner;
public class FindFactors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factors[] = Factors(num);
		System.out.print("Factors of a number are ");
		for(int i = 0 ; i < factors.length ; i++ ) {
			System.out.print(factors[i] + " ");
		}
		System.out.println();
		System.out.println("Sum of a Factors is " + sum(factors) );
		System.out.println("Product of a factors is " + Product(factors) );
		System.out.println("sumofsquare of a factors is " + SumOFSquare(factors));

				
	}
	public static int[] Factors(int num){
		int count = 0;
		for(int i = 1; i < num ; i++ ) {
			if(num % i == 0) count++;
		}
		int factors[] = new int[count];
		int j = 0;
		for(int i = 1; i < num ; i++){
			if(num % i == 0) {
				factors[j] = i;
				j++;
			}
		}
		return factors;
	}
	public static int sum(int[] factors){
		int sum =0;
		for(int i =0 ; i < factors.length ; i++ ){
			sum += factors[i];
		}
		return sum;
	}
	public static int Product(int[] factors){
		int product =1;
		for(int i =0 ; i < factors.length ; i++){
			product *= factors[i];
		}
		return product;
	}
	public static int SumOFSquare( int[] Factors){
		int sumofsquare = 0;
		for(int i =0 ; i < Factors.length ; i++){
			sumofsquare += Math.pow(Factors[i] ,2 );
		}
		return sumofsquare;
	}
}