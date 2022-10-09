package in.co.nmsworks.excercise1;

public class OddNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
