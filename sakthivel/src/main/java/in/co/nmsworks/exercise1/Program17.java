package in.co.nmsworks.exercise1;

public class Program17
{
    public static void frequencyOfACharacter()
    {
        String str="This website is awesome.";
        int count=0;
        char ch='e';
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of " + ch +"="+count);
    }

    public static void main(String[] args)
    {
        frequencyOfACharacter();
    }
}
