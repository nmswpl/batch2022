package in.co.nmsworks.exercise2;

public class Program10
{
    public static void arrayMultiply()
    {
       int product=0;
        int[] arr1={2,4,1};
        int[] arr2={3,5,7};
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]*arr2[i]);
        }

    }

    public static void main(String[] args)
    {
        arrayMultiply();
    }
}
