package in.co.nmsworks.exercise2;
//program to print all numbers between 200 and 500 ending with 7.
public class EndNum {
    public void printNum()
    {
        for (int i = 200; i <500; i++)
        {
        if(i%10==7)
        {
            System.out.println(i);
        }

        }
    }

    public static void main(String[] args) {
        EndNum endNum=new EndNum();
        endNum.printNum();
    }
}
