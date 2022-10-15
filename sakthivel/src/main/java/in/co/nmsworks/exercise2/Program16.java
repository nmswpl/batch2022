package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program16
{
  public static void squareOfAnGivenArray()
    {
//        int square=0;
//        int[] arr = {2, 4, 3, 5};
//        for (int i=0;i<=arr.length;i++)
//        {
//            square=i*i;
//
//        }
//        System.out.println(square);


//       public class FibonacciSeries {
//    public static void main(String[] args) {
//        int n1 = -1 , n2 =1 , n3;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter no");
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++)
//        {
//            n3 = n1+n2;
//            n2 = n3;
//            n1 = n2;
//            System.out.println("Fibonacci series : "+n3);
//        }
//
//
//    }


                int n1 = -1 , n2 =1 , n3;
                Scanner in = new Scanner(System.in);
                System.out.println("Enter no");
                int n = in.nextInt();
                for (int i = 0; i < n; i++)
                {
                    n3 = n1+n2;
                    n2 = n3;
                    n1 = n2;
                    System.out.println("Fibonacci series : "+n3);
                }


            }

    public static void main(String[] args)
    {
        squareOfAnGivenArray();
    }
}
