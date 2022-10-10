/*8. Write a program to Check whether an alphabet is vowel or consonant using if..else
statement*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class VowelOrConsonant8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an alphabet: ");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is vowel");
        }
        else
        {
            System.out.println(ch+" is consonant");
        }

    }
}
