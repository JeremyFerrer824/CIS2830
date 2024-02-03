import java.util.Scanner;
public class MultiplyByItself {
    public static int a(int x, int y){
        if(y == 0){
            return 1;
        }
        else{
            return x * a(x,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int a = scan.nextInt();
        System.out.print("enter another integer: ");
        int b = scan.nextInt();
        System.out.println(a(a,b));
    }
}