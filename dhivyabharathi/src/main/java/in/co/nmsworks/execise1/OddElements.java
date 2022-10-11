package in.co.nmsworks.execise1;
//12. Given an array of integers, Write a Program to print number of odd elements.
public class OddElements {
    public static void main(String[] args) {
        int CheckArray[] = {3,4,5,6};
        int count = 0;

        for (int i = 0; i < CheckArray.length; i++)
        {
            if(CheckArray[i]%2 != 0)
            {
                count++;
            }
        }
        System.out.println("Odd Elements are : "+count);
    }
}
