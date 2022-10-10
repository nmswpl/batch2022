package in.co.nmsworks.exercise2;
//Write a program to multiply two arrays of same size element-by-element.
public class problem3 {
    public static void main(String[] args) {
        int[] a={3,5,6};
        int[] b={2,4,10};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]*b[i]+" ");
        }
    }
}
