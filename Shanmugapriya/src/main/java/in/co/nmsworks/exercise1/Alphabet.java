package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Print alphabets
public class Alphabet
{
    public static void main(String[] args) {
        char[] s = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Character :");
        String string = S.nextLine();

        if(string.equals(s))
        {
            System.out.println(string+" is a alphabet");
        }
        else
            System.out.println(string+" is not a alphabet");
    }
}
