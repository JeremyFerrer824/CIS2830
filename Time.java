import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("enter time in seconds: ");
		int x = in.nextInt ();
		int second = x%60;
		int minute = (x/60)%60;
		int hour = (x/60)/60;
		System.out.printf("%02d:%02d:%02d\n", hour,minute,second);
    }
}