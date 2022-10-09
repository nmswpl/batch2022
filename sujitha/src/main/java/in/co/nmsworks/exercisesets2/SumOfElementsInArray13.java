/*13. Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6*/
package in.co.nmsworks.exercisesets2;

public class SumOfElementsInArray13 {
    public static void main(String[] args) {
        int[] array={1,3,5,7,8,2,4};
        int sumOfElements=0;
        for(int i=0;i< array.length;i++)
        {
            sumOfElements+=array[i];

        }
        System.out.println("sum of elements in array "+sumOfElements);
    }
}
