package in.co.nmsworks.excercise;

public class FactorsOfPositiveInteger {
    //22. Write a program to find Factors of a Positive Integer
    public static void main(String[] args) {
        int number=60;

        for (int i=1; i<=number;i++)
            if(number%i==0)
            {
                System.out.println(i);
            }

    }
}
