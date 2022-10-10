package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class CountNumberOfDigits18 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        while(number!=0){
            number = number/10;
            count++;
        }

        System.out.println("number of digits:"+count);

    }
}
