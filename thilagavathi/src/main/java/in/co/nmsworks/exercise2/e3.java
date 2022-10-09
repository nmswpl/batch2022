//product of the two arrays

package in.co.nmsworks.exercise2;

import java.util.Arrays;

public class e3 {
    public static void main(String[] args) {
        int num1,num2;
        String result="";
        int arr1[]={2,4,1};
        int arr2[]={3,5,7};
        System.out.println("/n arr1"+Arrays.toString(arr1));
        System.out.println("/n arr2"+Arrays.toString(arr2));
        for(int i=0; i<arr1.length; i++){
            num1=arr1[i];
            num2= arr2[i];
            result+= Integer.toString(num1*num2);
        }
        System.out.println("product of two arrays is:"+result);
    }
}

