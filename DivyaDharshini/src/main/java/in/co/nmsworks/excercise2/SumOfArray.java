package in.co.nmsworks.excercise2;

public class SumOfArray {
        public static void main(String[] args) {
            int[] arr = new int [] {1, 2, 3};
            int sum = 0;
            for (int j : arr) {
                sum = sum + j;
            }
            System.out.println("Sum of array: " + sum);
        }

}
