package in.co.nmsworks.excercise1;
import java.util.*;
public class AsciiValue {

    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter character");
        char ch=val.next().charAt(0);
        int ascii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
