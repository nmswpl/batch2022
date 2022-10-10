package in.co.nmsworks.training.excercise1;

public class CountNoOfDigitsWhileLoop {
    public static void main(String[] args)
    {
        int num = 1524;
        int count = 0;

        while(num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("No of Digits Count :"+count);
    }
}
