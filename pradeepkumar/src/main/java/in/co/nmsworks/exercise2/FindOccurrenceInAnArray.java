package in.co.nmsworks.exercise2;

public class FindOccurrenceInAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2,5};
        int search=2;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (search==arr[i])
            {
                count++;
            }

        }
        System.out.println(count);


    }
}
