package in.co.nmsworks.excersise2;

public class OccuranceOfElement
{
    public static void main(String[] args)
    {
       int[] arr={2,3,32,3,22,22,2,2};
       int element=2;
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] == element)
               count++;
       }
        System.out.println(element+" occurs in "+count+" times");
    }
}
