package in.co.nmsworks.excersise2;

public class LargestElementInArray
{
    public static void main(String[] args)
    {
        int[] arr ={12, 3, 20, 14};
        int largeElement=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                largeElement=arr[i];
            }
        }
        System.out.println(largeElement);
    }
}
