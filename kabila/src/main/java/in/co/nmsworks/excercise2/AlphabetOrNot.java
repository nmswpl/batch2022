package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner chr = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ctr= chr.next().charAt(0);
      //  char c = '*';

        if( (ctr >= 'a' && ctr <= 'z') || (ctr >= 'A' && ctr <= 'Z'))
            System.out.println(ctr + " is an alphabet.");
        else
            System.out.println(ctr + " is not an alphabet.");
    }

}
