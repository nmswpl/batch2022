package in.co.nmsworks.excercise2;
// find the largest element in the given array.
public class Program17 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 20, 14};
        int largest = 0;
        for(int num : arr) {
            if(num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest in the array : " + largest);
    }
}
