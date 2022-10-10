package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Factors22 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a factor");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num % i ==0){
                System.out.println(i + " ");
            }
        }
    }
}
