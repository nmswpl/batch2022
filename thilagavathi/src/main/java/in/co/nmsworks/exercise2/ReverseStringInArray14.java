//program for to print the reverse string in array(14)
//input:arr={"a","b","c"}

package in.co.nmsworks.exercise2;

public class ReverseStringInArray14 {
    public static void main(String[] args) {
        String [] arr = new String [] {"a", "b", "c"};
                System.out.println("Original array: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("Array in reverse order: ");
                //Loop through the array in reverse order
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }

        }

