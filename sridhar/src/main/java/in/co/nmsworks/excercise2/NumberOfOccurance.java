package in.co.nmsworks.excercise2;

public class NumberOfOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2,3};
        int x=2,count=0;
        for (int i=0; i< arr.length; i++)
        {
            if(x==arr[i])
            {
                count++;
            }
        }
        System.out.println(x+" occurance is : "+ count);
    }
}
