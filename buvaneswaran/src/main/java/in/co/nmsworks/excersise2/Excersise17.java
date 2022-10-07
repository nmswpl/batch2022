package in.co.nmsworks.excersise2;

public class Excersise17
{
    public static void main(String[] args)
    {
        int[] a={12, 3, 20, 14};
        int max=a[0];

        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Largest Element in the Array is :" + max);
    }
}
