package in.co.nmsworks.excersise2;


//.Write a program to print the square of every element present in the array.
public class SquereOfElementInArray
{
    public static void main(String[] args) {
        int[] arr={2, 4, 3, 5};
        int result=0;
        for (int i=0;i<arr.length;i++)
            System.out.println("Output :" + arr[i] * arr[i]);
    }
}
