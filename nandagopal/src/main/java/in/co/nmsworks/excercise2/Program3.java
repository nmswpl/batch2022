package in.co.nmsworks.excercise2;
// multiply two arrays of same size element-by-element.
public class Program3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1};
        int[] arr2 = {3, 5, 7};

        for(int i=0; i<arr1.length; i++) {
            System.out.print((arr1[i] * arr2[i]) + " ");
        }
    }
}
