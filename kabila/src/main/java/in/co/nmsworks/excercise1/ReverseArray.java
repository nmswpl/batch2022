package in.co.nmsworks.excercise1;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
       int i= arr1.length-1;
       while (i>=0)
       {
           System.out.println(arr1[i]);
           i = i -1;
       }

    }
}
