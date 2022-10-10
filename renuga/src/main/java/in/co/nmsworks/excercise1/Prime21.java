package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Prime21 {
    public static void main(String[] args) {
        int num=0;
        boolean flag = false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        for(int i=2; i <= num/2; i++){
           if(num % i == 0) {
               flag = true;
               break;
           }
        }
        if(!flag){
            System.out.println((num + "  is prime number"));
        }
        else {
            System.out.println(num + " is not prime number");
        }
    }
}
