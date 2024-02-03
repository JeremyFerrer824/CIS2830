import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t = 0, x;
        int c = 0;
        while (true) {
            System.out.print("enter a number: ");
            x= in.nextDouble();
            if (x == 0)
                break;
            t += x;
            ++c;
        }
        System.out.println("total: " + t);
        System.out.println("number of entries: " + c);
        if (c == 0)
            System.out.println("average: 0");
        else
            System.out.println("average: " + (t / c));
    }
}