package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class AlphabetChecker {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value :");
        char value = sc.next().charAt(0);
        if (value >= 'a' & value <= 'z' || (value >= 'A' & value <='Z')){
            System.out.println(value +" is a alphabet");
        } else {
            System.out.println(value +" is not a alphabet.");
        }

    }

}


//     11. Write a program to Check Alphabet using if - else