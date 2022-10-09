package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program17
{
    public static void findDuplicateElement()
    {
        int count=0;

        int arr[] = {1, 2, 3, 2, 2, 3};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else {
                    break;
                }
                if(count>1)
                {
                    System.out.println(arr[j] +"="+count);
                }
            }

        }
    }

    public static void main(String[] args)
    {
        findDuplicateElement();
    }
}
