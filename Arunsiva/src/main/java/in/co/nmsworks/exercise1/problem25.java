package in.co.nmsworks.exercise1;

//Write a program to count vowels, consonants, digits, and spaces

public class problem25
{
    public static void main(String[] args)
    {
        int V = 0, C = 0, D = 0, S = 0;
        String str = "this website is aw3som3.";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                V++;
            }
            else if (ch>='a' && ch<='z')
            {
              C++;
            } else if (ch>='0' && ch<='9')
            {
                D++;
            } else if (ch==' ' )
            {
                S++;
            }
        }
        System.out.println("No of Vowels are "+V);
        System.out.println("No of Consonants are "+C);
        System.out.println("No of Digits are "+D);
        System.out.println("No of spaces are "+S);
    }
}
