import java.util.Scanner;
public class LargestAndSecondLargest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int max = Integer.MIN_VALUE;
		int secondmax =  Integer.MIN_VALUE;
		int count = 0;
		while(n > 0){
			count ++;
			n /= 10;
		}
		int reverse[] = new int[count];
		n = num;
		int i = 0;
		while(n > 0){ 
			reverse[i] = n % 10;
			i++;
			n /= 10;
		}
		for(int j =0 ; j < count ; j++){
			if(max < reverse[j] && max < reverse[j]){
				secondmax = max;
				max = reverse[j]; 
			}
			else if(max > reverse[j] && max < reverse[j]){
				secondmax = reverse[j];
			}
		}
		System.out.println("Maximum value is " + max);
		System.out.println("Second Maximum value is " + secondmax);

		
	}
 }