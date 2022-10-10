package in.co.nmsworks.exercise2;

public class MultiplyTwoArrays {
    public static void main(String[] args) {
        //program to multiply two arrays of same size element-by-element.
        String result = "";
        int[] array1 = {2, 4, 1};
        int[] array2 = {3,5,7};

        for (int i = 0; i < array1.length; i++) {
            int num1 = array1[i];
            int num2 = array2[i];
            result += num1 * num2 +" ";
        }
        System.out.println("Result: " +result);
    }
}

