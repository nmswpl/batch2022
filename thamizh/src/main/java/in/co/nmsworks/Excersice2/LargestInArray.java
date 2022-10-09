package in.co.nmsworks.Excersice2;

public class LargestInArray {

    //17. Given an array of integer, Write a Program to find the largest element in the given
    //array.
    //For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20


    public static void main(String[] args) {

        int[] arr=new int[]{12, 3, 20, 14,55,100,7,5};
        int max=arr[0];

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }

        }
        System.out.println(max+" is largest");
    }
}
