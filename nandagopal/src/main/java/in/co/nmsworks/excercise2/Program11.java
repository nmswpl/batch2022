package in.co.nmsworks.excercise2;
// print the biggest of the 3 numbers
public class Program11 {
    public static void main(String[] args) {
        int n1 = 300;
        int n2 = 200;
        int n3 = 100;

        int max = Math.max(Math.max(n1, n2), n3);
        System.out.println(max);
    }
}
