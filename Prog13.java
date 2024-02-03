import java.util.Scanner;
public class Prog13 {
    public static void main(String[] aaa){
        Scanner input = new Scanner(System.in);
        System.out.print("enter integer 1: ");
        int x = input.nextInt();
        System.out.print("enter integer 2: ");
        int y = input.nextInt();
        System.out.print("enter integer 3: ");
        int z = input.nextInt();
        System.out.println(booleanMethod(x,y,z));
    }
    public static boolean booleanMethod(int x, int y, int z) {
        return (y>x) && (y<z);
    }

}