package in.co.nmsworks.excercise2;

/*3. Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7 */

public class Multiple3 {
    public static void main(String[] args) {
        int arr1[] = {2,4,1};
        int arr2[] = {3,5,7};
        String result =  "";
        for(int i=0; i< arr1.length;i++){
            result += Integer.toString(arr1[i] * arr2[i]) + " ";
        }
        System.out.println(result);
    }
}