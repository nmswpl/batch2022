package in.co.nmsworks.exercise2;
//print the multiplication table of 17 upto 10 numbers.
public class MultiTable {
    public static void main(String[] args) {
        int number=17;
        for (int i = 1; i <=10 ; i++) {
            int sum=number*i;
            System.out.println(number+"*"+i+"="+sum);
        }
    }
}
