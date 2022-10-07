package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args) {
        char findCharactersAscii;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter the character:");
        findCharactersAscii=inputObject.next().charAt(0);
        int asciiValue=findCharactersAscii;
        System.out.println(findCharactersAscii+" it's Ascii value is:"+asciiValue);
    }
}
