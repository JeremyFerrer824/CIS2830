import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {
    static int[] aa;
    static int[] bb;

    public static void main(String[] args) {

        aa = getArray();
        
        System.out.println(Arrays.toString(aa));

        bb = returnCopyof(aa);

        System.out.println(Arrays.toString(bb));

    }

    static int[] returnCopyof(int[] xx) {
        int[] result = new int[xx.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = xx[i];
        }
        return result;
    }
    public static int[] getArray() {

        String nums;
        int numint = 0;
        int xx;
        System.out.print("enter ints: ");
        Scanner in = new Scanner(System.in);
        nums = in.nextLine();
        in.close();

        Scanner scan = new Scanner(nums);
        while (scan.hasNextInt()) {
            xx = scan.nextInt();
            numint++;
        }

        scan.close();

        int[] intArray = new int[numint];
        scan = new Scanner(nums);
        for (int i = 0; i < numint; i++) {
            intArray[i] = scan.nextInt();
        }
        scan.close();
        return intArray;
    }
}