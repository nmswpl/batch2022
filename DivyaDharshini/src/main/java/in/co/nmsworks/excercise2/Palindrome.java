package in.co.nmsworks.excercise2;
import java.util.*;
public class Palindrome {
        public static void main(String[] args)
        {
            String a,b="";
            Scanner val = new Scanner(System.in);
            System.out.print("Enter the string :\n");
            a = val.nextLine();
            int n = a.length();
            for(int i = n - 1; i >= 0; i--)
            {
                b=b+(a.charAt(i));
            }
            if(a.equalsIgnoreCase(b.toString()))
            {
                System.out.println("The string is palindrome.");
            }
            else
            {
                System.out.println("The string is not palindrome.");
            }
        }
}
