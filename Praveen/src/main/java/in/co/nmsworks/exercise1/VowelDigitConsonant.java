

//program to count vowels, consonants, digits, and spaces
public class VowelDigitConsonant {
        public static void main(String[] args)
        {
                int vowels=0,consonant=0,digit=0,space=0;
                String str="Praveen kumar 0610";

                for (int i = 0; i <str.length() ; i++)
                {
                        if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
                        {
                                vowels++;

                        }

                        else if ((str.charAt(i)>='a' && str.charAt(i)<='z') ||(str.charAt(i)>='A' && str.charAt(i)<='Z'))
                        {
                                consonant++;

                        }
                        else if (str.charAt(i)>='0' && str.charAt(i)<='9')
                        {
                                digit++;

                        }
                        else
                        {
                                space++;

                        }
                }
                System.out.println("Vowels="+vowels);
                System.out.println("Consonant="+consonant);
                System.out.println("digit="+digit);
                System.out.println("space="+space);
        }



        }






