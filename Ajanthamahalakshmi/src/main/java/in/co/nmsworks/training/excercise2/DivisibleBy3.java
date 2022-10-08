package in.co.nmsworks.training.excercise2;

public class DivisibleBy3 {
    public static void main(String[] args) {
        for (int i = 301; i > 300 && i < 400; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("Numbr divisble by 3 between 300 to 400 is " + i);
            }
        }
    }
}
