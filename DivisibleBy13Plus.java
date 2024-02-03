import java.util.Scanner;
public class DivisibleBy13Plus{
	public static void main(String[] args){
		int x;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter any integer: ");
		x = in.nextInt();
		if (x % 13 == 0 || x % 17 == 0 || x % 19 == 0) {
			System.out.println(x + " is divisible by 13, 17 or 19");
		} else {
			System.out.println(x + " is NOT divisible by any of 13, 17 or 19");
		}
	} 
}