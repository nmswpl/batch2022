package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PositiveOrNegative10 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=0){
            System.out.println(n+ " is a positive number");
        }
        else{
            System.out.println(n+ " is a negative number");
        }
    }
}
