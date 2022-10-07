// 4. Write a program to print the position of given element in an array. If not present, print -1
package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {7,15,41};
        System.out.print("Enter Search Element ");
        int number = input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
                System.out.println("Output: "+ i);
                System.exit(0);
            }
        }
        System.out.println("Output: -1");
    }
}
