package in.co.nmsworks.Excersice2;

public class ReversingArray {

    //14. Given an array of String, Write a Program to reverse the array and print.
    //For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}

    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "c", "d"};

        for(int i= arr.length-1;i>=0 ;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
