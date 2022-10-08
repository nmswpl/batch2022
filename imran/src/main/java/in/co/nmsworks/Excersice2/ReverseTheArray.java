package in.co.nmsworks.Excersice2;
import java.util.ArrayList;
import java.util.List;

public class ReverseTheArray
{
    public static void main(String[] args) 
    {
       String[] arr = {"a","b","c" };
        for ( int i = arr.length-1;i >= 0;i--)
        {
            System.out.print( arr[i]  +" ");
        }
    }
}
