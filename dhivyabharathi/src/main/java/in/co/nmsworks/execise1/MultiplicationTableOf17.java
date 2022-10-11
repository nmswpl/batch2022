package in.co.nmsworks.execise1;
//6. Write a program to print the multiplication table of 17 upto 10 numbers.
public class MultiplicationTableOf17 {
    public static void main(String[] args) {
        int TableNo = 17;
        for (int i = 1; i <=10 ; i++)
        {
            int value = TableNo*i;
            System.out.println("17 * "+i+" = "+value);
        }
    }
}
