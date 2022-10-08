package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Factorial14 {
    public static void main(String[] args) {
        int num;
        int fact=1;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("fact of " + num +" " + fact);
    }
}
