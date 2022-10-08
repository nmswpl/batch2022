package in.co.nmsworks.exercise2;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int value=0;
        for (int i = 0; i < arr.length; i++) {

            value=arr[i]+arr[i];
        }
        System.out.println(value);
    }
}
