/*4. Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2*/
package in.co.nmsworks.exercisesets2;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOfElement {
    public static void main(String[] args) {
      int[] array={4,65,21,62,5};
      int element=62;
      for(int i=0;i< array.length;i++)
      {
          if(array[i]==element)
          {
              System.out.println("position is "+i);
          }
      }
    }
}
