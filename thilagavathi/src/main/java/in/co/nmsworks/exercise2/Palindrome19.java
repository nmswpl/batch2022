//program for palindrome or not(19)
//input:str=level.abc;

package in.co.nmsworks.exercise2;

public class Palindrome19 {
    public static void main(String[] args) {

                //String str = "level", reverseStr = "";
                 String str = "abc", reverseStr = "";

                int strLength = str.length();

                for (int i = (strLength - 1); i >=0; --i) {
                    reverseStr = reverseStr + str.charAt(i);
                }

                if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                    System.out.println(str + " is a Palindrome String.");
                }
                else {
                    System.out.println(str + " is not a Palindrome String.");
                }
            }
        }

