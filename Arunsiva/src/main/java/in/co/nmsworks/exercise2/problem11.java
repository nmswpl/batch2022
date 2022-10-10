package in.co.nmsworks.exercise2;
//Write a program to print the biggest of the 3 numbers

public class problem11
{
    public static void main(String[] args)
    {
        int a=18,b=18,c=35;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if (c>=a && c>=b)
        {
            System.out.println(c);
        }
        else {
            System.out.println(b);
        }
    }
}
