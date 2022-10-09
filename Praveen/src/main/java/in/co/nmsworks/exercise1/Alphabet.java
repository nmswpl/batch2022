//program to Check Alphabet using if else
public class Alphabet {
    public void printAlphabets(char c)
    {
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println(c+" is a Alphabet");
        }
        else
        {
            System.out.println(c+"is not an Alphabet");
        }
    }

    public static void main(String[] args) {
        Alphabet exe11=new Alphabet();
        exe11.printAlphabets('p');
    }
}
