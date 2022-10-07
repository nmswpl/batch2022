package in.co.nmsworks.exercise2;
// program to print the hundred position value in words.
public class HundredPositionValueInWords
{
    public static void main(String[] args)
    {
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int number = 100;
        number = number/100;
        System.out.println(words[number]);
    }
}
