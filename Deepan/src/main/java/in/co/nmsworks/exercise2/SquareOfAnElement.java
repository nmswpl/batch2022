package exercise2;

//Square of a given number
public class SquareOfAnElement {

    public static void main(String[] args) {
        int[] arr = {2,5,9,23,3};

        for (int i=0 ; i < arr.length; i++)
        {
            int square = arr[i] * arr[i];
            System.out.print(square + " ");
        }
    }
}
