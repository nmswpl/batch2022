//program for to print the numbers that ends with seven.
//between 300 and 500.

package in.co.nmsworks.exercise2;

public class EndWithSeven10 {
    public static void main(String[] args) {
        int n=0;
        for(int i=300; i<=500; i++){
            if(i%10==7){
                System.out.print(i+",");
            }
        }
    }
}
