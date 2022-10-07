package in.co.nmsworks.excersise;

public class AlphabetVowelOrConstant
{
    public static void main(String[] args)
    {
       char checkWord = 's';
       if( checkWord == 'a'|| checkWord =='e'|| checkWord =='i'||checkWord=='o'||checkWord=='u')
       {
           System.out.println(checkWord+" is vowels");
       }
       else
       {
           System.out.println( checkWord+" is a constant");
       }
    }
}
