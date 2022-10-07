// 22. Write a program to find Factors of a Positive Integer
public class Program22 {
    public static void main(String[] args) {
        int number = 60;
        if(number > 0){
            System.out.print("Factors of " + number + " are: ");
            for(int i=1;i<=number;i++){
                if(number % i==0){
                    System.out.print(i + " ");
                }
            }

        }
    }
}
