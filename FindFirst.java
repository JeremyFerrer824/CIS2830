import java.util.Scanner;

public class FindFirst {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x;
        char y;
        while (true) {
            System.out.print("enter a string (end with 0): ");
            x= in.nextLine();
            if(x.equals("0")) break;
            y = x.charAt(0);
            for(int i = 0; i < x.length(); ++i) {
                if(x.charAt(i) < y) {
                    y= x.charAt(i);
                }
            }
            System.out.println("first: " + y);
        }
    }

}