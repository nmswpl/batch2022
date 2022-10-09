package in.co.nmsworks.exercise2;

public class Program7
{
    public static void reverseOrder()
    {
        String[] arr={"a","b","c"};

           for(int i=arr.length-1;i>=0;i--)
           {
               System.out.print( "Array in Reverse order :" +arr[i]);
           }

    }
    public static void main(String[] args)
    {
        reverseOrder();
    }
}
