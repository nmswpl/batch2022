package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class FindingAlphabet {

    //11. Write a program to Check Alphabet using if else

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);

        if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
        {
            System.out.println(ch+" it is Alphabet");
        }
        else
        {
            System.out.println(ch+" is not an alphabet");
        }
    }
}
