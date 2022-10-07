// 16. Display Fibonacci Series Using for Loop
public class Program16 {
    public static void main(String[] args) {
        int first = -1;
        int second = 1;
        int third;
        System.out.println("Fibonacci series till 10 terms: ");
        for(int i=1;i<=10;i++){
            third = first + second;
            System.out.print(third + ",");
            first = second;
            second = third;
        }
    }
}
