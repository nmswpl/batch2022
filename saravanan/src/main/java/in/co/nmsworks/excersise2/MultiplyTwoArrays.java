package in.co.nmsworks.excersise2;

import java.util.Scanner;

public class MultiplyTwoArrays
{
    public static void main(String[] args)
    {
       int[] arr1 = {2,4,1};
       int[] arr2 = {3,5,7};
       int n=3;//no of element
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the array element");
//        for(int i=0;i<n;i++)
//        {
//            arr1[i]=s.nextInt();
//            arr2[i]=s.nextInt();
//        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]*arr2[i]+" " );
        }


    }
}
