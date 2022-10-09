package in.co.nmsworks.excercise2;
//16. Write a program using Recursion to find and print the factorial of a number.
public class problem16 {
    static int fact(int num)
    {
     if(num==0){
         return 1;
     }
     else{
         return num*fact(num-1);
     }
    }
    public static void main(String[] args)
    {
        int num=5;
        System.out.println(fact(num));
    }
}
