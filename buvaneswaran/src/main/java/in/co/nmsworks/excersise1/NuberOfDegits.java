package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class NuberOfDegits
{
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int num=s.nextInt();s.nextLine();
        int num=5000;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Number of digit :" + count);
    }
}
