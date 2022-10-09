package in.co.nmsworks.excersice2;

public class EndWithSeven {

    //10. Write a program to print all numbers between 200 and 500 ending with 7.

    public static void main(String[] args) {

        for(int i=200;i<500;i++)
        {
            int n = i%10;
            if(n==7)
                System.out.println(i);
        }
    }
}
