package in.co.nmsworks.exercise2;
//a program to print the multiplication table of 17 upto 10 numbers.
//Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170
public class Workout6 {
    public static void main(String[] args) {

        int no = 17;
        for (int i = 1; i <= 10; i++)
        {
            int mul = no * i;
            System.out.println("17 * " +i +" = " +mul);
        }
    }
}
