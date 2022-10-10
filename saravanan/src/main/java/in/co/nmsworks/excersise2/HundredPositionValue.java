package in.co.nmsworks.excersise2;

public class HundredPositionValue
{
    public static void main(String[] args)
    {
      int number =580;
      //==========================
      int ans =number/100;
      String[] arr= {"zero","one","two","three","four","five","six","seven"};
      for(int i=0;i< arr.length;i++)
      {
          if(ans == i)
          {
              System.out.println(arr[i]);
          }
      }

    }
}
