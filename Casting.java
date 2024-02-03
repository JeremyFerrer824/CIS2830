import java.util.Scanner;
public class Casting{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in); 
		System.out.print("Enter first double number: ");
		double x = in.nextDouble ();
		int i = (int) x; 
		double d = (10 * x - 10 * i)/10;
		System.out.print("Enter second double integer: ");
		double y = in.nextDouble ();
		int a = (int) y;
		double b = (10 * y - 10 * a)/10; 
		int z = i + a;
		System.out.printf("adding integer parts: %d\n", z);
		System.out.printf("adding fractional parts: %.3f\n ", b + d);
	}	
}