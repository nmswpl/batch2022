package in.co.nmsworks.exercise;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter check value");
        String element = in.nextLine();

        if("a".equalsIgnoreCase(element) || "e".equalsIgnoreCase(element) || "i".equalsIgnoreCase(element) || "o".equalsIgnoreCase(element) || "u".equalsIgnoreCase(element))
        {
            System.out.println("Given element is vowel "+element);
        }
        else
        {
            System.out.println("Given element is not Vowel" + element);
        }
    }
}
