package in.co.nmsworks.exercise2;

public class Program16
{
    public static void squareOfAnGivenArray()
    {
        int square=0;
        int[] arr = {2, 4, 3, 5};
        for (int i=0;i<=arr.length;i++)
        {
            square=i*i;

        }
        System.out.println(square);
    }

    public static void main(String[] args)
    {
        squareOfAnGivenArray();
    }
}
