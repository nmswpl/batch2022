package in.co.nmsworks.exercise2;

public class OccurenceInArray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 2, 2, 3};
        int x = 2;
        int noOfOccurence = 0;
        for (int occurence:array)
        {
            if (x == occurence)
            {
                noOfOccurence ++;
            }
        }
        System.out.println("Number of Occurence : " + x + " in array : " + noOfOccurence);
    }
}
