//package in.co.nmsworks.training.exercise1;

import java.util.Scanner;

//public class Test {
//
//
//    public class Test1
//    {
//        public  void EnterNum()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the number : ");
//            int a= sc.nextInt();
//            System.out.println("you entered no is : " + a);
//
//        }
//        //---------------------------------------------------------
//        public static void Addition()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the two numbers : ");
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//
//            int sum;
//            sum=a+b;
//            System.out.println("The sum is : "+ sum);
//        }
//        //---------------------------------------------------------
//        public static void FloatingPoint()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the float numbers : ");
//            float a= sc.nextFloat();
//            float b= sc.nextFloat();
//
//            //double a= 1.0;
//            //  double b=3.0;
//
//            // double multiply;
//            float multiply;
//            multiply  =a * b;
//            System.out.println("The product is : "+ multiply);
//
//        }
//        //----------------------------------------------------------------
//
//        public static void Swapping()
//        {
//            double a=1.2;
//            double b=2.45;
//            double c;
//            System.out.println("--Before Swap--");
//            System.out.println("First Number is :"+ a);
//            System.out.println("Second Number is :"+ b);
//            c=a;
//            a=b;
//            b=c;
//            System.out.println("----After Swap----");
//            System.out.println("First Number is :"+ a);
//            System.out.println("Second Number is :"+ b);
//
//        }
//
//        public static void oddOrEven()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the numbers : ");
//            int a= sc.nextInt();
//            if(a %2==0) {
//                System.out.println(a + " is even number");
//            }
//            else {
//                System.out.println(a + " is odd number");
//            }
//        }
//
//        public static void largestAmongThreeNum()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the numbers : ");
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            int c= sc.nextInt();
//
//            if(a>b && a>c)
//            {
//                System.out.println("a is largest");
//            }
//            else if(b>a && b>c)
//            {
//                System.out.println("b is largest");
//            }
//            else {
//                System.out.println("c is largest");
//            }
//
//        }
//
//        public static void postiveOrNegative()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the numbers : ");
//            int a= sc.nextInt();
//            if(a>0)
//            {
//                System.out.println("Number is Positive");
//            }
//            else if(a<0)
//            {
//                System.out.println("Number is Negative");
//            }
//            else {
//                System.out.println("Number is Zero");
//            }
//
//        }
//
//        public static void vowelOrConsonant()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("alphabet is");
//            char ch= sc.next().charAt(0);
//            if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'||ch =='A' || ch =='E' ||ch =='I' ||ch =='O' ||ch =='U')
//            {
//                System.out.println( ch + " is vowel ");
//            }
//            else {
//                System.out.println(ch + " is Consonant ");
//            }
//
//        }
//        public static void ASCIIValue() {
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the character is : ");
//            char ch = sc.next().charAt(0);;
//            int ascii=(int) ch;
//
//            //String b=(int)ch;
//            System.out.println("ASCII value of ch is :"+ ascii);
//        }
//
//        public static void SumOfNaturalNumber()
//        {
//            int sum=0;
//
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the number : ");
//            int a= sc.nextInt();
//            for(int i=0;i<=a;i++)
//            {
//                sum=sum+i;
//            }
//            System.out.println(sum);
//        }
//
//        public static void multiplicationTable()
//        {
//            int num=10;
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the number : ");
//            int a= sc.nextInt();
//            for(int i=1;i<=num;i++)
//            {
//                System.out.println(a+"*"+i+"="+a*i);
//            }
//        }
//        public static void countNumberOfDigits()
//        {
//            int count=0,num=1;
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the number : ");
//            int a= sc.nextInt();
//            while (num<=a)
//            {
//                num=a/10;
//                count++;
//            }
//            System.out.println(count);
//
//        }
//
//        public static void findOutAlphabet()
//        {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the character");
//            char ch= sc.next().charAt(0);
//            if((ch >='A' && ch <= 'Z' ) || (ch >= 'a' && ch <='z' ))
//            {
//                System.out.println( ch + " is a Alphabet ");
//            }
//            else {
//                System.out.println(ch + " not a Alphabet ");
//            }
//
//        }
//        public static void factorial()
//        {
//            int  fact=1;
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the num :");
//            int num= sc.nextInt();
//            for(int i=1;i<=num;i++)
//            {
//                fact=fact*i;
//            }
//            System.out.println("Factorial of num is :" + fact);
//
//        }
//
//        public static void factorialUsingWhileLoop()
//        {
//            int i=1, fact=1;
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the num :");
//            int num= sc.nextInt();
//            while(i<=num)
//            {
//                fact=fact*i;
//                i++;
//            }
//            System.out.println("Factorial of num is :" + fact);
//
//        }
//
//        public static void fibonacci()
//        {
//            int n1, n2, n3;
//            Scanner sc = new Scanner(System.in);
//          //  System.out.println(n1+""+n2);
//            System.out.println("Enter the num :");
//            int num = sc.nextInt();
//
//
//        }
//
//        public static void main(String[] args)
//        {
//            // EnterNum();
//            // Addition();
//            // FloatingPoint();
//            //Swapping();
//            // oddOrEven();
//            // largestAmongThreeNum();
//            //  postiveOrNegative();
//            // vowelOrConsonant();
//            // ASCIIValue();
//            //  SumOfNaturalNumber();
//            // multiplicationTable();
//            findOutAlphabet();
//            //factorial();
//            //factorialUsingWhileLoop();
//        }
//    }
//
//}
