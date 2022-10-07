package in.co.nmsworks.exercise2;

public class Program6
{
    public static void sumOfArray()
    {
        int a=0;
        int arr[] = {1, 2, 3};
        for(int i=0; i <= arr.length;i++)
        {
            a +=i;

        }
        System.out.println("Sum of given Array is : " + a);
    }

    public static void main(String[] args)
    {
        sumOfArray();
    }
}
