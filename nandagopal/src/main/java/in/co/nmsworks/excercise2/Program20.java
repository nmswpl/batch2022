package in.co.nmsworks.excercise2;
//  check whether x is Prime or not ?
public class Program20 {
    public static void main(String[] args) {
        int n = 13;

        if(n == 1) {
            System.out.println("Not Prime");
            return;
        }
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
