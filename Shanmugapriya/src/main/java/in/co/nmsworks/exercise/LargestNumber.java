package in.co.nmsworks.training.program.exercise;

public class LargestNumber {
    public static void main(String[] args) {

        int[] numbers = {2, 23, 20};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j] )
                {
                    int temp = numbers[i];
                    numbers[i]= numbers[j];
                    numbers[j]=temp;

                }
            }
        }
        System.out.println(numbers[0]+" is larger");
    }
}