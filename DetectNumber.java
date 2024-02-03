import java.util.Scanner;
public class DetectNumber{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("Enter and int number: ");
		int x = in.nextInt();
		boolean even;
		for (int i = 0; i == 5; i++) {
		} if ((x / 2) * 2 == x && x > 0) {
			even = true;
			System.out.println("number is greater than 0 and even");
		} if ((x / 2) * 2 != x && x > 0) {
			even = false;
			System.out.println("number is greater than 0 and odd");
		} else if ((x / 2) * 2 == x && x < 0) {
			even = true;
			System.out.println("number is smaller than 0 and even");
		} else if ((x / 2) * 2 != x && x < 0) {
			even = false;
			System.out.println("number is smaller than 0 and odd");
		} else if (x == 0) {
			System.out.println("number is 0");

		}
	}
}