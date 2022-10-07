//3. Write a program to multiply two arrays of same size element-by-element.
// E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7

package in.co.nmsworks.training.excercise2;

import java.util.Scanner;

public class ArrayMultiply {
    public static void main(String[] args) {
        int arrsize;
        System.out.println("Enter Array size:");
        Scanner sizesc = new Scanner(System.in);
        arrsize = sizesc.nextInt();

        int[] arr1 = new int[arrsize];
        int[] arr2 = new int[arrsize];



            System.out.println("Enter" + arrsize + "values for Firstarray");
            for (int i = 0; i < arrsize; i++) {
                System.out.println("Enter index[" + i + "]value for Firstarray");
                Scanner arr1sc = new Scanner(System.in);
                arr1[i] = arr1sc.nextInt();

            }
            System.out.println("Enter" + arrsize + "values for Secondarray");
            for (int i = 0; i < arrsize; i++) {
                System.out.println("Enter index[" + i + "]value for Secondarray");
                Scanner arr2sc = new Scanner(System.in);
                arr2[i] = arr2sc.nextInt();
            }


            for (int i = 0; i < arrsize; i++) {
                int result = arr1[i] * arr2[i];
                System.out.println("Multiplication of Array is " + result);
            }


        }
    }
