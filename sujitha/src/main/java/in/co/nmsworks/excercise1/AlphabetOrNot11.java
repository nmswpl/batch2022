/*11. Write a program to Check Alphabet using if else*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class AlphabetOrNot11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch=sc.next().charAt(0);

      if((ch>'A'&&ch<'Z')||(ch>'a'&&ch<'z'))
        {
            System.out.println(ch+" is an alphabet");
        }
      else
      {
          System.out.println("not an alphabet");
      }

    }
}
