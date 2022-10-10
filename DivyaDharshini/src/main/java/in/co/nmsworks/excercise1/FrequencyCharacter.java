package in.co.nmsworks.excercise1;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str="This website is awesome";
        char find='e';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(find==str.charAt(i))
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
