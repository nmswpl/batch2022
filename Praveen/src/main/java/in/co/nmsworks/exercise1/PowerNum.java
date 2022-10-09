//Calculate the power of a number using a for loop
public class PowerNum {
    public void printPow(int n,int e)
    {
        int m=1;
        for (int i = 1; i <=e; i++)
        {
            m=m*n;

        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        PowerNum exe19=new PowerNum();
        exe19.printPow(2,3);
    }
}
