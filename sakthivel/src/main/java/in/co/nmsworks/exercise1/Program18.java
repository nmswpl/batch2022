package in.co.nmsworks.exercise1;

public class Program18
{
    public static void countVowelsConsonantsDigitsSpaces()
    {
        String str="This website is aw3som3.";
        int Vowelcount=0;
        int Consonentcount=0;
        int Spacecount=0;
        int Numbercount=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                Vowelcount++;
            }
            else if ((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z'))
            {
                Consonentcount++;
            }
            else if (ch==' ')
            {
                Spacecount++;
            }
            else if (ch>='0' && ch<='9')
            {
                Numbercount++;
            }
        }
        System.out.println(" Number of Vowels present :" + Vowelcount);
        System.out.println(" Number of Consonent present :" +Consonentcount);
        System.out.println("Number of Space present :"+  Spacecount);
        System.out.println("Number present :" +Numbercount);

    }

    public static void main(String[] args)
    {
        countVowelsConsonantsDigitsSpaces();
    }
}
