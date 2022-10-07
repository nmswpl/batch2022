//4. Write a program to print the position of given element in an array.
// If not present, print -1 E.g : Input : arr = {7, 15, 41} Search Element : 41 Output : 2;Search Element : 5 Output : -1

package in.co.nmsworks.training.excercise2;

import java.util.Scanner;

public class ArrayPosition {
    public static void main(String[] args)
    {

        int[] arr = {3,5,6};
        int searchValue;
        System.out.println("enter a search element:");
        Scanner sc = new Scanner(System.in);
        searchValue = sc.nextInt();

        for(int i=0; i < arr.length;i++)
        {
            if(arr[i] == searchValue)
            {
                System.out.println("output is:"+i);
            }

        }


    }
}
