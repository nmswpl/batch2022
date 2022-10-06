// 9. Write a program to Find Largest Among three numbers using if..else statement
public class Program9 {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 21;
        int num3 = 1;
        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 Max = "+num1);
            }
            else{
                System.out.println("num3 Max = "+ num3);
            }
        }
        else if(num2 > num3){
            System.out.println("num2 Max = "+num2);
        }
        else{
            System.out.println("Max num3" + num3);
        }
    }
}
