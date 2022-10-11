package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class Largest17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array  three number ");
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && b>c ){
            System.out.println("The largest number is : " + a);
        }
        else if(b>c){
            System.out.println("The largest number is : " +b);
        }
        else
        {
            System.out.println("The largest number is : "+c);
        }
    }
}
