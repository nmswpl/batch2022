package in.co.nmsworks.training.excercise1;

public class CountVowelsConsonantsDigitsAndSpaces
{
    public static void main(String[] args)
    {
     String str = "This is aw3som3 7";
     String  mystr = str.toLowerCase();
     int vowelsCount =0, consonantsCount = 0, numberCount = 0, spaceCount = 0;
     for(int i=0; i < mystr.length(); i++)
     {
          int ch = mystr.charAt(i);

          if(ch == 'a' | ch == 'e'| ch == 'i'| ch == 'o'| ch == 'u')
          {
              vowelsCount++;
          } else if (ch == ' ')
          {
            spaceCount++;
          }
          else if( ch >= '0' && ch <= '9')
          {
              numberCount++;
          }
          else if( ch >= 'a' && ch <= 'z')
          {
              consonantsCount++;
          }
     }
        System.out.println("Number count in string : " +numberCount);
        System.out.println("Consonant count in string : " +consonantsCount);
        System.out.println("Spaces count in string :" +spaceCount);
        System.out.println("Vowels count in string :" +vowelsCount);
    }

}
