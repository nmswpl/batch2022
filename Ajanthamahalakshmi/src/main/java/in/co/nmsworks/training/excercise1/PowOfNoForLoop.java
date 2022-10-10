package in.co.nmsworks.training.excercise1;

public class PowOfNoForLoop {
    public static void main(String[] args)
    {

        int baseNo = 2;
        int pow = 3;
        int res = 1;
        for(int i=1; i <= pow; i++)
        {

            res = res * baseNo;

        }
        System.out.println("Answer is : " +res );
    }

}
