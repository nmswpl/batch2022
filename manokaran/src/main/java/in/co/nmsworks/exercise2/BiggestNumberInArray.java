package in.co.nmsworks.exercise2;

public class BiggestNumberInArray
{
    public static void main(String[] args)
    {
        int[] array = {12, 3, 20, 14};
        int biggest = array[0];
        for (int i = 0; i < array.length;i ++)
        {
            if (biggest < array[i])
            {
                biggest = array[i];
            }
        }
        System.out.println(" Biggest Number : " + biggest);
    }
}
