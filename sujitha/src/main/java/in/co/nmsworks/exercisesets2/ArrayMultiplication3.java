/*3. Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7*/
package in.co.nmsworks.exercisesets2;

public class ArrayMultiplication3
{
    public static void main(String[] args) {
        int[] arr1={2,4,1};
        int[] arr2={3,5,7};

       int output1=arr1[0]*arr2[0];
        int output2=arr1[1]*arr2[1];
        int output3=arr1[2]*arr2[2];

        System.out.println("output :"+" "+output1+" "+output2+" "+output3);


    }
}
