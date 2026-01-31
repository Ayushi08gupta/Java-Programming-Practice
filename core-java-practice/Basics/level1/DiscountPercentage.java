import java.util.Scanner;
class DiscountPercentage {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discount = sc.nextInt();
		double amount = fee * discount / 100;
 		System.out.println(" The discount amount is INR " + fee +" and final discounted fee is INR " + amount );
}
}