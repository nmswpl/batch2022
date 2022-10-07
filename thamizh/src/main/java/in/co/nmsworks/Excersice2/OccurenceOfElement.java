package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class OccurenceOfElement {

    public static void main(String[] args) {

        int [] arr=new int[] {55,77,3,8,77,55,6,77,2,11,44};

        int count=0;

        Scanner in=new Scanner(System.in);
        System.out.println("enter number :");
        int x= in.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                count++;
            }
        }
        System.out.println("x ("+x+ ")"+"  occurs " +count+ " times in array");
    }
}
