package in.co.nmsworks.excercise1;

public class DivisibleByThree {
    public static void main(String[] args) {
        //print all numbers divisble by 3 greater than 300 and less than 400.
        for(int i=301;i<=400;i++)
        {
             if(i%3==0)
                 System.out.println(i);
        }
    }
}
