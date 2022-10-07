import java.util.Scanner;

public class DFindAsciiValue {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = inp.next().charAt(0);
        int asciiValue = ch;
        System.out.println("Ascii value of " +ch + " is " +asciiValue );
    }
}
