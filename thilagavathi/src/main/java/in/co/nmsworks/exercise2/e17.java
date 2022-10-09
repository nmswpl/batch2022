package in.co.nmsworks.exercise2;

public class e17 {
        public static void main(String[] args) {

            int[] arr = new int[]{};

            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("Largest element present in given array: " + max);
        }
    }



