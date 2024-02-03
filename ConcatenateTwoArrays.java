import java.util.Arrays;
import java.util.Scanner;
public class ConcatenateTwoArrays {
    public static String[] concatenate(String[] a1, String[] a2) {
        String res[]=new String[a1.length+a2.length];
        int i=0,x;
        for(i=0,x=0;x<a1.length;i++,x++)
        res[i]=a1[x];
        for(x=0;x<a2.length;i++,x++)
        res[i]=a2[x];
        return res;
    }


    public static String [] readArray(){
        String ss = input.nextLine();
        String [] aa = ss.split("[, ]");
        if(aa[0].length() == 0)
            aa = new String[0];

        return aa;
    }
    
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("enter elements first array: ");
        String [] firstArray = readArray();
        System.out.print("enter elements second array: ");
        String [] secondArray = readArray();
        System.out.println("firstArray: " + Arrays.toString(firstArray));
        System.out.println("secondArray: " + Arrays.toString(secondArray));
        System.out.println("concatenated: " + Arrays.toString(concatenate(firstArray,secondArray)));
    }
}