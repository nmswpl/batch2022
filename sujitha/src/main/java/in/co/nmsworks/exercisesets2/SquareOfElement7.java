/*7.Write a program to print the square of every element present in the array.
E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25*/
package in.co.nmsworks.exercisesets2;

public class SquareOfElement7 {
    public static void main(String[] args) {
        int[] arr1={2,4,3,5};
        int squareOfFirstElement=arr1[0]*arr1[0];
        int squareOfSecondElement=arr1[1]*arr1[1];
        int squareOfThirdElement=arr1[2]*arr1[2];
        int squareOfFourthElement=arr1[3]*arr1[3];
        System.out.println("output : "+squareOfFirstElement+" "+squareOfSecondElement+" "+squareOfThirdElement+" "+squareOfFourthElement);
    }
}
