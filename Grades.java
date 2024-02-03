import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number grade: ");
		if (in.hasNextInt()){
			int number = in.nextInt();
			System.out.println("ERROR: " + number);
			return;
		}
		double g = in.nextDouble();
		if( g <= 9.5 && g >= 8.5){
			System.out.print("letter grade is A\n");
		} else if(g <= 8.0 && g >= 7.5){
			System.out.print("letter grade is B\n");
		} else if( g <= 7.0  && g >= 6.5){
			System.out.print("letter grade is C\n");
		} else if (g <= 6.0 && g >= 5.5){
			System.out.print("letter grade is D\n");   
		} else if (g <= 5.0 && g >= 0.0) {
			System.out.print("letter grade is F\n");
		} else {
			System.out.println("ERROR: " +g);
		}
	}
}