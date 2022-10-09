package in.co.nmsworks.exercise2;
//program to print the biggest of the 3 numbers
public class BiggestNum {
    public void printNum(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
        {
            System.out.println("Biggest Number is:"+num1);
        } else if (num2>num1 && num2>num3)
        {
            System.out.println("Biggest Number is:"+num2);
        }
        else
        {
            System.out.println("Biggest Number is:"+num3);
        }
    }

    public static void main(String[] args) {
        BiggestNum biggestNum=new BiggestNum();
        biggestNum.printNum(22,15,34);
    }
}
