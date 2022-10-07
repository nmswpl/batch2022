public class problem9 {
    //Write a program to Find Largest Among three numbers using if..else statement.


    public static void main(String[] args) {
        int a=10,b=70,c=20;
        if(a>=b && a>=c) {
            System.out.println(a + " is a largest number");
        }
            else if(b>=a && b>=a){
            System.out.println(b+" is a largest number");
        }
            else{
            System.out.println(c+" is a largest number");
        }
    }
}
