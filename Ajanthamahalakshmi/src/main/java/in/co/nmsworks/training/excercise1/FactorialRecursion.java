package in.co.nmsworks.training.excercise1;

public class FactorialRecursion {
    public static void main(String[] args)

        {
            int num =5;

            System.out.println("result is " + recursionFact(num));
        }
        public static int recursionFact(int num)
        {
            if(num == 0)
                return 1;
            else
                return num * recursionFact(num - 1);
        }

    }

