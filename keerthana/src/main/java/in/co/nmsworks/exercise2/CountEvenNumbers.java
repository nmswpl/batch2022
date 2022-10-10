/*15. Given an array of integers, Write a Program to count and print even elements
*/

package in.co.nmsworks.exercise2;

public class CountEvenNumbers
{
    public static void main(String[] args) {


        int[] arr = {1, 34, 54, 23, 67, 44, 87, 58,56};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }


        System.out.println("\nEven numbers count in array: " + count);
    }
}
