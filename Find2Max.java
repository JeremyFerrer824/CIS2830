import java.io.*;
import java.util.Scanner; 
public class Find2Max {

    public static void main(String[] args) {
        int nos;
    
        String n1, n2;
        double s1, s2;
        String nt;
        double st;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of at least 2 students: ");
        nos = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a student name: ");
        n1 = sc.nextLine();
        System.out.print("Enter a student score: ");
        s1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a student name: ");
        n2 = sc.nextLine();
        System.out.print("Enter a student score: ");
        s2 = sc.nextDouble();
        sc.nextLine();
        if(s2 > s1) {
            nt = n1;
            st = s1;
            n1=n2;
            s1=s2;
            n2=nt;
            s2=st;
        }
        for(int i=3;i<=nos;i++) {
            System.out.print("Enter a student name: ");
            nt = sc.nextLine();
            System.out.print("Enter a student score: ");
            st= sc.nextDouble();
            sc.nextLine();
            if(st>s1) {
                s2 = s1;
                n2=n1;
                s1=st;
                n1=nt;
            }
            else if(st>s2) {
                s2=st;
                n2=nt;
            }
          
        }
        System.out.println("Top two students: ");
        System.out.println(n1 + "'s score is " + s1);
        System.out.println(n2 + "'s score is " + s2);      
    }
}