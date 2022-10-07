package in.co.nmsworks.exercise1;

public class practice6
{
    public static void main(String[] args)
    {
        System.out.println("--BEFORE SWAP--");
        float no1 = 1.2f;
        float no2 = 2.45f;
        float temp = 0;

        System.out.println("FIRST NUMBER = "+no1);
        System.out.println(("SECOND NUMBER = "+no2));
        System.out.println("--AFTER SWAP--");

        temp = no1;
        no1 = no2;
        no2 = temp;

        System.out.println("FIRST NUMBER = "+no1);
        System.out.println(("SECOND NUMBER = "+no2));


    }
}
