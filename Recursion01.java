import java.util.Scanner;
public class Recursion01{
	public static void countUp(int n){
		if(n>=10)
		System.out.println("reached "+n+"!");
		else {
			System.out.println(n);
			countUp(n+1);
		}
	}
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.print("enter integer: ");
		int n= in.nextInt();
		countUp(n);
	}
}