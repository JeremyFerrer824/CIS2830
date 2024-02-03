import java.io.*;
import java.util.Scanner;

public class BankFees {
    public static void main(String args[]) {
        Double ib;
        int nc;
        Double f;
        Double bc, cf;
        Double lbf = 0.00;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter initial balance: "); 
        ib = sc.nextDouble();

        System.out.print("enter number of checks written during the month: "); 
        nc = sc.nextInt(); 

        bc = 10.00; 
        if(nc < 20)
        cf = nc * 0.10;
        else if(nc <= 39)
        cf = nc * 0.08;
        else if(nc <= 59)
        cf = nc * 0.06;
        else
        cf = nc * 0.04;

      
        if(ib < 400)
        lbf = 15.00;

        f = bc + cf + lbf;

        System.out.print("fees: " + f);
    }
}