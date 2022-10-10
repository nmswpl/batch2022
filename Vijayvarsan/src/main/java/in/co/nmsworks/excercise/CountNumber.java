package in.co.nmsworks.excercise;

public class CountNumber {
    //18. Count Number of Digits in an Integer using while loop
    public static void main(String[] args) {

    int number=123456, count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        System.out.println("Number of Digits are "+count);
    }
}
