package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class VCDWFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement");
        String statement = sc.nextLine();
        int vowelCounter = 0,consonantCounter = 0,digitsCounter = 0,spaceCounter = 0;
        for (int i = 0; i <statement.length() ; i++) {
            if (statement.charAt(i) == 'a' | statement.charAt(i) == 'e' | statement.charAt(i) == 'i'
                    | statement.charAt(i) == 'o' | statement.charAt(i) == 'u'){
                    vowelCounter++;
            } else if ((statement.charAt(i)) <= 57 & statement.charAt(i) >= 48) {
                digitsCounter++;
            } else if (statement.charAt(i) == ' ') {
                spaceCounter++;
            }
            else {
                if(statement.charAt(i) != '.') {
                    consonantCounter++;
                }
            }
        }
        System.out.println("V : " + vowelCounter);
        System.out.println("C : " + consonantCounter);
        System.out.println("D : " + digitsCounter);
        System.out.println("W : " + spaceCounter);


    }

}

//   25. Write a program to count vowels, consonants, digits, and spaces
