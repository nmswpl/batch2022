package in.co.nmsworks.excercise1;
import java.util.*;

public class CheckAlphabet {
        public static void main(String[] args) {
            Scanner val=new Scanner(System.in);
            System.out.println("Enter value");
            char c=val.next().charAt(0);
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                System.out.println(c + " is an alphabet.");
            else
                System.out.println(c + " is not an alphabet.");
        }
}
