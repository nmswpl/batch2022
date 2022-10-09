package in.co.nmsworks.excersice2;

public class SquareOfElement {
    //7.Write a program to print the square of every element present in the array.
    //E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25

    public static void main(String[] args) {
        int[] arr={2,4,3,5};
        for (int i=0; i<arr.length;i++)
        {
            int square=arr[i]*arr[i];
            System.out.println(square);
        }
    }
}
