package in.co.nmsworks.exercise2;

public class Program11
{
    public static void oddNumInArray()
    {
        int count=0;
        int[] arr={32, 43, 4, 15};
        for(int i=0;i< arr.length;i++)
        {
            if(i%2!=0)
            {
                count++;
            }
        }
        System.out.println("Odd element present in array is : " + count);
    }

    public static void main(String[] args)
    {
        oddNumInArray();
    }
}
