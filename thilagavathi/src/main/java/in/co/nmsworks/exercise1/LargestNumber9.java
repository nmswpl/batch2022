package in.co.nmsworks.exercise1;

public class LargestNumber9 {
    public static void main(String[] args) {
        int n1=6, n2=12, n3=9;
        if((n1>=n2) && (n1>=n3)){
            System.out.println(n1+ " is a largest number");
        }
        else if ((n2>=n3) && (n2>=n1)){
            System.out.println(n2+ " is the largest number");
        }
        else{
            System.out.println(n3+ " is the largest number");
        }
    }
}
