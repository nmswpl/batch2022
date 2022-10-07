package in.co.nmsworks.excersise2;

public class OddNumberInArray
{
    public static void main(String[] args)
    {
        int[] arr={34,45,3,67};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2!=0)
            {
                System.out.println("Odd number number are "+arr[i]);
            }
        }

    }
}
