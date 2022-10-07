package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        //program to find the factorial of number  using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :  ");
        int num=sc.nextInt();
        long factorial=1;
        for(int i =1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}
