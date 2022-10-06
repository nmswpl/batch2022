public class problem13 {
    //Write a program to Find Factorial of a number using for loop

    public static void main(String[] args) {
        int num=5;
        int fact=1;
         for(int i=1;i<=num;i++){
             fact=fact*i;
         }
        System.out.println(fact+" is a factorial of number "+num);
    }
}
