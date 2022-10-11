package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class ReverseArray14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string array ");
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
//your code goes here
        int n=arr.length;
        String str="";
        for(int i=n-1 ; i>-1 ; i--){
            str=str+arr[i];
        }
        System.out.println(str);
    }
}
