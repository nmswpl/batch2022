package in.co.nmsworks.excercise2;

// to print the square of every element present in the array
public class Program7 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5};
        for(int num : arr) {
            System.out.print((int) Math.pow(num, 2) + " ");
        }
    }
}
