// 3. Write a program to multiply two arrays of same size element-by-element.
package in.co.nmsworks.exercise2;

public class Program3 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,1};
        int[] arr2 = {3,5,7};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(i==j){
                    sum = arr1[i]*arr2[j];
                }
            }
            System.out.print(sum + " ");
        }
    }
}
