package in.co.nmsworks.training.excercise1;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String st = " Ajanthamahalakshmi Ajuappu ";
        char ch = 'k';
        int count = 0;

        for (int i = 0; i < st.length(); i++)
        {
            int res = st.charAt(i);
            if(res == ch)
            {
                count++;
            }
        }
        System.out.println("Occurences of character "+ch+ " is "+count);
        }
}
