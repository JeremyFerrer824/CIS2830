import java.util.*;
import java.lang.*;
import java.io.*;

public class UseMath
{
   public static void main (String[] args) throws java.lang.Exception
   { //initializing the two number in the array format for taking input
   double[] number = new double[2];
       int i;
       for(i =0; i < 2; i++)
       {
       Scanner input = new Scanner(System.in);
       number[i] = input.nextDouble();
       }

DecimelFormat df = new DecimelFormat("#.##");

//to calculate absloute value, cube root, square root, maximum, minimum and power raised to
System.out.println("The absloute value of your first number is: " + df.format(Math.abs(number[0])));
System.out.println("The cube root value of your second number is: " + df.format(Math.cbrt(number[1])));
System.out.println("The sqaure root value of your second number is: " + df.format(Math.sqrt(number[1])));
System.out.println("The log base 10 of your second number is: " + df.format(Math.log(number[1])));
System.out.println("The greatest of your two number is: " + df.format(Math.min(number[1], number[0])));
System.out.println("The smallest of your two number is: " + df.format(Math.max(number[1], number[0])));
System.out.println(number[0] + " to the power of " + number[1] + "is" + df.format(Math.pow(number[1], number[0])));
  
   }
}