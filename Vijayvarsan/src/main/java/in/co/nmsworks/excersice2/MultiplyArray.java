package in.co.nmsworks.excersice2;

public class MultiplyArray {
    //3. Write a program to multiply two arrays of same size element-by-element.
    //E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
    public static void main(String[] args) {
        int value;
        int[] arr1 = {2, 4, 1};
        int[] arr2 = {3, 5, 7};
        for (int i = 0; i < arr1.length; i++) {
                value = arr1[i] * arr2[i];
                System.out.println(value);
            }

        }

    }
