package in.co.nmsworks.excercise2;
// print no of occurrence of x in the array
public class Program18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int x = 1;
        int freq = 0;

        for(int num : arr) {
            if(num == x) {
                freq += 1;
            }
        }

        System.out.println("Number of occurrences of " + x + " in array : " + freq);
    }
}
