package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Frequency {
    //Write a program to find Frequency of Character
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the statement: ");
        String str=sc.nextLine();
        System.out.println("enter the ch: ");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
