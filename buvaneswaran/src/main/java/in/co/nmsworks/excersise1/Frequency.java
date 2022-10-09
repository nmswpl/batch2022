package in.co.nmsworks.excersise1;

public class Frequency
{
    public static void main(String[] args) {
        String str= "This website is awesome";
        char ch='e';
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if(ch==(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
