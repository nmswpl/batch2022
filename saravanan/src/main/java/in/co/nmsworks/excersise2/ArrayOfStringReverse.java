package in.co.nmsworks.excersise2;

public class ArrayOfStringReverse
{
    public static void main(String[] args)
    {

        String[] arr = {"a","b","c"};

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
