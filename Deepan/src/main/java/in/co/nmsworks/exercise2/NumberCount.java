package exercise2;

import java.util.Scanner;

public class NumberCount {

    public static void main(String[] args) {
        int[] arr = {2,3,2,2,3,1,1,1,2,3,4,7};
        int count =0 ;

        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number to count: ");
        int num = get.nextInt();

        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i] == num)
            {
             count++;
            }
        }

        System.out.println("Occurrence of "+num+ " is "+count+ " times ");
    }
}
