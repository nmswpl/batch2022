package in.co.nmsworks.exercisetwo;

public class EvenElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int evenCount = 0;
        for(int i:arr)
        {
            if(i%2==0) {
                System.out.println(i);
                evenCount++;
            }
        }
        System.out.println(evenCount+" Even Elemnets");
    }
}
