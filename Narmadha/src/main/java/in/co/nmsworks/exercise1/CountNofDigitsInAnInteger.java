package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class CountNofDigitsInAnInteger {
    //Count Number of Digits in an Integer using while loop
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num= sc.nextInt();

        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("count is "+count);

    }
}
