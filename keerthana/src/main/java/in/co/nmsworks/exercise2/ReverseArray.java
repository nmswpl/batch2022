/*14. Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}

 */



package in.co.nmsworks.exercise2;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Character[] arr={'a','b','c'};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
