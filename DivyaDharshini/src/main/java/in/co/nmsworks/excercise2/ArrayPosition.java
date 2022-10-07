package in.co.nmsworks.excercise2;


public class ArrayPosition {
    public static void main(String[] args) {
        int[] arr1 = {7, 15, 41};
        System.out.println("Search element 41 : " + findIndex(arr1, 41));
        System.out.println("Search element 5 : " + findIndex(arr1, 5));
    }

    public static int findIndex(int[] arr1, int i) {
        if (arr1 == null)
            return -1;
        int len = arr1.length;
        int a = 0;
        while (a < len) {
            if (arr1[a] == i)
                return a;
            else a = a + 1;
        }
        return -1;
    }

}