//program to find Frequency of Character
public class FreqCharacter {
    public static void main(String[] args) {
        String s = "Praveen kumar 0610 ";
        int count=0;
        for (int i = 0; i <s.length() ; i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
