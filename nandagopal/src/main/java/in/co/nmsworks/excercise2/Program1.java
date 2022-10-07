package in.co.nmsworks.excercise2;
// print all even numbers between 601 and 700 in descending order
public class Program1 {
    public static void main(String[] args) {
        int n = 700;
        int m = 601;

        for(int i=n-1; i>m; i--) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
