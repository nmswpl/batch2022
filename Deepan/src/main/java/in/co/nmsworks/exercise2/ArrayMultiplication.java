package exercise2;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int[] arr1 = {2,8,5};
        int[] arr2 = {9,1,7};

        for (int i=0 ; i < arr1.length ; i++)
        {
            int value = arr1[i] * arr2[i];
            System.out.print(" "+value);
        }
    }
}
