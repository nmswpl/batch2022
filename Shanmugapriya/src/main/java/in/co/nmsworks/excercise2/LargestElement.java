package in.co.nmsworks.excercise2;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 20, 14};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(numbers[0] + " is greater");

    }
}