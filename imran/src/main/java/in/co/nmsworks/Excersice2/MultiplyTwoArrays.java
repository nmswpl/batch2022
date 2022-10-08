package in.co.nmsworks.Excersice2;

public class MultiplyTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,1};
        int[] arr2 = {3,5,7};

        System.out.print("products = ");
        for(int i = 0;i < arr1.length;i++)
        {
            int op = arr1[i] * arr2[i];

            System.out.print(op + " ");

        }
    }
}
