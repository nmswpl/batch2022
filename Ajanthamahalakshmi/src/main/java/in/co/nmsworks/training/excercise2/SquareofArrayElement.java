//7.Write a program to print the square of every element present in the array.
// E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25

package in.co.nmsworks.training.excercise2;

public class SquareofArrayElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 5};
        int res =0;
        for(int i =0;i< arr1.length; i++)
        {
            res = arr1[i]*arr1[i];
            System.out.println("output :"+res);

        }

    }
}
