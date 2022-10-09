package in.co.nmsworks.excersice2;

public class Multiplication {
    //6. Write a program to print the multiplication table of 17 upto 10 numbers.
    //Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170

    public static void main(String[] args) {
        int tab=17;
        for (int i=1; i<=10;i++)
        {
            int value=tab*i;
            System.out.println(tab+"X"+i+"="+value);
        }
    }
}
