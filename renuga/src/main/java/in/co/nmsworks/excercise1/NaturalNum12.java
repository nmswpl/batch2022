package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class NaturalNum12 {
    public static void main(String[] args) {
        int num=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("sum = " + sum);
    }
}
