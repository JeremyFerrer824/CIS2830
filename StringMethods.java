import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string (end with 0): ");
        String s = sc.next();
        if(s.equals("0")){
            System.exit(0);
        }
        System.out.print("enter an int (end with 0): ");
        int n = sc.nextInt();
        if (n == 0) {
            System.exit(0);
        }
        while (n >= 10) {
            System.out.print("enter a string (end with 0): ");
            s = sc.next();
            if (s.equals("0")) {
                System.exit(0);
            }
            System.out.print("enter an int (end with 0): ");
            n = sc.nextInt();
            if (n == 0) {
                System.exit(0);
            }
        }
        if (n == 1) {
            System.out.println("upper case: " + s.toUpperCase());
        }
        else if (n == 2) {
            System.out.println("upper case: " + s.toLowerCase());

        }
        else if (n == 3) {

            System.out.println("replace all a's by \"foo\": " + s.replace("a", "foo"));
        }
        else if (n == 4) {
            System.out.println(s.replaceAll(".", "$0 "));
        }
        else if (n == 5) {

            System.out.println("first: " + s.charAt(0) + " last: " + s.charAt(s.length()-1));
        }
        else if (n == 6) {
            if (s.indexOf('z') > -1 && s.indexOf('z') < s.length()) {
                System.out.println("it contains 'z'");  
            }
            else {
                System.out.println("it doesn't contains'z'");
            }
        }
        else if (n == 7) {
            System.out.print("reverse: ");
            for (int i = s.length()-1; i > -1; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
        else if (n == 8) {
            System.out.println("substring from 3rd character to end: " + s.substring(3));
        }

        else if (n == 9) {
            System.out.println("substring from 2nd character to 4th (inclusive): " + s.substring(2, 4));
        }
        else if (n == 10) {

            if (s.lastIndexOf('z') < ((s.length())/2)) {

                System.out.println("'z' appears in second half");
            }
            else {
                System.out.println("'z' doesn't appears in second half");

            }

        }

    }

}