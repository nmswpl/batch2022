package in.co.nmsworks.excercise1;

public class Frequency24 {
    public static void main(String[] args) {
        String str = "Hello World!";
        char ch = 'l';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                frequency++;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
