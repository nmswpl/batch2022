package in.co.nmsworks.excercise1;

public class SumOfNaturalNumbers {
        public static void main(String[] args)
        {
            int num = 100, sum = 0;
            for(int i = 1; i <= num; ++i)
            {
                sum = sum + i;
            }
            System.out.println("Sum of Natural Numbers : " + sum);
        }
}

