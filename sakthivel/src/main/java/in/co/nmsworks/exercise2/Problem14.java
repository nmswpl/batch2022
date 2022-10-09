package in.co.nmsworks.exercise2;

public class Problem14
{
    public static void largestElementInArray()
    {
        int max=12;
      int  arr[] = {12, 3, 20, 14};
      for(int i=1;i< arr.length;i++)
      {
          if (arr[i] > max)
          {
                  max = arr[i];
              System.out.println(max);
          }
      }
    }

    public static void main(String[] args)
    {
        largestElementInArray();
    }
}
