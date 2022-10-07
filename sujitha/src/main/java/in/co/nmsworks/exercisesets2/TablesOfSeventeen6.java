/*6. Write a program to print the multiplication table of 17 upto 10 numbers.
Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170*/
package in.co.nmsworks.exercisesets2;

public class TablesOfSeventeen6 {
    public static void main(String[] args) {
        int result;

        for(int i=1;i<=10;i++)
        {
            result = i*17;
            System.out.println("17*"+i+"="+result);
        }
    }
}
