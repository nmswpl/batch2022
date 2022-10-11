package in.co.nmsworks.exercise3;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class DuplicateNumber {





    public static void duplicateNumber(@NotNull List<Integer> list) throws Exception {

        // int value = 1;
        Set<Integer> uniq = new HashSet<>();
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (uniq.contains(list.get(i))) {
                System.out.println(list.get(i));
                count++;
            } else {
                uniq.add(list.get(i));

            }
        }
        // System.out.println("Duplicate count is : " + count);
    }

}