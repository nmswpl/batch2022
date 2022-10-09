//program to Check if a Number is Positive or Negative using if else
public class PosNeg {

    public void printPosNeg(int number)
    {
        if(number>=0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }

    public static void main(String[] args) {
        PosNeg exe10=new PosNeg();
        exe10.printPosNeg(24);
    }
}
