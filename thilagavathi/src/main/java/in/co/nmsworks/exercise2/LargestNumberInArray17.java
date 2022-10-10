package in.co.nmsworks.exercise2;

//a program for to print the largest number in array(17)
//input:arr={12,3,20,14}

public class LargestNumberInArray17 {
        public static void main(String[] args) {

            int[] arr = new int[]{12, 3, 20, 14};

            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("Largest element present in given array: " + max);
        }
    }



