package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PrintThePosition {
    //program to print the position of given element in an array. If not present, print -1
    public static void main(String[] args) {
        int[]arr={7, 15, 41};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the search element: ");
        int n= sc.nextInt();
        int index=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]==n){
                index=i;
                break;
            }else{
                index=-1;
            }
        }
        System.out.println(index);
    }
}
