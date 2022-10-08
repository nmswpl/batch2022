package in.co.nmsworks.exercise1;
//Character is alphabet or not

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
//        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character :");

       char character =scanner.next().charAt(0);
//        String[] s={"a","b",c,d,e,f,g,h,j,k,l,m,n,o,p,q};


        if(character >='a' && character <='z' || character>='A'&& character<= 'Z')
        {
            System.out.println(character + "is a alphabet");
        }
        else
        {
            System.out.println(character + "is not a alphabet");
        }
    }
}
