package in.co.nmsworks.execise1;
//10. Write a program to print all numbers between 200 and 500 ending with 7
public class EndingWith_7 {
    public static void main(String[] args)
    {

        for (int i = 200;  i < 500; i++)
        {
            if(i%10==7)
            {
                System.out.println(i);
            }

        }
    }
}
