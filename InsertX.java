import java.io.*;
import java.util.Scanner;
public class InsertX{
    public static void main (String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Scanner result = new Scanner(System.in);
        for(int i=0;i<str.length();i++){
            result.append(str.charAt(i));
            result.append('x');
        }
        System.out.println(result);
    }
}