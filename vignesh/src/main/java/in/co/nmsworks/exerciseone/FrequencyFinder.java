package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FrequencyFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement :");
        String statement = sc.nextLine();
        System.out.println("Enter the char to search :");
        char ch = sc.next().charAt(0);
        int charCounter = 0;
        for (int i = 0; i < statement.length() ; i++) {
            if (statement.charAt(i) == ch){
                charCounter++;
            }
        }
        System.out.println("ABC of "+ ch +" = "+ charCounter);

    }
}

// 24. Write a program to find Frequency of Character