public class problem21 {
    //Write a program to Check Prime Number using a for loop
    
    public static void main(String[] args) {
                int n=9;
                int count=0;

                for (int i = 1; i <=n; i++)
                {
                    if (n % i == 0)
                        count++;
                }
                if(count==2)
                    {
                        System.out.println(n + " is a prime number");
                    }

                else
                {
                    System.out.println(n+ " is not a prime");
                }

            }

        }



