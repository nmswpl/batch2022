package in.co.nmsworks.excersise2;

//Write a program to multiply two arrays of same size element-by-element.
public class MultiplyTwoArray
{
    public static void main(String[] args)
    {
        int a1[] = { 2, 5, -2, 10 };
        int a2[] = { 3, -5, 7, 1 };
        String result = "";
        for (int i = 0; i < a1.length; i++) {
            result += Integer.toString(a1[i] * a2[i]) + " ";
        }
        System.out.println(result);
    }
}
