package in.co.nmsworks.exercisetwo;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {11,55,23,32,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
