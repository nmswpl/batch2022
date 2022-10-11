package in.co.nmsworks.Excersice3;

import java.util.*;

import static java.util.Map.*;

public class NumberOfOccurance
{
    public static void numberOfOccurance(List<Integer> orglist,List<Integer> duplist) {
        Map<Integer, Integer> mymap = new HashMap<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> four = new ArrayList<>();
        List<Integer> five = new ArrayList<>();
        for (int i : orglist) {
            int count = 0;
            for (int j : orglist) {
                if (i == j) {
                    count++;

                }
            }
            mymap.put(i, count);

        }
        System.out.println("\n");
        System.out.println("Count : "+mymap);

        Map<Integer,List<Integer>> ansmap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            if(entry.getValue() == 1)
            {
                one.add(entry.getKey());
                ansmap.put(entry.getValue(), one);
            }
            else if (entry.getValue() == 2)
            {
                two.add(entry.getKey());
                ansmap.put(entry.getValue(), two);
            }
            else if (entry.getValue() == 3)
            {
                three.add(entry.getKey());
                ansmap.put(entry.getValue(), three);
            }
            else if (entry.getValue() == 4)
            {
                four.add(entry.getKey());
                ansmap.put(entry.getValue(),four);

            }
            else
            {
                five.add(entry.getKey());
                ansmap.put(entry.getValue(),five);

            }

        }
        System.out.println("\n");
        System.out.println("One time  = "+ansmap.get(1));
        System.out.println("\n");
        System.out.println("Two time  = "+ansmap.get(2));
        System.out.println("\n");
        System.out.println("Three time  = "+ansmap.get(3));
        System.out.println("\n");
        System.out.println("Four time  = "+ansmap.get(4));
        System.out.println("\n");
        System.out.println("Others   = "+ansmap.get(5));
        System.out.println("\n");


    }
}
