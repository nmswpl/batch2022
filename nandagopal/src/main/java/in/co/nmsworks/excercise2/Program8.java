package in.co.nmsworks.excercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Given a 3-digit number, write a program to print the hundred position value in words.
public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 digits number : ");
        int n = in.nextInt();

        Map<Integer, String> numToText = new HashMap<>();
        String[] numStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<numStrings.length; i++) {
            numToText.put(i, numStrings[i]);
        }

        System.out.println(numToText.get(n/100));
    }
}
