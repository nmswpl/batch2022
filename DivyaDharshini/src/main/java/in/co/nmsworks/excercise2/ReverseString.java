package in.co.nmsworks.excercise2;

public class ReverseString {
        public static void main(String[] args) {
            String [] arr = new String[]{"a","b","c"};
            System.out.println("Given");
            for (String s : arr) {
                System.out.print(s);
            }
            System.out.println("\nReverse order: ");
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        }

}
