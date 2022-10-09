package in.co.nmsworks.excersice2;

public class ElementPosition {
    //4. Write a program to print the position of given element in an array. If not present, print -1
    //E.g : Input : arr = {7, 15, 41}
    //Search Element : 41 Output : 2;
    //Search Element : 5 Output : -1

    public static void main(String[] args) {
        int[] arr = {7, 15, 41};
        int search = 41;
        int index = -1, i = 0;


        while (i < arr.length) {
            if (search == arr[i]) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println("POSITION = "+index);
    }
}

