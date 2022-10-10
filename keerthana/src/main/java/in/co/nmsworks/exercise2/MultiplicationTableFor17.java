/*6. Write a program to print the multiplication table of 17 upto 10 numbers.
Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170

 */


package in.co.nmsworks.exercise2;

public class MultiplicationTableFor17
{
    public static void main(String[] args)
    {
        int num = 0;
        for(int i=1;i<=10;i++)
        {
            num=17*i;
            System.out.println("17 * "+i+" = "+num);
        }

    }
}
