package in.co.nmsworks.excercise;

public class Count {
    //25. Write a program to count vowels, consonants, digits, and spaces
    public static void main(String[] args) {
        String str="This website is aw3som3.";

        int vowels=0,consonants=0, digits=0, space=0;
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vowels++;
            }
            else if ((c>='a'&&c<='z') ||( c>='A' && c<='Z' ))
            {
                consonants++;
            }
            else if(c>=0||c<=9)
            {
                digits++;

            }
            else if(str.charAt(i)==' ')
                space++;
        }


        System.out.println("Vowels = " +vowels+"\nConsonant  = "+consonants+"\nDigits  = "+digits+
                "\nSpace  = "+space);
    }

}
