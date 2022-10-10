package in.co.nmsworks.excersise2;


// Given an array of String, Write a Program to reverse the array and print.
public class ReverseTheArray
{
    public static void main(String[] args)
    {
        String[]  str={"a","b","c"};
        for (int i= str.length-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
    }
}
