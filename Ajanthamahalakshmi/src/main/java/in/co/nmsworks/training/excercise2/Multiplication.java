//6. Write a program to print the multiplication table of 17 upto 10 numbers.
// Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170
package in.co.nmsworks.training.excercise2;

public class Multiplication {
    public static void main(String[] args) {

        for(int i =1;i<11;i++)
        {
            int res = i * 17;
            System.out.println("17 x"+i+ "="+res);
        }

    }
}
