package in.co.nmsworks.excercise2;

public class FrequencyOfCharacter {
    public static void main(String[] args)
    {
        String str = "This website is awesome";
        char ch = 'i';
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (ch ==str.charAt(i))
                count++;
        }
        System.out.println("FREQUENCY OF CHARACTER "+ ch + " is " +count);
    }
}
