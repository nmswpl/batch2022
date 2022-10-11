package in.co.nmsworks.Training;

import java.util.Arrays;



public class Practice
{
    public static void main(String[] args)
    {
        int[] arr = {-1,-7,13,4,-2,2,-4,-5};
        int i=0;
        int j=arr.length-1;
        while(arr[j]<0 && i<j)
            j--;
        while(i<j)
        {
            if(arr[i]<0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            if (arr[j]<0)
            {
              j--;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));


    }
}
