// 12. Given an array of integers, Write a Program to print number of odd elements.
package in.co.nmsworks.exercise2;

public class Program12 {
    public static void main(String[] args) {
        int[] arr = {32, 43, 4, 15};
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd Elements = "+count);
    }
}
