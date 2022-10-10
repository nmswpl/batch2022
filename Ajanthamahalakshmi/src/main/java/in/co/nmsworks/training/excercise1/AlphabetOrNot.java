package in.co.nmsworks.training.excercise1;

public class AlphabetOrNot {
    public static void main(String[] args)
    {
    char ch = '*';
        System.out.println((int) ch);
        if( (((int)ch > 64 )&& ( (int) ch < 97)) | (((int)ch > 89 )&& ( (int) ch <= 122)))
        {
            System.out.println(ch+" is Alphabet");
        }
        else
        {
            System.out.println(ch+ " is not Alphabet");
        }
    }
}
