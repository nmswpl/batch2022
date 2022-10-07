package in.co.nmsworks.exercise1;

public class problem24 {
    public static void main(String[] args) {
        String str="hi i am arunsiva";
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
