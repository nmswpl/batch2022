package in.co.nmsworks.exercise2;
// Square of the array elements
public class SquareOfArrayElements
{
    public static void main(String[] args)
    {
        int[] array = {2,3,4,5};
        System.out.print("Square of the elements in the array : ");
        for (int square:array)
        {
            System.out.print(square * square + "  ");
        }
    }
}
