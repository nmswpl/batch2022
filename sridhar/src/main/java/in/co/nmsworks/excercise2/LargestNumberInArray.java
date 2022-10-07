package in.co.nmsworks.excercise2;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr={12,3,20,14};
        int max=0;
        for (int i=0; i< arr.length; i++)
        {
            if ( arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Number is : "+max);
    }
}
