package in.co.nmsworks.excersise;

public class VowelsDigitsAndSpaces
{
    public static void main(String[] args)
    {
        String s = "this website is aw3som3.";
        int vowelCount = 0;
        int constantCount = 0 ;
        int digitsCount = 0;
        int spaceCount = 0;
        for(int i=0;i<s.length();i++)
        {
            char temp =s.charAt(i);
            if(temp =='a' || temp =='e'||temp =='i'||temp =='o'||temp =='u')
                vowelCount++;
            else if (Character.isDigit(temp))
                digitsCount++;
            else if (temp==' ')
                spaceCount++;
            else
                constantCount++;
        }
        System.out.println("no of vowels = "+vowelCount);
        System.out.println("no of constant = "+constantCount);
        System.out.println("no of digit = "+digitsCount);
        System.out.println("no of space = "+spaceCount);


    }
}
