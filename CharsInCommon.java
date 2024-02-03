import java.util.Scanner;

public class CharsInCommon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first word: ");
        String s1 = in.nextLine();
        System.out.print("enter second word: ");
        String s2 = in.nextLine();
        String c = "";
        for(int i = 0; i < s1.length(); ++i) {
            if(s2.contains(s1.substring(i, i+1)) && !c.contains(s1.substring(i, i+1))) {
                c += s1.substring(i, i+1);
            }
        }
        System.out.println("count: " + c.length());
    }

}