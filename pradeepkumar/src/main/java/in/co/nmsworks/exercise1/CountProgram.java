package in.co.nmsworks.exercise1;
//count the vowel,consonant,space,numbers and special count in a string

public class CountProgram {
    public static void main(String[] args) {
        String words = "This. website is aw3so@m3";
        int vowelCount = 0;
        int consCount=0;
        int numbersCount=0;
        int spaceCount=0;
        int specialChar=0;
        String str=words.toLowerCase();
        System.out.println(str);
        for (int i = 0; i <str.length(); i++) {
//            char ch=str.charAt(i);
            if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowelCount++;

            } else if (str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                numbersCount++;


            } else if (str.charAt(i)==' ') {
                spaceCount++;


            }
//            else if (str.charAt(i)!='a' || str.charAt(i)!='e'|| str.charAt(i)!='i' ||str.charAt(i)!='o' ||str.charAt(i)!='u')
            else if (str.charAt(i)>='a' && str.charAt(i)<='z')
            {

                consCount++;

            }
            else
            {
                specialChar++;
            }

        }
        System.out.println("The vowel count =" + vowelCount);
        System.out.println("The numbers count =" + numbersCount);
        System.out.println("The space count count =" + spaceCount);
        System.out.println("The consonant count =" + consCount);
        System.out.println("The special character count =" + specialChar);
    }
}
