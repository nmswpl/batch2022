// 11. Write a program to print the biggest of the 3 numbers
package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr=new int[3];
        int max =0;
        for(int i=0;i<3;i++){
            System.out.print("Enter Number "+ (i+1)+" ");
            arr[i]=input.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Output: "+max);


    }
}
