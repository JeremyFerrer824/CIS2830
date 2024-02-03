import java.util.*;
public class StringAlternateSorting{
	public static String alternateSort(String s1, String s2){
		String out = "";
		int i = 0,j=0;
		int l1 = s1.length();
		int l2 = s2.length();
		while (i < l1 && j < l2){
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(j);
			if (c1 <= c2){
				out += c1;
				i++;
			}else {
				out += c2;
				j++;
			}
		}
		while (i < l1){
			out += s1.charAt(i++);
		}
		while (j < l2){
			out += s2.charAt (j++);
		}
		return out;
	}
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		System.out.print("enter first string: ");
		String s1 = in.nextLine();
		System.out.print("enter second string: ");
		String s2 = in.nextLine();
		System.out.println(alternateSort(s1,s2));
	}
}