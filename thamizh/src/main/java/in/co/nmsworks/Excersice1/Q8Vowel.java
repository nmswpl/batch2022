package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class Q8Vowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter an alphabet");
        char alphabet=in.next().charAt(0);

        if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u')
        {
            System.out.println("it is an vowel");
        }
       else if(alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U')
        {
            System.out.println(alphabet+" it is an vowel");
        }

         else {
            System.out.println(alphabet+" it is consonents");
        }
    }
}
