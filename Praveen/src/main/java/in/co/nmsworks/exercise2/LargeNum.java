package in.co.nmsworks.exercise2;
//Write a Program to find the largest element in the given array.
public class LargeNum {
    public static void main(String[] args) {

        int[] arr = {12, 3, 20, 14};
        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
