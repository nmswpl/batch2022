package in.co.nmsworks.training.excercise2;

public class ArrayLargest {
    public static void main(String[] args) {
        int[] arr = { 10,23,3, 78,95};
        int maxi = arr[0];
        for( int i =0; i < arr.length; i++)
        {
            if(maxi < arr[i])
            {
                maxi = arr[i];
            }
        }
        System.out.println("Largest is :" + maxi);

    }
}
