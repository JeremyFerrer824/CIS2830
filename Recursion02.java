import java.util.Scanner;
public class Recursion02{
	
	public static void recursiveMethod(int n) {
		System.out.println("recursiveMethod("+n+")");
		if(n<=0) {
			return;
		}
		recursiveMethod(n-1);
	}
	public static void main(String[] args){
		int n;
		Scanner in= new Scanner(System.in);
		System.out.print("enter integer: ");
		n= in.nextInt();
		recursiveMethod(n);
	}
}