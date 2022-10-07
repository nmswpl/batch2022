package in.co.nmsworks.excersise;


import java.util.Scanner;

public class BasicProgram
{

    public static void main(String[] args)
    {
        BasicProgram obj = new BasicProgram();
        Scanner scannerClassObjName = new Scanner(System.in);
        System.out.println("======================================\n1.read data from user\n2.add two nu ber");
        int programCall=scannerClassObjName.nextInt();
       switch (programCall)
       {
           case (1): {
               obj.readValueFromUser(); //data read from the user program using methods
           }
           case (2):
           {
               obj.addTwoInt();//adding two number program
           }
       }
    }
    public void readValueFromUser()
        {
            Scanner scannerClassObjName = new Scanner(System.in);
            System.out.println("Enter the number");
            int readValue= scannerClassObjName .nextInt();
            System.out.println(readValue);
        }
    public void  addTwoInt()
    {
        Scanner scannerClassObjName  = new Scanner(System.in);
        System.out.println("Enter the number first value");
        int a= scannerClassObjName .nextInt();
        System.out.println("Enter the number sec value");
        int b=scannerClassObjName.nextInt();
        a+=b;
        System.out.println("the added value  "+a);
    }
}
