package in.co.nmsworks.training.excercise2;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        int s = arr.length;
        System.out.println(arr.length);
        for(int i = s-1 ; i >= 0 ; i--)
        {
            System.out.println("Array Reverse is : "+arr[i]);
        }

    }
}
