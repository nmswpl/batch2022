package in.co.nmsworks.excercise2;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int sum=0;
        for (int i=0; i< arr1.length; i++)
        {
            sum=sum+arr1[i];
        }
        System.out.println("Output is : "+sum);
    }
}
