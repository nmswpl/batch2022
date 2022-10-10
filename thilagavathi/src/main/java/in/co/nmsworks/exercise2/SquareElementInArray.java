//a program for to print the square of the element in the array
//input:arr={2,4,3,5}

package in.co.nmsworks.exercise2;

public class SquareElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }

}

