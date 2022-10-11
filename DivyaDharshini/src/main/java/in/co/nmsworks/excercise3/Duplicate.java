package in.co.nmsworks.excercise3;
import java.util.ArrayList;
import java.util.List;
public class Duplicate {
    public List<Integer> duplicateFile(List<Integer> a1) {
        List<Integer> a = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        int count=0;
        for (int i : a1) {
            if (integers1.contains(i)) {
                a.add(i);
                count=count+1;
            } else {
                integers1.add(i);
            }
        }
        System.out.println("\nDuplicates :");
        System.out.print(count);
        return a;
    }
}

