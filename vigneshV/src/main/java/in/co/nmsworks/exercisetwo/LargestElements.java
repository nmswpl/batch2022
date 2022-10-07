package in.co.nmsworks.exercisetwo;

public class LargestElements {
    public static void main(String[] args) {
        int[] arr = {12, 3, 20, 14};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
