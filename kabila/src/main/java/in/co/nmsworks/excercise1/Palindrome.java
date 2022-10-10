package in.co.nmsworks.excercise1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str= input.next();
        String reverseStr="";
        int strLength=str.length();
        for(int i=(strLength-1);i>=0;i--)
        {
            reverseStr=reverseStr+str.charAt(i);
        }
        if((str.toLowerCase()).equals(reverseStr.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
