import java.util.Scanner;
public class MirrorNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int count = 0;
		while(n > 0){
			count ++;
			n /= 10;
		}
		int original[] = new int[count+1];
		int reverse[] = new int[count+1];
		n = num;
		int i = 0;
		while(n > 0){ 
			reverse[i] = n % 10;
			i++;
			n /= 10;
		}
		for(int j = 0 ; j < count ; j++){
			original[j] = reverse[i-1];
			i--;
			System.out.print(original[j]);
 		}
		for(int k = 0 ; k < count ; k++){
			System.out.print(reverse[k]);
		}
	}
 }