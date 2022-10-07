package in.co.nmsworks.exercise2;

public class OddNumbersInArray {
    public static void main(String[] args) {
        int[] arr={32, 43, 4, 15};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
