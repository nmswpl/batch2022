/*15. Generate Multiplication Table using for loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class MultiplicationTable15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the table");
        int table= sc.nextInt();
        int result;
        for(int i=1;i<=12;i++)
        {
            result=table*i;
            System.out.println(table+" * "+i+" = "+result);
        }
    }

}
