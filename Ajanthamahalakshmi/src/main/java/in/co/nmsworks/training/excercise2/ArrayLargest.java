package in.co.nmsworks.training.excercise2;

public class ArrayLargest {
    public static void main(String[] args) {
        int[] arr = { 1,23,3, 78};
        if (arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3])
        {
            System.out.println("Largest :"+arr[0]);
        } else if (arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3]) {
            System.out.println("Largest :"+arr[1]);
        } else if (arr[2] > arr[0] && arr[2] > arr[1] && arr[2] > arr[3]) {
            System.out.println("Largest :"+arr[2]);
        }
        else {
            System.out.println("Largest :"+arr[3]);
        }

    }
}
