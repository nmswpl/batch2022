package in.co.nmsworks.Excersice2;

public class NumberEndingWith7 {

    public static void main(String[] args) {

        for(int i=200;i<500;i++)
        {
            if(i%10==7)
            {
                System.out.print(i+" ");
            }
        }
    }
}
