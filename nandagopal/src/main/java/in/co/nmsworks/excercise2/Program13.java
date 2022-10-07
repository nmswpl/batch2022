package in.co.nmsworks.excercise2;
// find the sum of the elements of the array
public class Program13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements in the array : " + sum);
    }
}
