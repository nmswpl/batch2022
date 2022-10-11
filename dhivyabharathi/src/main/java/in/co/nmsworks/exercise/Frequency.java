package in.co.nmsworks.exercise;
//24. Write a program to find Frequency of Character
public class Frequency {
    public static void main(String[] args) {
        String str="hi i am Rithika";
        char ch='a';
        int frequency=0;

        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency of the given character is : "+frequency);
    }
}
