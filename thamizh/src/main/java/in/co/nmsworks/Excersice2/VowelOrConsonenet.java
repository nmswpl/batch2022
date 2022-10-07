package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class VowelOrConsonenet {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println( "enter a character");

        char character=in.next().charAt(0);

        if(character=='a' || character=='e' || character=='i' ||character=='o' || character=='u')
        {
            System.out.println("it is vowel");
        }
        else
        {
            System.out.println("It is consonent");
        }
    }
}
