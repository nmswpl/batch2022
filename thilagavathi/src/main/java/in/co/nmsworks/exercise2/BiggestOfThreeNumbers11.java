//a program for to print the largest of three numbers(11)

package in.co.nmsworks.exercise2;

public class BiggestOfThreeNumbers11 {
    public static void main(String[] args) {

                int n1 = 12, n2 = 24, n3 = 5;

                if (n1 >= n2 && n1 >= n3)
                    System.out.println(n1 + " is the largest number.");

                else if (n2 >= n1 && n2 >= n3)
                    System.out.println(n2 + " is the largest number.");

                else
                    System.out.println(n3 + " is the largest number.");
            }
        }

