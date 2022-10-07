package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class IndexPosition {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        int index =0 ;
        int arr[] = {3,44,323,8,23,234,55,45,9,6};

        for (int i=0 ; i < arr.length ; i++){

            if(num == arr[i])
            {
              index = i;
            }
        }

        if (index >= 0)
            System.out.println("Index of "+num+ " is "+index);
        else
            System.out.println((-1));
    }
}
