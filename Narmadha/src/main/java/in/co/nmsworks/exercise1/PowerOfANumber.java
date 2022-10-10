package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
//using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the baseNumber : ");
        int baseNum=sc.nextInt();
        System.out.println("enter the exponent: ");
        int exponent=sc.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result=result*baseNum;


        }
       System.out.println(result);
    }
}
