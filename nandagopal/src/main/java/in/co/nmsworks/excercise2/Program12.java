package in.co.nmsworks.excercise2;
// count number of odd elements
public class Program12 {
    public static void main(String[] args) {
        int[] arr = {11, 1, 32, 43, 4, 15};
        int count = 0;
        for(int num : arr) {
            if(num % 2 != 0) {
                count += 1;
            }
        }
        System.out.println("Odd elements = " + count);

    }
}
