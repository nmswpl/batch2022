package in.co.nmsworks.Excersice2;

public class NumberOfOccuranceInArray
{
    public static void main(String[] args)
    {
        int x = 2;
        int count =  0;
        int[] arr = {1, 2, 3, 2, 2, 3};

        for ( int i : arr)
        {
            if(arr[i] == x)
            {
                count ++ ;
            }

        }
        System.out.println(x + " is occured "+count +" times");
    }
}
