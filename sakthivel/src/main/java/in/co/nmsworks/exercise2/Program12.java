package in.co.nmsworks.exercise2;

public class Program12
{
    public static void positionInArray()
    {
        int index=-1;
       int[] arr = {7, 15, 41};
       for(int i=0;i< arr.length;i++)
       {
           if(arr[i] == 41)
           {
                  index = i;
                   break;
               }
       }
        System.out.println("index of element : "+index);
    }
    public static void main(String[] args)
    {
        positionInArray();
    }
}
