package in.co.nmsworks.exercisetwo;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurance {
    public static void main(String[] args) {
        int[]  arr = {1, 2, 3, 2, 2, 3};
        int find  = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map.get(find)+" times");
    }
}
