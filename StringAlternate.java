import java.util.*;
public class StringAlternate {
    public static void main(String[] args){
        String str1;
        String str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string: ");
        str1=sc.nextLine();
        System.out.println("enter second string: ");
        str2=sc.nextLine();
        String result="";
        for (int i=0;i<str1.length() || i<str2.length();i++){
            if(i<str1.length())
            result += str1.charAt(i);
            if(i<str2.length())
            result += str2.charAt(i);
        }
        System.out.println(result);

    }

}