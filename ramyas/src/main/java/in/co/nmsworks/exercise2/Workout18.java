package in.co.nmsworks.exercise2;
//18. Given an array of integers and int x, Write a Program to print no of occurance of x in
//the array
//For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
//times in array
public class Workout18
{
    public static void main(String[] args)
    {
       int[] arr = {1, 2, 3, 2, 2, 3};
       int no = 3;
       int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == no)
             count++;
        }
        System.out.println(count);
    }
}
