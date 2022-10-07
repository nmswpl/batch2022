// 8. Given a 3 digit number, write a program to print the hundred position value in words.
package in.co.nmsworks.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int number = input.nextInt();
        while(number>10){
            number = number/10;
        }

        ArrayList <String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");

        for(int i=0;i<numbers.size();i++){
            if(i+1 == number){
                System.out.println(numbers.get(i));
            }
        }
//        switch (number){
//            case 1 :
//                System.out.println("one");
//                break;
//            case 2 :
//                System.out.println("Two");
//                break;
//            case 3 :
//                System.out.println("Three");
//                break;
//            case 4 :
//                System.out.println("Four");
//                break;
//            case 5 :
//                System.out.println("Five");
//                break;
//            case 6 :
//                System.out.println("Six");
//                break;
//            case 7 :
//                System.out.println("Seven");
//                break;
//            case 8 :
//                System.out.println("Eight");
//                break;
//            case 9 :
//                System.out.println("Nine");
//                break;
//            case 10 :
//                System.out.println("ten");
//                break;
//        }

    }
}
