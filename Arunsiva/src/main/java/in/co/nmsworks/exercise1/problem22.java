package in.co.nmsworks.exercise1;

//Write a program to find Factors of a Positive Integer

public class problem22 {
    public static void main(String[] args) {
        int num=60;
        System.out.print("The factors of "+num+" is = ");

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }

    }
}
