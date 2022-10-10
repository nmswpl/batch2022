package in.co.nmsworks.excercise1;

import java.util.Scanner;

/*Check whether a number is even or odd using if...else statement*/

public class Even7 {
    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number ");
        num= s.nextInt();
        if(num%2==0){
            System.out.println(num + " is  even  :");
        }
        else {
            System.out.println((num + " is  is not even : "));
        }
    }
}