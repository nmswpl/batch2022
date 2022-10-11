package in.co.nmsworks.excercise2;

/*7.Write a program to print the square of every element present in the array.
        E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25*/

public class Square7 {
    public static void main(String[] args) {

            int[] temp = {2,4,3,5};

            for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i] + "\t" + (int)Math.pow(temp[i], 2));
            }
        }
    }

