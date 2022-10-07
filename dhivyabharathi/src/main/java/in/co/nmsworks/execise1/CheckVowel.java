package in.co.nmsworks.execise1;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter check value");
         char element = in.next().charAt(0);

        if("a".equalsIgnoreCase(String.valueOf(element)) || "e".equalsIgnoreCase(String.valueOf(element)) || "i".equalsIgnoreCase(String.valueOf(element)) || "o".equalsIgnoreCase(String.valueOf(element)) || "u".equalsIgnoreCase(String.valueOf(element)))
        {
            System.out.println("Given element is vowel : "+element);
        }
        else
        {
            System.out.println("Given element is not Vowel : " + element);
        }
    }
}

