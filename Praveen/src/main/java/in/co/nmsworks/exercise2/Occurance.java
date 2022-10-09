package in.co.nmsworks.exercise2;
//Write a Program to print no of occurance of x in the array
public class Occurance {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,2,2,3};
        int x=2;
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(x==arr[i])
            {
               count++;
            }
        }
        System.out.println(count);
    }
}
