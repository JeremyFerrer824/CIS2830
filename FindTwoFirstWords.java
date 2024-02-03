import java.util.Scanner;
public class FindTwoFirstWords
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = "", y="";
        while (true){
            System.out.print("enter a string (end with 0): ");
            String s= sc.nextLine();

            if (s.equals("0"))
                break;

            if(x.equals("")||s.compareTo(x)<0){
                y = x;
                x=s;
            }
            else if (y.equals("")||s.compareTo(y)<0){
                y=s;
            }
        }
        if(!x.equals("")){
            System.out.println("first: "+ x);
            if(!y.equals(""))
                System.out.println("second: "+y);
        }
    }
}