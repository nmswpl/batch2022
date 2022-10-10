/*10. Write a program to print all numbers between 200 and 500 ending with 7.

 */



package in.co.nmsworks.exercise2;

public class PrintNoLastNumber7
{
    public static void main(String[] args) {

        int result=0;
        for (int i = 200; i <= 500; i++)
        {
            result=i%10;
            if(result==7)
            {
                System.out.println(i);
            }
        }
    }
}
