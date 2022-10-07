package in.co.nmsworks.exercise2;
// Program to reverse the array and print.
public class ReverseArray
{
    public static void main(String[] args)
    {
        char[] array = {'a','b','c'};
        for (int i = array.length-1;i >= 0 ; i --)
        {
            System.out.print(array[i] + " ");
        }
    }
}
