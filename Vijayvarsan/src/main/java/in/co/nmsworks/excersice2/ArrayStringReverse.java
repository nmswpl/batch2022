package in.co.nmsworks.excersice2;

public class ArrayStringReverse {
    //14. Given an array of String, Write a Program to reverse the array and print.
    //For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}

    public static void main(String[] args) {
        String[] str={"a","b","c"};
        for (int i= str.length-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
    }
}
