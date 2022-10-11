package in.co.nmsworks.excercise3;
import java.util.ArrayList;
import java.util.List;
public class Duplicate {
    public List<Integer> duplicateFile(List<Integer> a1) {
        List<Integer> a = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        for (int i : a1) {
            if (integers1.contains(i)) {
                a.add(i);
            } else {
                integers1.add(i);
            }
        }

        return a;
    }
}

