package in.co.nmsworks.training.program.exercise;

public class swapping
{
    public static void main(String[] args) {
        double num1 = 1.2;
        double num2 = 2.45;
        double temp = 0;
        System.out.println("Before Swapping");
        System.out.println("First Number :"+num1);
        System.out.println("Second Number :"+num2);

        temp=num1;
        num1=num2;

        System.out.println("After Swapping");

        System.out.println("First number :"+num1);
        System.out.println("Second number :"+temp);

    }
}
