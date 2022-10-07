package in.co.nmsworks.excercise2;
// reverse the array and print
public class Program14 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int n = arr.length;

        for(int i=0; i<n/2; i++) {
            char temp = arr[i];
            arr[i] = arr[(n-1)-i];
            arr[(n-1)-i] = temp;
        }

        for(char c : arr) {
            System.out.print(c + " ");
        }

    }
}
