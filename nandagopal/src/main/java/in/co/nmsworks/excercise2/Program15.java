package in.co.nmsworks.excercise2;
// count and print even elements in array
public class Program15 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;

        for(int num : arr) {
            if(num % 2 == 0) {
                count += 1;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("count of even elements : " + count);
    }
}
