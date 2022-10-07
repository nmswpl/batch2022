package in.co.nmsworks.excercise2;

public class MultiplyTwoArray {
    public static void main(String[] args) {
        int[] arr1={2,4,1},arr2={3,5,7};
        if ( arr1.length == arr2.length )
        {
            System.out.print("Output is: ");
            for (int i=0; i< arr1.length; i++)
            {
                System.out.print(arr1[i]*arr2[i]+" ");
            }
        }
        else {
            System.out.println("Array length mis-match");
        }
    }
}
