package in.co.nmsworks.exercise1;

//Count Number of Digits in an Integer using while loop

public class problem18 {
    public static void main(String[] args) {
        int number=12343565, count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        System.out.println("Number of Digits are "+count);
    }
}
