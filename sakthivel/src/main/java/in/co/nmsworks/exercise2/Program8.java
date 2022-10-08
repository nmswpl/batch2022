package in.co.nmsworks.exercise2;

public class Program8
{
    public static void countEvenNum()
    {
        int count=0;
        int[] arr={2,3,4,5,6};
        for(int i=0;i< arr.length;i++)
        {
            if(i%2==0)
            {
                count++;
                System.out.println(arr[i]);
            }
        }

        System.out.println( "Even elements present in array is :" + count);
    }

    public static void main(String[] args)
    {
        countEvenNum();
    }
}
