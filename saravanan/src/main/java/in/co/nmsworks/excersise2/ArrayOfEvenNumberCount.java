package in.co.nmsworks.excersise2;

public class ArrayOfEvenNumberCount
{
    public static void main(String[] args)
    {
       int[] arr = {2,5,43,2,6,8};
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] % 2 ==0)
           {
               count++;
           }
       }
        System.out.println("even number count is "+count);
    }

}
