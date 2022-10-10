//program for product of the two arrays(3)
//input:arr1={2,4,1}  arr2={3,5,7}

package in.co.nmsworks.exercise2;

import java.util.Arrays;

public class ProductOfArray3 {
    public static void main(String[] args) {
                String result = "";
                int[] left_array = {2, 4, 1};
                int[] right_array = {3, 5, 7};
                System.out.println("Array1: "+Arrays.toString(left_array));
                System.out.println("Array2: "+Arrays.toString(right_array));
                for (int i = 0; i < left_array.length; i++) {
                    int num1 = left_array[i];
                    int num2 = right_array[i];
                    result += Integer.toString(num1 * num2) + " ";
                }
                System.out.println("Result: "+result);
            }
        }






