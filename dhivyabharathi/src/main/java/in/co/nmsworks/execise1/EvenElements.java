package in.co.nmsworks.execise1;
//15. Given an array of integers, Write a Program to count and print even elements
public class EvenElements {
    public static void main(String[] args) {
        int CheckArray[] = {3,4,5,6,8,50};
        int count = 0;

        for (int i = 0; i < CheckArray.length; i++)
        {
            if(CheckArray[i]%2 == 0)
            {
                count++;
            }
        }
        System.out.println("Even Elements are : "+count);
    }
}
