package exercise2;

public class SumOfElementsInArray {

    public static void main(String[] args) {
        int[] arr = {23,43,34,5,355,556,4};
        int sum=0;
        for( int a : arr)
        {
            sum += a;
        }

        System.out.println("Sum of the elements in the array: "+sum);
    }
}
