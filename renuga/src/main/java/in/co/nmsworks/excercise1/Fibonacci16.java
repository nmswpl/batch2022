package in.co.nmsworks.excercise1;

public class Fibonacci16 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1,n3,count=10;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println( n3);
            n1=n2;
            n2=n3;
        }
    }
}
