package in.co.nmsworks.excersise2;

public class Excersise12
{
    public static void main(String[] args)
    {
        int[] arr={32, 43, 4, 15};
        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2 !=0)
            {
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd Elements :" + count);
    }
}
