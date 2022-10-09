package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Problem9
{
    public static void ASCIIValue()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character is : ");
        char ch = sc.next().charAt(0);;
        int ascii=(int) ch;


        System.out.println("ASCII value of ch is :"+ ascii);
    }

    public static void main(String[] args) {
        ASCIIValue();
    }
}
